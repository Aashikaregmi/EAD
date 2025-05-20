public class ShapeFactory {

    // Step 1: Private static instance
    private static ShapeFactory instance;

    // Step 2: Private constructor
    private ShapeFactory() {
    }

    // Step 3: Public static method to return the same instance
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    // Factory method
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
