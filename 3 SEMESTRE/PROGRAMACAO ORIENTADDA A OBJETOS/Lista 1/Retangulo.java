public class Retangulo {
   double largura;
   double altura;
   double area;
   
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void calcularArea() {
        area = (largura * altura);

    }
    public void compararArea(Retangulo r) {
        this.calcularArea();
        r.calcularArea();
        
        if (this.area > r.area) {
            System.out.println("A área do retângulo 1 é maior que a área do retângulo 2");
        } else if (this.area < r.area) {
            System.out.println("A área do retângulo 2 é maior que a área do retângulo 1");
        } else {
            System.out.println("As áreas dos retângulos são iguais");
        }
    }
}
