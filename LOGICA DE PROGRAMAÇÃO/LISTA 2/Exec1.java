import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bem vindo, entre com a medida em metros para convertermos para centrimetros: ");
        double metro = scan.nextDouble();

        double centimetro = metro * 100;

        System.out.println("Sua medida em centrimetos é: " + centimetro + "cm");
    }
}