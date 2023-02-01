import java.text.DecimalFormat;
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

}