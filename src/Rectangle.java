public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double height = 1.0;

    public Rectangle(){
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth()
                + " and height = " + getHeight()
                + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setHeight(this.getHeight()*(percent+100)/100);
        this.setWidth(this.getWidth()*(percent+100)/100);
    }
}

