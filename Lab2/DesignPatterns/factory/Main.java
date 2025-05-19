public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape square = factory.getShape("square");
        square.draw();

        Shape triangle = factory.getShape("triangle");
        triangle.draw();
    }
}
