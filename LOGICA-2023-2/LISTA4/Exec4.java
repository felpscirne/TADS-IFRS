import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float saldo = 0f;
        float saque, deposito;
        char operacao;

        do{
            System.out.println("DIGITE 'a' para CONSULTAR SEU SALDO");
            System.out.println("DIGITE 'b' para SACAR");
            System.out.println("DIGITE 'c' para DEPOSITAR");
            System.out.println("DIGITE 'd' para SAIR");
            
            operacao = scan.next().charAt(0);
            
            if (operacao == 'a')
                System.out.printf("SEU SALDO ATUAL É: R$ %.2f REAIS\n", saldo);
            
            else if (operacao == 'b'){
                System.out.println("QUANTO DESEJA SACAR? ");
                saque = scan.nextFloat();
                if (saque <= saldo){    
                    saldo = saldo - saque;
                    System.out.printf("SEU SALDO ATUAL É: R$ %.2f REAIS\n", saldo);
                }else{
                    System.out.println("SALDO INSUFICIENTE PARA SAQUE");
                }
            }else if (operacao == 'c'){
                System.out.println("QUANTO DESEJA DEPOSITAR? ");
                deposito = scan.nextFloat();
                saldo = saldo + deposito;
                System.out.printf("SEU SALDO ATUAL É: R$ %.2f REAIS\n", saldo);
        }
            if ((operacao == 'a')||(operacao == 'b')||(operacao == 'c')){
               System.out.println("DIGITE QUALQUER LETRA PARA INICIAR NOVAMENTE OU d PARA FINALIZAR:"); 
               operacao = scan.next().charAt(0);
    }
        }while (operacao != 'd');
    }    
}

