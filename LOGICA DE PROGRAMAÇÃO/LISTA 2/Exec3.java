import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero = scan.nextDouble();

        if (numero >= 0) {

            System.out.println("Seu numero é positivo.");
        } else {
            System.out.println("Seu numero é negativo.");
        }
    }
}
    