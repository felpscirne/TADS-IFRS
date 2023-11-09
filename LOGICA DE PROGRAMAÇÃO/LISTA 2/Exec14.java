import java.util.Scanner;

public class Exec14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE O ANO ATUAL SEGUIDO DO ANO DE NASCIMENTO");
        int atual = scan.nextInt();
        int nascimento = scan.nextInt();

        if (atual - nascimento >= 16) {
            System.out.println("PODE VOTAR");
        } else {
            System.out.println("NÃO PODE VOTAR");
        }
    }
}