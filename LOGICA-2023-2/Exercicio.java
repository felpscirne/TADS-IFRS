import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int opcao,posicao;
    
    
    
    int [] v = new int[10];

    while(true){

        System.out.print(
        "ESCOLHA UMA OPCAO: \n" + 
        "0. SAIR\n" + 
        "1.  Mostrar o vetor\n"+ 
        "2.  Inserir um valor em uma posicao\n"+
        "3.  Maior valor do vetor e sua posicao\n"+
        "4.  Menor valor do vetor e sua posicao\n"+
        "5.  Media dos valores que sao diferentes de zero\n"+
        "6.  Identificar a quantidade de numeros pares e numeros impares no vetor\n"+
        "7.  Trocar o valor e entre duas posicoes\n"+
        "8.  Identificar quantas sequencias tem no vetor\n"+
        "9.  Ordenar o vetor\n"+
        "10. Criar um novo vetor com tamanho diferente copiando os valores do vetor antigo\n" +
        "OPCAO: "
        );
        opcao = scan.nextInt();
        if (opcao==0) break;

        switch (opcao) {
            
            case 1:
        
                for(int i=0;i<v.length;i++){
                    System.out.print(v[i]+" ");
                }
                System.out.println();
                break;
        
            case 2:
                
                System.out.println("Digite em ordem, posicao e valor do vetor");
                do{
                    posicao = scan.nextInt();
                    if(posicao<v.length && posicao>=0){
                        v[posicao] = scan.nextInt();
                    }else{
                        System.out.println("POSICAO INVALIDA, DIGITE NOVAMENTE!");
                    }
                }while(posicao>v.length || posicao<0); 
                break;
        
            case 3:

                int maiorNum=0;
                int maiorPos=0;

                for(int i=0;i<v.length;i++){

                    if(v[i]>maiorNum){
                        maiorNum = v[i];
                        maiorPos = i;
                    }
                }
                System.out.println("Maior numero: "+maiorNum+"\n"+ "Maior posicao: "+maiorPos);
                break;

            case 4:

                
                int menorPos=0;
                int menorNum = 0;
                for(int i=0;i<v.length;i++){
                    
                    if(v[i]<v[menorPos]){
                        menorNum = v[i];
                        menorPos = i;
                    }

                }
                System.out.println("Menor numero: "+menorNum+"\n"+ "Menor posicao: "+menorPos);
                break;

            case 5:

                int qntValores=0;
                float media=0;

                for (int i=0;i<v.length;i++){
                    if(v[i]!=0){
                        qntValores++;
                        media+=v[i];                    
                    }
                }
                media = media/qntValores;
                System.out.println("Media dos valores: "+media);
                break;

            case 6:
                int pares=0;
                int impares=0;

                for(int i=0;i<v.length;i++){
                    if(v[i]%2==0){
                        pares++;
                    }else{
                        impares++;
                    }
                }
                System.out.println("Pares: "+pares+"\n"+"Impares: "+impares);
                break;

            case 7:

                int aux=0;

                System.out.println("Digite a primeira posicao e a segunda posicao: ");
                int primeiraPos = scan.nextInt();
                int segundaPos = scan.nextInt();

                aux = v[primeiraPos];
                v[primeiraPos] = v[segundaPos];
                v[segundaPos] = aux;

                break;

            case 8:

                int sequencia=0;
                for(int i=0;i<v.length;i++){
                    if(i ==v.length - 1){
                        break;
                    }
                    
                    if(v[i]+1==v[i+1]){
                        sequencia++;
                    }
                }
                System.out.println("Numero de sequencias: "+sequencia);
                break;

            case 9:
                aux=0;
                menorNum=0;
                for(int j=0;j<v.length;j++){
                    for(int i=j+1;i<v.length;i++){
                      if(v[i]<v[j]){
                            aux = v[i];
                            v[i]=v[j];
                            v[j]=aux;
                             
                        }
                    }
                }
                break;

            case 10:
                System.out.println("Digite o tamanho do novo vetor");
                int tamV2 = scan.nextInt();
                int [] v2 = new int[tamV2];
                int contV1=0;
                for(int i=0;i<v2.length;i++){
                    if(i>=v.length) contV1=0;
                
                    v2[i] = v[contV1];
                    contV1++;
                }
                for(int i=0;i<v2.length;i++){
                    System.out.print(v2[i]+" ");
                }
                System.out.println(); 
                break;

            default:
                System.out.println("OPCAO INVALIDA");
                break;
        }
    }



    }
}
