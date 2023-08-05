import java.util.Scanner;

public class Exec7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a distancia do trajeto em KM: ");
        double distance = scan.nextDouble();
        System.out.print("Digite a velocidade média da viagem em KM/H: ");
        double speed = scan.nextDouble();
        
        double time = distance / speed;
        System.out.printf("A viagem irá levar: %.2f %n", time , " horas.");
    }
}
