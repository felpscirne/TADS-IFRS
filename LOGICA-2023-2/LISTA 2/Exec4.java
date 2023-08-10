import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a variavel Numero1: ");
        int Numero1 = scan.nextInt();
        System.out.print("Digite a variavel Numero2: ");
        int Numero2 = scan.nextInt();

        if (Numero1 > Numero2) {
            System.out.println("Variavel Numero1 de valor " + Numero1 + " é o maior numero.");
        }
        if (Numero1 < Numero2) {
            System.out.println("Variavel Numero2 de valor " + Numero2 + " é o maior numero.");
        }
        if (Numero1 == Numero2) {
            System.out.println("Os dois numeros são iguais.");
        }
    }
}