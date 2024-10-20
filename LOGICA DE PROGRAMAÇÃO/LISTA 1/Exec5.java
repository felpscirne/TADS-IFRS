import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fah = sc.nextDouble();
        double cel = (fah - 32)/1.8;

        System.out.printf("Sua temperatura em Celsius é: %.2f %n", cel);
    }
}
