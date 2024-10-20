import java.util.Scanner;

public class Exec9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Numero de homens no churrasco: ");
        int homem = scan.nextInt();
        System.out.print("Numero de mulheres no churrasco: ");
        int mulher = scan.nextInt();
        System.out.print("Numero de crianças no churrasco: ");
        int crianca = scan.nextInt();
        
        int homemcarne = homem * 400;
        int mulhercarne = mulher * 320;
        int criancacarne = crianca * 200;

        double total = (homemcarne + mulhercarne + criancacarne) + (homemcarne + mulhercarne + criancacarne) * 0.2;

        System.out.print("Total de carne em gramas sem osso: " + total);
    }
}
