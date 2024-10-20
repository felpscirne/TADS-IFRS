import java.util.Scanner;

public class Exec2
 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        double base = scan.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        double altura = scan.nextDouble();

        double area = base * altura;
        double perimetro = (base + altura) * 2;

        System.out.printf("Area: %.2f %n", area);
        System.out.printf("Perimetro: %.2f %n", perimetro);
    }
}

