import java.util.Scanner;

public class Exec10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("DIGITE O VALOR DO INGRESSO: ");
        double ingresso = scan.nextDouble();
        System.out.print("DIGITE O NUMERO DE SÓCIOS DO CLUBE: ");
        int socios = scan.nextInt();
        System.out.print("DIGITE O NUMERO DE CRIANÇAS MENORES DE 10 ANOS: ");
        int crianca = scan.nextInt();
        System.out.print("DIGITE O NUMERO DE PAGANTES SEM DESCONTO: ");
        int pagante = scan.nextInt();
        
        // VALOR UNITARIO DO INGRESSO COM DESCONTO
        double ingressodesc = ingresso * 0.3;
        // TOTAL DE PESSOAS NO EVENTO
        int people = socios + crianca + pagante;
        //TOTAL DE DESCONTO
        double descontototal = (socios * ingressodesc) + (crianca * ingresso);
        //RENDA TOTAL
        double arrecadacao = (ingresso * pagante) + (socios * ingressodesc);

        System.out.println("PUBLICO TOTAL DO EVENTO: " + people);
        System.out.println("RENDA TOTAL DO EVENTO: " + arrecadacao);
        System.out.println("VALOR PERDIDO EM DESCONTOS: " + descontototal);
    }
}
