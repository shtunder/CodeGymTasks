package com.codegym.task.task13.task1328;

public final class BodyPart {
    final static BodyPart LEG = new BodyPart("leg");
    final static BodyPart HEAD = new BodyPart("head");
    final static BodyPart ARM = new BodyPart("hand");
    final static BodyPart CHEST = new BodyPart("chest");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}
