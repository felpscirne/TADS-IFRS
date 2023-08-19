import java.util.Scanner;

public class Exec20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE O VALOR DO ODOMETRO(EM KM) NO INICIO DO DIA, NO FIM, A QUANTIDADE GASTA DE COMBUSTIVEL E O VALOR RECEBIDO DOS CLIENTES.");

        float vCombustivel = 4.599f;
        float odometro_inicio = scan.nextFloat();
        float odometro_fim = scan.nextFloat();
    
        
        if (odometro_inicio > odometro_fim) {
            System.out.println("FINAL DO ODOMETRO NÃO PODE SER MAIOR QUE INICIO.");
        } else {
            float gasto_combustivel = scan.nextFloat();
            float valor_recebido = scan.nextFloat();
            float consumo = (odometro_fim - odometro_inicio)/gasto_combustivel;
            float lucro = valor_recebido - gasto_combustivel;

            System.out.printf("SEU CONSUMO MÉDIO FOI: %.2f Km/L %n", consumo);
            System.out.println("SEU LUCRO FINAL FOI: R$ " + lucro);
        }
    }
}
