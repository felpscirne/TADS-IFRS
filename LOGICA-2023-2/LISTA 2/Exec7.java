import java.util.Scanner;

public class Exec7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em hora do seu salario e o Nº de horas trabalhadas no mes: ");
        double payTime = scan.nextDouble();
        double horaMes = scan.nextDouble();
        
        double bruto = payTime * horaMes;
        double liquido = bruto - (bruto * 0.15);
        
        System.out.println("Seu salario bruto no mês será: R$ " + bruto);
        System.out.println("Seu salario liquido no mês será: R$ " + liquido);
    }
}
