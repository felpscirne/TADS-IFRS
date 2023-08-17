import java.util.Scanner;

public class Exec12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("DIGITE A QUANTIDADE DE MAÇAS: ");
        int maca = scan.nextInt();
        float valor;

        if (maca >= 12) {
            valor = maca * 1.30f;
        } else {
            valor = maca * 1.50f;
        }
        System.out.println("VALOR TOTAL: " + valor);
    }
}
