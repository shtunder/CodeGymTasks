package com.codegym.task.task17.task1715;

import java.util.HashMap;
import java.util.Map;

public class DrugController {
    public static Map<Drug, Integer> allDrugs = new HashMap<>();   // <Drug, Amount>

    static {
        Drug acetaminophen = new Drug();
        acetaminophen.setName("Acetaminophen");
        allDrugs.put(acetaminophen, 5);

        Drug metamizole = new Drug();
        metamizole.setName("Metamizole");
        allDrugs.put(metamizole, 18);

        Drug placebo = new Drug();
        placebo.setName("Placebo");
        allDrugs.put(placebo, 1);
    }

    public synchronized void buy(Drug drug, int count) {
        String name = Thread.currentThread().getName();
        if (!allDrugs.containsKey(drug)) {
            System.out.println("Out of stock");
        }
        Integer currentCount = allDrugs.get(drug);
        if (currentCount < count) {
            System.out.println(String.format("%s wants %d tablets of %s. In stock: %d", name, count, drug.getName(), currentCount));
        } else {
            allDrugs.put(drug, (currentCount - count));
            System.out.println(String.format("%s bought %d tablets of %s. Remaining: %d", name, count, drug.getName(), (currentCount - count)));
        }
    }

    public synchronized void sell(Drug drug, int count) {
        System.out.println(Thread.currentThread().getName() + " purchased: " + count + " " + drug.getName());
        if (!allDrugs.containsKey(drug)) {
            allDrugs.put(drug, 0);
        }
        Integer currentCount = allDrugs.get(drug);
        allDrugs.put(drug, (currentCount + count));
    }
}
