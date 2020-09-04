package com.codegym.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Manager {      // Singleton
    private static Manager ourInstance = new Manager();

    private final List<Table> restaurantTables = new ArrayList<>(10);
    private int currentIndex = 0;

    private final Queue<Order> orderQueue = new ConcurrentLinkedQueue<>();        // Order queue
    private final Queue<Dish> dishQueue = new ConcurrentLinkedQueue<>();     // Prepared dish queue

    public synchronized static Manager getInstance() {
        return ourInstance;
    }

    private Manager() {               // Create 10 tables
        for (int i = 0; i < 10; i++) {
            restaurantTables.add(new Table());
        }
    }

    public synchronized Table getNextTable() {           // The waiter walks in a circle from Table 1 to 10
        Table table = restaurantTables.get(currentIndex);
        currentIndex = (currentIndex + 1) % 10;
        return table;
    }

    public Queue<Order> getOrderQueue() {
        return orderQueue;
    }

    public Queue<Dish> getDishQueue() {
        return dishQueue;
    }
}
