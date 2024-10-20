import java.util.Scanner;

public class Exec6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua idade em anos, meses e dias:");
        int ano = scan.nextInt();
        int mes = scan.nextInt();
        int dia = scan.nextInt();

        mes = mes + (ano*365);
        dia = dia + (mes*30);

        System.out.println("Sua idade em dias é: " + dia);
    }
}