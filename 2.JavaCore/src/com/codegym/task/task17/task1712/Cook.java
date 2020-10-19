package com.codegym.task.task17.task1712;

public class Cook implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || needToCookOrders()) {
            try {
                synchronized (this) {
                    needToWait = !needToCookOrders();
                    if (!needToWait) {
                        cook();
                    }
                }
                if (continueWorking && needToWait) {
                    System.out.println("The cook is resting");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean needToCookOrders() {
        return !Manager.getInstance().getOrderQueue().isEmpty();
    }

    private void cook() throws InterruptedException {
        Manager manager = Manager.getInstance();
        Order order = manager.getOrderQueue().poll();      // The cook takes an order from the queue
        System.out.println(String.format("The order will be prepared in %d ms for table %d", order.getTime(), order.getTableNumber()));
        Thread.sleep(order.getTime());     // Prepare the dish
        Dish dish = new Dish(order.getTableNumber());       // This is a prepared dish
        System.out.println(String.format("The order for table %d is ready", dish.getTableNumber()));
        manager.getDishQueue().add(dish);
    }
}
