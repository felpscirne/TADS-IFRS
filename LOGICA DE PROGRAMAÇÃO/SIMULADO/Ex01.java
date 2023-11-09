import java.util.Scanner;

public class Ex01{
     /*
        AproximacaoDePi - Existem diferentes formas de aproximarmos o valor de PI,
        https://en.wikipedia.org/wiki/Approximations_of_%CF%80. Utilizando Trigonometria,
        o matemático Gregory–Leibniz criou a seguinte fórmula:
        Quando aberto o somatório, percebemos que nada mais é do que a soma de várias
        frações, onde os denominadores são a sequência de números ímpares partindo de 1, e o
        sinal é intercalado entre positivo e negativo. Após isso a soma é multiplicada por 4 e
        obtém-se valores bem próximos de PI.
        Desenvolva um algoritmo que dada a quantidade de interações, calcule a
        aproximação de PI baseado na fórmula de Gregory Leibniz.
        Exemplo de entrada e saída do Algoritmo, note que quanto mais interações são
        feitas, mais próximo chegamos do valor de PI.
    */
     public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Digite o numero de interações: ");
        int inter = scan.nextInt();

        float denominador = 1;
        float soma = 0;

        for(int i=0;i<inter;i++){
            float divisao = 1/denominador;
            denominador += 2;
            if (i%2==0)
                soma += divisao;
            else
                soma -= divisao;
        }
        float resul = 4 * soma;
        System.out.println(resul); 
    }
}