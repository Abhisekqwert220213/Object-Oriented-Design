
/**
 * Abhisek is a second year undergraduate student of Khulna University with student ID 220213.
 */

package Solid_Principle.OCP;

/**
 * This class represents the entry point for the program. It demonstrates the usage of the Open/Closed Principle
 * where classes are open for extension but closed for modification. It utilizes the Shape interface along with
 * concrete implementations of Rectangle and Circle to calculate the total area of shapes without modifying existing code.
 *
 * @author Abhisek paul
 */
public class Main {
    /**
     * The main method initializes an array of shapes, calculates the total area using the AreaCalculator,
     * and prints the result.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args){
        Shape [] shapes = new Shape [2];
        shapes[0] = new Rectangle(5,7);
        shapes[1] = new Circle(7);


        AreaCalculator calculator = new AreaCalculator();

        double totalArea = calculator.calculateTotalArea(shapes);


        System.out.println("Total area of shapes: " + totalArea);
    }
}

/**
 * This class represents a circle shape. It implements the Shape interface and provides methods to calculate
 * the area of the circle.
 *
 * @author Abhisek paul
 */
public class Circle implements Shape {
    private double radius;

    /**
     * Constructs a Circle object with the specified radius.
     *
     * @param radius the radius of the circle
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Gets the radius of the circle.
     *
     * @return the radius of the circle
     */
    public double getRadius(){
        return radius;
    }

    /**
     * Sets the radius of the circle.
     *
     * @param radius the radius to set
     */
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}

/**
 * This class represents an area calculator. It calculates the total area of shapes by summing up
 * the areas of individual shapes provided.
 *
 * @author Abhisek paul
*/
public class AreaCalculator {
    /**
     * Calculates the total area of shapes provided.
     *
     * @param shapes an array of shapes
     * @return the total area of the shapes
     */
    public double calculateTotalArea(Shape [] shapes){
        double totalArea = 0.0;
        for(Shape shape : shapes){
            totalArea += shape.area();
        }
        return totalArea;
    }
}

/**
 * This class represents a rectangle shape. It implements the Shape interface and provides methods to calculate
 * the area of the rectangle.
 *
 * @author Abhisek paul
 */
public class Rectangle implements Shape {
    private double width;
    private double heigth;

    /**
     * Constructs a Rectangle object with the specified width and height.
     *
     * @param width the width of the rectangle
     * @param heigth the height of the rectangle
     */
    public Rectangle(double width,double heigth){
        this.width = width;
        this.heigth = heigth;
    }

    /**
     * Gets the width of the rectangle.
     *
     * @return the width of the rectangle
     */
    public double getWidth(){
        return width;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param width the width to set
     */
    public void setWidth(double width){
       this.width = width;
    }

    /**
     * Gets the height of the rectangle.
     *
     * @return the height of the rectangle
     */
    public double getHeigth(){
        return heigth;
    }

    /**
     * Sets the height of the rectangle.
     *
     * @param heigth the height to set
     */
    public void setHeigth(double heigth){
        this.heigth = heigth;
    }

    @Override
    public double area(){
        return heigth*width;
    }
}

/**
 * This interface represents a shape. It declares a method for calculating the area of the shape.
 * Implementing classes should provide concrete implementations for this method.
 *
 * @author Abhisek paul
 */
public interface Shape {
    /**
     * Calculates the area of the shape.
     *
     * @return the area of the shape
     */
    double area();
}

