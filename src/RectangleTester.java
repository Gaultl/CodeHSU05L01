public class RectangleTester {
    public static void main(String[] args) {
        //test your rectangle here
        Rectangle rect1 = new Rectangle(87.2392837, 9.1838384);
        double expectedPerimeter = 2 * 87.2392837 + 2 * 9.1838384;
        System.out.println(rect1.calculatePerimeter() == expectedPerimeter);
    }
}
