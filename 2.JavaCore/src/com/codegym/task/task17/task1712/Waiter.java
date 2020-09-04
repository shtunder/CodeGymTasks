package com.codegym.task.task17.task1712;

public class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        Manager manager = Manager.getInstance();

        while (continueWorking || !manager.getDishQueue().isEmpty()) {
            if (!manager.getDishQueue().isEmpty()) {       // Bring out the prepared dish
                Dish dish = manager.getDishQueue().poll();
                System.out.println("The waiter delivered the order for table " + dish.getTableNumber());
            } else {                                         // Take a new order
                Table table = manager.getNextTable();
                Order order = table.getOrder();
                System.out.println("An order was received from table " + order.getTableNumber());
                manager.getOrderQueue().add(order);
            }
            try {
                Thread.sleep(100);  // Walking to the next table
            } catch (InterruptedException ignored) {
            }
        }
    }
}
