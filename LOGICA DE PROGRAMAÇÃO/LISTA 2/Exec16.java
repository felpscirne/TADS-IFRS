import java.util.Scanner;

public class Exec16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float MAX_TAXA_PRESTACAO = 0.3f;
        
        System.out.println("DIGITE EM ORDEM, SEU SALARIO, O VALOR DO EMPRESTIMO DESEJADO E O NUMERO DE PRESTAÇÕES");
        float salario = scan.nextFloat();
        float emprestimo = scan.nextFloat();
        int nprestacao = scan.nextInt();

        if (salario > 0 || emprestimo > 0 || nprestacao > 0) {
            float vprestacao = (emprestimo / nprestacao);

            if (vprestacao < salario * MAX_TAXA_PRESTACAO) {
                System.out.println("PODE SER CONCEDIDO");
            } else {
                System.out.println("NÃO PODE SER CONCEDIDO");
            }
        }
    }
}