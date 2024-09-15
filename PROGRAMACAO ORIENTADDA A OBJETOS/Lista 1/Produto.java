public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        if (preco < 0){ System.out.println("Erro, valor negativo nao permitido");;
        }else this.preco = preco;
    }

    public void setPreco(double preco){
        if (preco < 0){ System.out.println("Erro, valor negativo nao permitido");;
        }else this.preco = preco;
    }
    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
    }
}

