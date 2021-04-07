public class Main {
    public static void main(String[] args) {
        Shape []array = new Shape[3];
        array[0] = new Circle(10);
        array[1] = new Square(10);
        array[2] = new Rectangle(10,20);
        //dien tich ban dau
        System.out.println("Area is: ");
        for (Shape shape: array) {
            System.out.println(shape.getArea());
        }
        // tang random dien tich
        double percent = Math.floor(Math.random()*100);
        System.out.println("Resize percent is: " + percent);
        for (int i = 0; i < array.length; i++) {
            array[i].resize(percent);
        }
        // dien tich sau khi tang
        System.out.println("Area after resize is: ");
        for (Shape shape: array) {
            System.out.println(shape.getArea());
        }
    }
}
