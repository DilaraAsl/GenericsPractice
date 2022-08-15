package com.cydeo;

public class PointTester {
    public static void main(String[] args) {
        Double dblx = new Double(1.5);
        Double dbly = new Double(2.5);
        Point<Double> dPoint = new Point<>(dblx, dbly);


        Integer intX = new Integer(5);
        Integer intY = new Integer(5);
        Point<Integer> intPoint = new Point<>(intX, intY);

        System.out.println("X coordinate: " + dPoint.getXCoordinate() + " Y coordinate: " + dPoint.getYCoordinate());
        System.out.println("X coordinate: " + intPoint.getXCoordinate() + " Y coordinate: " + intPoint.getYCoordinate());

    }
}