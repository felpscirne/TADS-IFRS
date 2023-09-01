import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int cont = 2;
        int soma = 0;

        System.out.println("DIGITE UM NUMERO INTEIRO:");
        int numero = scan.nextInt();
        
        while (cont <= numero) {
            if (cont % 2 == 0){
                soma = soma + cont;
            }
            cont++;
        
    }
        System.out.printf("A SOMA DE TODOS NUMEROS DE 1 ATÉ %d É IGUAL A: %d %n", numero, soma);
    }
}

    
