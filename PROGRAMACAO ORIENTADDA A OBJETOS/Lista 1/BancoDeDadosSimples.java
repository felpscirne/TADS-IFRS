import java.util.List;
import java.util.ArrayList;

public class BancoDeDadosSimples {
    
    List<Pessoa> pessoas;

    public BancoDeDadosSimples(){
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){
    if(this.pessoas.contains(pessoa)){
        System.out.println("Pessoa já cadastrada!");
    }
    else{this.pessoas.add(pessoa);}
    }

    public void removerPessoa(String nome){
        this.pessoas.removeIf(pessoa -> pessoa.getNome().equals(nome));
    }

    public void exibirPessoas(){
        for(Pessoa pessoa : this.pessoas){
            pessoa.exibirInformacoes();
        }
    }

    public List<Pessoa> procurar(String parteNome){
        List<Pessoa> pessoasEncontradas = new ArrayList<>();
        for(Pessoa pessoa : this.pessoas){
            if(pessoa.getNome().contains(parteNome.toUpperCase())){
                pessoasEncontradas.add(pessoa);
            }
        }
        return pessoasEncontradas;
    }
}
