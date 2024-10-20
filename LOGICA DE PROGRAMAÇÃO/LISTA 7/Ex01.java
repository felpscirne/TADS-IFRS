import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int n = scan.nextInt();
        int [] vetor = new int [n];

        System.out.println("Digite os valores dos vetores:");
        for (int i=0; i<vetor.length; i++){
            vetor[i] = scan.nextInt();
        }

        for (int i = vetor.length -1; i>=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
