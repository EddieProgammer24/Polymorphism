public abstract class Shape {
    protected String shapeName;

    // abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();

    public String getName() {
        return shapeName;
    }
}
