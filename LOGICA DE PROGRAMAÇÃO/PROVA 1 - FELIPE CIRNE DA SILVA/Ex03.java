import java.util.Scanner;

public class Ex03 {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE O NOME DE DOIS TIMES E OS GOLS DE CADA UM, EM ORDEM PARA CADA TIME");
        String timeA = scan.next();
        int golsTimeA = scan.nextInt();
        String timeB = scan.next();
        int golsTimeB = scan.nextInt();

        if (golsTimeA > golsTimeB){
            System.out.println("VENCEDOR: " + timeA);
        }else if(golsTimeB > golsTimeA){
            System.out.println("VENCEDOR: " + timeB);
        }else{
                System.out.println("EMPATE");
        }
    }
}
        