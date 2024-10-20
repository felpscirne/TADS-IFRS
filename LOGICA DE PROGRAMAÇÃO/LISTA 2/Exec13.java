import java.util.Scanner;

public class Exec13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE A NOTA DAS DUAS AVALIAÇÕES: ");
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();

        float media = (nota1 + nota2)/2;

        if (media >= 6) {
            System.out.println("APROVADO");
        } else { 
            System.out.println("REPROVADO");          
        }
    }
}