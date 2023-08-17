import java.util.Scanner;

public class Exec9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float pi = 3.141692f;

        System.out.println("Digite o raio de uma circunferencia:");
        float raio = scan.nextFloat();
        float diametro = 2 * raio;
        float comprimento = 2 * pi * raio;
        float area = pi * (raio * raio);
        
        System.out.println("DIAMETRO = " + diametro + "\n" + "COMPRIMENTO = " + comprimento + "\n" +  "AREA = " + area);
    }
}
        