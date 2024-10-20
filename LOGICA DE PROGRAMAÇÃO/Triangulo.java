import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);        
        int lado1, lado2, lado3, hipotenusa, menorA, menorB;
        String triangulo;
        System.out.println("DIGITE OS 3 LADOS DE UM TRIANGULO");
        lado1 = scan.nextInt();
        lado2 = scan.nextInt();
        lado3 = scan.nextInt();

        if ((lado1 == lado2) && (lado1 ==lado3))
                System.out.println("EQUILATERO");
        
        else{ 
            if ((lado1 > lado2) && (lado1 > lado3)){
            hipotenusa = lado1;
            menorA = lado2;
            menorB = lado3;
            }else if ((lado2 > lado1) && (lado2 > lado3)){
                hipotenusa = lado2;
                menorA = lado1;
                menorB = lado2;
            }else{
                hipotenusa = lado3;
                menorA = lado1;
                menorB = lado2;
        }
        
        if (hipotenusa < menorA + menorB) {
        
            if ((hipotenusa == menorA) || (menorA == menorB) || (hipotenusa == menorB)){  
                triangulo = "ISOSCELES";
            }else{
                triangulo = "ESCALENO";
        
            if (triangulo == "ISOSCELES" || triangulo == "ESCALENO"){  
                if (hipotenusa * hipotenusa == menorA * menorA + menorB *menorB){
                    System.out.println(triangulo);
                    System.out.println("RETANGULO");
                }    
            }else{
                System.out.println("NÃO É UM TRIANGULO VALIDO");
        }
    }
}
        }
    }
}


