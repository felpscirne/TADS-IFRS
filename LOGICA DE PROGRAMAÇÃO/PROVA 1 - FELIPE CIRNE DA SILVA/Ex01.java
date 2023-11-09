import java.util.Scanner;

public class Ex01 {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        

        System.out.println("DIGITE A QUANTIDADE DE HOMENS, MULHERES E CRIANÇAS:");
        int qhomens = scan.nextInt()*400;
        int qmulheres = scan.nextInt()*320;
        int qcrianca = scan.nextInt()*200;

        float qTotal = qhomens + qmulheres + qcrianca;
        float qJuros = qTotal*0.2f;
        qTotal = (qTotal + qJuros)/1000; 

        System.out.println("CARNE A SER COMPRADA: " + qTotal + "KG de carne");
    }
}