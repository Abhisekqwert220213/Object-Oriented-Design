/**
 * Abhisek Paul - Undergraduate student of 2nd year in Khulna University with student ID 220213.
 */
package Solid_Principle.LSP;

/**
 * Main class to demonstrate Liskov Substitution Principle (LSP) implementation.
 * LSP is maintained here because both Rectangle and Square are subclasses of Shape,
 * and instances of these subclasses can be substituted for instances of the base class Shape
 * without affecting the correctness of the program.
 */
public class Main {
    public static void main(String[] args){

        Shape rectangle = new Rectangle(5,10);

        System.out.println("Rectangle Area: "+rectangle.area());

        Shape square = new Square(5);

        System.out.println("Area of the square: "+square.area());
    }
}

/**
 * Represents a Rectangle class that extends Shape.
 */
package Solid_Principle.LSP;

public class Rectangle extends Shape {
    /**
     * Constructs a Rectangle object with the specified width and height.
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(int width, int height){
        super(width, height);
    }
}

/**
 * Represents a Shape class with width and height.
 */
package Solid_Principle.LSP;

public class Shape {
    protected int width;
    protected int height;

     /**
     * Constructs a Shape object with the specified width and height.
     * @param width The width of the shape.
     * @param height The height of the shape.
     */
    public Shape(int width, int height){
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the shape.
     * @return The area of the shape.
     */
    public int area(){
        return width * height;
    }
}

/**
 * Represents a Square class that extends Shape.
 */
package Solid_Principle.LSP;

public class Square extends Shape {
    /**
     * Constructs a Square object with the specified side length.
     * @param sideLength The length of each side of the square.
     */
    public Square(int sideLength){
        super(sideLength, sideLength);
    }
}
