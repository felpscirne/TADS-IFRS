import java.util.Scanner;

public class Exec6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a nota número 1: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite a nota número 2: ");
        double nota2 =scan.nextDouble();

        double media = (nota1 + nota2)/2;
        System.out.println("Sua média é: " + media);
    }
}

 