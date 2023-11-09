import java.util.Scanner;

public class Exec8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero total de eleitores: ");
        double eleitores = scan.nextInt();
        System.out.print("Digite o numero de votos validos: ");
        double votosvalidos = scan.nextInt();
        System.out.print("Digite o numero de votos brancos: ");
        double votosbrancos = scan.nextInt();
        System.out.print("Digite o numero de votos nulos: ");
        double votosnulos = scan.nextInt();

        if (eleitores == (votosvalidos + votosbrancos + votosnulos)) {
            double percent_validos = (votosvalidos / eleitores) * 100;
            double percent_brancos = votosbrancos / eleitores * 100;
            double percent_nulos = votosnulos / eleitores * 100;

            System.out.printf("Votos Validos: %.2f", percent_validos); System.out.println("%");
            System.out.printf("Votos Brancos: %.2f", percent_brancos); System.out.println("%");
            System.out.printf("Votos Nulos: %.2f", percent_nulos); System.out.println("%");
        } else {
            System.out.println("VOTOS NÃO CONDIZEM COM O NUMERO DE VOTANTES, INICIE NOVAMENTE E DIGITE VALORES VALIDOS!"); 
        }
    }
}