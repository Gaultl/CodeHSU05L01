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
     * @description creates a rectangle with a default width and height of 1.0
     */
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    //overloaded constructor (with parameters)

    /**
     * @description creates a Rectangle object with width and height
     *
     * @param h height of rectangle
     * @param w width of rectangle
     */
    public Rectangle(double h, double w){
        width = w;
        height = h;
    }

    /**
     * @description Allows the user to set the width
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
     * @description Allows the user to change the width of the rectangle
     *
     * @param newWidth the desired width of the rectangle
     */
    public void setWidth(double newWidth){
        width = newWidth;
    }

    /**
     * @description Allows the user to change the height of the rectangle
     *
     * @param newHeight the desired height of the rectangle
     */
    public void setHeight(double newHeight){
        height = newHeight;
    }

    //rectangle reset

    /**
     * @description Resets the rectangle to a default width and height of 1
     *
     * @param rect The rectangle to reset
     */
    public void resetRectangle(Rectangle rect){
        rect.width = 1;
        rect.height = 1;
    }

    //other methods

    /**
     * @description Calculates the area of the rectangle and updates instance variable area.
     *
     * @return the area of the rectangle
     */
    public double calculateArea(){
        area = height * width;
        return height * width;
    }

    /**
     * @description Calculates the perimeter of the rectangle and updates the instance variable perimeter
     *
     * @return the perimeter of the rectangle
     */
    public double calculatePerimeter(){
        perimeter = 2 * height + 2 * width;
        return perimeter;
    }


    //toString method
    /**
     * @description Prints the height and width of rectangle to 2 decimal places
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return "The height of the rectangle is " + df.format(height) + " and the width is " +
                df.format(width) + ".";
    }
}