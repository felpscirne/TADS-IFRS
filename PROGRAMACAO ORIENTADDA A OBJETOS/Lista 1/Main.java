public class Main{
    public static void main(String[] args){
        //Exercicio 1
        Pessoa p1 = new Pessoa("Joao",25,1.75);
        p1.exibirInformacoes();
        p1.alterarIdade(26);
        
        //Exercicio 2
        Circulo c1 = new Circulo(5);
        double area = c1.calcularArea();
        double perimetro = c1.calcularPerimetro();
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

        //Exercicio 3
        Carro carro1 = new Carro("Civic", "Prata", 2021);
        Carro carro2 = new Carro("Corolla", "Preto", 2020);
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        //Exercicio 4
        ContaBancaria conta1 = new ContaBancaria("12345-6", 500.00);
        conta1.depositar(150.00);
        conta1.sacar(100.00);
        conta1.exibirSaldo();
        
        //Exercicio 5
        Retangulo ret1 = new Retangulo(4, 5);
        Retangulo ret2 = new Retangulo(3, 7);
        ret1.compararArea(ret2);

        //Exercicio 6
        Aluno aluno1 = new Aluno("Ana", 7.5, 8.0);
        Aluno aluno3 = new Aluno("Maria", 9.0, 8.5);
        Aluno aluno2 = new Aluno("Pedro", 6.0, 5.5);
        aluno1.calcularMedia();
        aluno2.calcularMedia();
        aluno3.calcularMedia();

        //Exercicio 7
        Produto produto1 = new Produto("Laptop", 3000.00);
        produto1.setPreco(3200.00);
        produto1.exibirInfo();

        //Exercicio 8
        Calculadora calc = new Calculadora();
        calc.somar(5, 3);
        calc.subtrair(5, 3);
        calc.multiplicar(5, 3);
        calc.dividir(5, 3);
        calc.somar(5);
        calc.salvarMemoria();
        calc.subtrair(3);
        calc.multiplicar(5);
        calc.dividir(3);
        calc.somar(5+calc.memoria);

        //Exercicio 9
        Funcionario func1 = new Funcionario("Carlos", 2500.00);
        func1.aumentarSalario(10); 
        

        //Exercicio 10
        BancoDeDadosSimples bd = new BancoDeDadosSimples();
        bd.adicionarPessoa(new Pessoa("João", 30, 1.80));
        bd.adicionarPessoa(new Pessoa("Maria", 25, 1.65));
        bd.exibirPessoas();
        bd.removerPessoa("João");
        bd.exibirPessoas();

    }
}