import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro para saber seu resultado ao quadrado: ");
        int num = sc.nextInt();
        int result = num * num;
        System.out.println("Seu resultado é: " + result);

    }
}
