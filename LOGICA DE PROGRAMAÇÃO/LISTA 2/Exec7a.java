import java.util.Scanner;

public class Exec7a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em hora do seu salario e o Nº de horas trabalhadas no mes: ");
        double payTime = scan.nextDouble();
        double horaMes = scan.nextDouble();
        System.out.print("Digite a porcentagem de imposto descontada de seu salário: ");
        double desconto = scan.nextDouble();
        
        double bruto = payTime * horaMes;
        double liquido = bruto - (bruto * (desconto/100));
        
        System.out.println("Seu salario bruto no mês será: R$ " + bruto);
        System.out.println("Seu salario liquido no mês será: R$ " + liquido);
    }
}
