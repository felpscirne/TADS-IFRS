import java.util.Scanner;

public class Ex04 {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        float precoCombustivel = 0; 
        float desconto = 0;

        System.out.println("DIGITE A QUANTIDADE DE COMBUSTIVEL E O SEU TIPO ('A' PARA ALCOOL E 'G' PARA GASOLINA))");
        float quantCombustivel = scan.nextFloat();
        char tipoCombustivel = scan.next().charAt(0);

        if (tipoCombustivel == 'A'){
            precoCombustivel = 4.90f;
            if (quantCombustivel > 20){
                desconto = 0.05f;
            }else{
                desconto = 0.03f;
            }
        }else if (tipoCombustivel == 'G'){
            precoCombustivel = 5.80f;
            if (quantCombustivel > 20){
                desconto = 0.06f;
            }else{
                desconto = 0.04f;
            }
        } else{
            System.out.println("TIPO DE COMBUSTIVEL DESCONHECIDO");
        }

        float precoFinal = (quantCombustivel*precoCombustivel)-(quantCombustivel*precoCombustivel*desconto);
        System.out.printf("VALOR A PAGAR: R$ %.2f",precoFinal);
    }
}
        
