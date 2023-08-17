import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois numeros:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        double soma = num1 + num2;
        
        if (soma > 20) {
            System.out.println(soma+8);
        } else {
            System.out.println(soma-10);
        }
    }
}