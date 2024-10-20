import java.util.Scanner;

public class Ex02 {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("DIGITE O SALARIO, VALOR DO EMPRESTIMO E O NUMERO DE PRESTAÇÕES");
        float salario = scan.nextFloat();
        float valorEmprestimo = scan.nextFloat();
        int quantPrestacao = scan.nextInt();

        float salarioTrintaPorcento = salario*0.3f;
        float valorPrestacao = salario/quantPrestacao;

        if (salarioTrintaPorcento <= valorPrestacao){
            System.out.println("PODE SER CONCEDIDO");
        }else{
            System.out.println("NÃO PODE SER CONCEDIDO");
        }
    }
}
