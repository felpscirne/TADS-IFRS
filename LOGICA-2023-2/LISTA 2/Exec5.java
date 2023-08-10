import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float numerador1 = 0;
        float denominador1 = 0;
        float numerador2 = 0;
        float denominador2 = 0;

        System.out.print("Digite o primeiro numerador: ");
        numerador1 = scan.nextFloat();
        System.out.print("Digite o primeiro denominador: ");
        denominador1 = scan.nextFloat();
        System.out.print("Digite o segundo numerador: ");
        numerador2 = scan.nextFloat();
        System.out.print("Digite o segudo denominador: ");
        denominador2 = scan.nextFloat();
        if ((denominador1 == 0) || (denominador2 == 0)) {
            System.out.println("Denominadores não podem ser iguais a zero, tente novamente!");
        } else {
        float numerador3 = numerador1 * denominador2;
        float denominador3 = denominador2 * numerador2;
        System.out.println("Resultado: " + numerador3 + "/" + denominador3);
        }
    }
}