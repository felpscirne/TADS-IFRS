import java.util.Scanner;

public class Exec15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE A HORA DE INICIO E FIM DO XADREZ");
        int hinicio = scan.nextInt();
        int hfim = scan.nextInt();

        if (hinicio > 24 || hfim > 24) {
            System.out.println("HORA INVALIDA, NÃO PODE SER MAIOR QUE 24H");
        } else {
            if (hfim <= hinicio) {
                hfim = hfim + 24;    
            }
            float duracao = hfim - hinicio;
            System.out.println("TEMPO DA PARTIDA FOI " + duracao + "H");
        }
    }
}
