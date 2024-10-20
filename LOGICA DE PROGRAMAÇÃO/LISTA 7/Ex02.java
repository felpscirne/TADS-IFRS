import java.util.Scanner;
import java.util.Random;

public class Ex02 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int [] lados = new int [6];
        
        Random random = new Random();
        
        System.out.println("DIGITE O NUMERO DE LANCAMENTOS: ");
        int lancamentos = scan.nextInt();
        
        int cont = 0;
        for (int i=0; i<lancamentos; i++){
            int resultado = random.nextInt(6);
            lados[resultado]++; 
        }
        for (int i=0; i<lados.length; i++)
        System.out.println("LADO " + (i+1) + " = " + lados[i]);

    }
    }
