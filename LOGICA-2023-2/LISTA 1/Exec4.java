import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a base do triangulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura do triangulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura)/2;
        System.out.println("A area do triangulo é: " + area);

    }
}