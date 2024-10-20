import java.util.Scanner;

public class Exec18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE O NUMERO DE CARROS VENDIDOS, O VALOR TOTAL DE SUAS VENDAS, SEU SALARIO FIXO E O VALOR FIXO POR CARRO VENDIDO:");

        int nCarros = scan.nextInt();
        float valor_vendas = scan.nextInt();
        float salario_fixo = scan.nextFloat();
        float taxa_carro = scan.nextFloat();

        float taxa_venda = valor_vendas * 0.05f;
        taxa_carro = taxa_carro * nCarros;

        float salario_final = salario_fixo + taxa_carro + taxa_venda;
        System.out.println("VOCÊ RECEBERA: R$" + salario_final);
    }
}

