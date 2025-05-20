public class Main {
    public static void main(String[] args) {
        // Only one instance of ShapeFactory
        ShapeFactory factory = ShapeFactory.getInstance();

        Shape circle = factory.getShape("circle");
        circle.draw(); // Output: Drawing a Circle

        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw(); // Output: Drawing a Rectangle
    }
}
