import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero real: ");
        double num = sc.nextDouble();
        double result = num + (num * 0.2);
        System.out.println("Seu valor somado a 20% é: " + result);
    }
}
