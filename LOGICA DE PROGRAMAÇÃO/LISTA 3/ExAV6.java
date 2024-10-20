import java.util.Scanner;  

public class ExAV6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE SEU GENERO (F para feminino / M para masculino), SEU PESO E SUA ALTURA");

        char genero = scan.next().charAt(0);
        float peso = scan.nextFloat();
        float altura = scan.nextFloat();
        genero = Character.toUpperCase(genero);

        float imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);

        if (imc < 18) 
            System.out.println("ABAIXO DO PESO");
        else if ((imc < 24 && genero == 'F') || (imc < 25 && genero == 'M'))
            System.out.println("IMC NORMAL");
        else if (imc < 30)
            System.out.println("SOBREPESO");
        else if (imc < 35)
            System.out.println("OBESIDADE LEVE");
        else if (imc < 40)
            System.out.println("OBESIDADE MODERADA");
         else
            System.out.println("OBESIDADE GRAVE");
    }
}
            