package com.codegym.task.task17.task1714;

/* 
Comparable

*/

public class Beach implements Comparable<Beach> {
    private String name;
    private float distance;
    private int quality;

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach one = new Beach("One", 2.0f, 8);
        Beach two = new Beach("Two", 1.5f, 4);
        int i = one.compareTo(two);
        System.out.println(i);
    }

    @Override
    public synchronized int compareTo(Beach o) {
        return (int)(this.quality/this.distance - o.getQuality()/o.getDistance());
    }
}
