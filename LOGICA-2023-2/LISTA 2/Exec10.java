import java.util.Scanner;

public class Exec10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("NADADOR É ADULTO");
        } 
        if (idade >= 14 && idade <18) {
            System.out.println("NADADOR É JUVENIL");
        }
        if (idade >= 9 && idade <14) {
            System.out.println("NADADOR É INFANTIL");
        }
        if (idade < 9) {
            System.out.println("NADADOR É MIRIM");
        }
    }
}
