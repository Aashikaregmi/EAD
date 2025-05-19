public class ShapeMaker {

    // Step 1: Private static instance
    private static ShapeMaker instance;

    // Step 2: Private constructor
    private ShapeMaker() {
    }

    // Step 3: Public static method to return the same instance
    public static ShapeMaker getInstance() {
        if (instance == null) {
            instance = new ShapeMaker();
        }
        return instance;
    }

    // Factory method
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Square();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Triangle();
        }
        return null;
    }
}
