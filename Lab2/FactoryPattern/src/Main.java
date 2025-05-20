public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("circle");
        circle.draw(); // Output: Drawing a Circle

        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw(); // Output: Drawing a Rectangle
    }
}
