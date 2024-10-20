public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void calcularMedia(){
        double media = (nota1 + nota2) / 2;
        System.out.println("A media do aluno " + nome + " é: " + media);
    }

    
}
