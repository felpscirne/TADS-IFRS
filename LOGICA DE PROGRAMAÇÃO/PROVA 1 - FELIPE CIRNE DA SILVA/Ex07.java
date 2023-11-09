import java.util.Scanner;

public class Ex07 {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE SEU GENERO(M-MULHER E H-HOMEM), PESO EM KG E ALTURA EM METROS");
        char genero = scan.next().charAt(0);
        float peso = scan.nextFloat();
        float altura = scan.nextFloat();

        float imc = peso/(altura*altura);

        if (imc < 18) {
            System.out.println("BAIXO PESO");
        }else if (genero=='M' && imc<=24 || genero=='H' && imc<=25){
            System.out.println("PESO NORMAL");
        }else if (imc<=30){
            System.out.println("SOBREPESO");
        }else if (imc<=35){
            System.out.println("OBESIDADE LEVE");
        }else if (imc<=40){
            System.out.println("OBESIDADE MODERADA");
        }else{
            System.out.println("OBESIDADE GRAVE");
        }
    }
}
