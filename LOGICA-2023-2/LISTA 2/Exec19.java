import java.util.Scanner;

public class Exec19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE AS DIMENSÕES DA COZINHA EM ORDEM: COMPRIMENTO, LARGURA E ALTURA");

        float comprimento = scan.nextFloat();
        float largura = scan.nextFloat();
        float altura = scan.nextFloat();

        float paredes_compridas = (comprimento * altura) * 2;
        float paredes_largas = (largura * altura) * 2;

        float tijolos = (paredes_compridas + paredes_largas) / 1.5f;
        if (tijolos % 1.5f != 0) {
            tijolos = tijolos + 1;
        }

        System.out.printf("SERA NECESSÁRIO NO MINIMO %i CAIXAS DE AZULEJO %n", (int)tijolos);
    }
}

