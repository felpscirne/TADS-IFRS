public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual){
        this.salario += this.salario * percentual / 100;
        System.out.println(this.salario);
    }
    


}
