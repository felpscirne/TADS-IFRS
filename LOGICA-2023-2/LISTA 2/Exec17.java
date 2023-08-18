import java.util.Scanner;

public class Exec17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("DIGITE O CUSTO DE FABRICA DE UM CARRO: ");

        float custo = scan.nextFloat();

        float lucro = custo * 0.28f;
        float imposto = custo * 0.45f;

        float venda = custo + lucro + imposto;

        System.out.println("O VALOR DE VENDA É: R$ " + venda);
    }
}

