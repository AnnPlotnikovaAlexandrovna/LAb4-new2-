package Circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        double r;
        Circle k1 = new Circle(3.4, 6.2, 0.3, "Green");
        System.out.println("ДО = " + k1.getLength() + "см\n");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус " + "12");
        r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина окружности = " + k1.getLength() + "см");
    }
}
