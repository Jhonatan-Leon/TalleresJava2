package uniquindio.edu.co;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Creación una instancia de cada figura
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(13,7);
        Triangle triangle = new Triangle(4, 6);

        //Validación del metodo getArea()
        System.out.println("Area de circulo: "+ circle.getArea());
        System.out.println("Area de rectangulo: "+ rectangle.getArea());
        System.out.println("Area de triangulo: "+ triangle.getArea());

        //Generar un array de Shape
        Shape[] shapes = {
            new Circle(7),
            new Triangle(3,4)
        };

        //Verificar el funcionamiento del nuevo AreaCalculator
        //Con el Array Shape
        AreaCalculator calcular = new AreaCalculator();
        double total = calcular.sum(shapes);

        System.out.println("Area de calculo: "+ total);
    }
}