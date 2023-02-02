import java.text.DecimalFormat;

/**
 * @file Rectangle.java
 * @date 2/2/2023
 * @author Lauren Gault
 *
 * @Description Creates a rectangle with a width and height or a square with a side length.
 * The user has the ability to calculate the perimeter and area of the rectangle and print
 * information about the rectangle.
 */
public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double height;
    private double perimeter;
    private double area;

    //default constructor (make public for CS A)

    /**
     * creates a rectangle with a default width and height of 1.0
     */
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    //overloaded constructor (with parameters)

    /**
     * creates a Rectangle object with width and height
     *
     * @param h height of rectangle
     * @param w width of rectangle
     */
    public Rectangle(double h, double w){
        width = w;
        height = h;
    }

    /**
     * Allows the user to set the width
     * @param width the desired width of the rectangle
     */
    public Rectangle(double width){
        this.width = width;
    }



    //accessors

    /**
     *
     * @return the width of the rectangle
     */
    public double getWidth(){
        return width;
    }

    /**
     *
     * @return the height of the rectangle
     */
    public double getHeight(){
        return height;
    }

    //mutators

    /**
     * Allows the user to change the width of the rectangle
     *
     * @param newWidth the desired width of the rectangle
     */
    public void setWidth(double newWidth){
        width = newWidth;
    }

    //other methods




    //toString method
    /**
     * Prints the height and width of rectangle to 2 decimal places
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return "The height of the rectangle is " + df.format(height) + " and the width is " +
                df.format(width) + ".";
    }
}