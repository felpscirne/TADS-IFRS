public class Calculadora {
    double memoria;
    double result;

    

    public void somar(double num1, double num2){
        System.out.println(num1 + num2);
    }
    public void subtrair(double num1, double num2){
        System.out.println(num1 - num2);
    }
    public void multiplicar(double num1, double num2){
        System.out.println(num1 * num2);
    }
    public void dividir(double num1, double num2){
        System.out.println(num1 / num2);
    }
    public void somar(double num1){
        System.out.println(result + num1);
    }
    public void subtrair(double num1){
        System.out.println(result - num1);
    }
    public void multiplicar(double num1){
        System.out.println(result * num1);
    }
    public void dividir(double num1){
        System.out.println(result / num1);
    }
    public void salvarMemoria(){
        memoria = result;
    }

}
