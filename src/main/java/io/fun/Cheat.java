package io.fun;

public class Cheat {

    static String callMe() {
        System.out.println("Called!");
        return "Artur";
    }

    public void main() {

        var d = new Direction("L", 6);
        if (d instanceof Direction(String t, int v)) {
            if (t.equals("L")) {
                System.out.println(STR."Turn left and go \{v} meters");
            } else {
                System.out.println(STR."Turn right and go \{v} meters");
            }
        }

//
        Shape shape = new Circle(10);
        switch (shape) {
            case Circle(double radius):
                System.out.println("The shape is Circle with area: " + Math.PI * radius * radius);
                break;

            case Square(double a):
                System.out.println("The shape is Square with area: " + a * a);
                break;

            case Rectangle rectangle:
                System.out.println("The shape is Rectangle with area: + " + rectangle.length() * rectangle.width());
                break;

            default:
                System.out.println("Unknown Shape");
                break;
        }
    }
}

record Direction(String turn, int value) {

}

interface Shape {
}

record Circle(double radius) implements Shape {
}

record Square(double side) implements Shape {
}

record Rectangle(double length, double width) implements Shape {
}