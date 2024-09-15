import java.util.List;
import java.util.ArrayList;

public class BancoDeDadosSimples {
    
    List<Pessoa> pessoas;

    public BancoDeDadosSimples(){
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    public void removerPessoa(String nome){
        pessoas.removeIf(pessoa -> pessoa.getNome().equals(nome));
    }

    public void exibirPessoas(){
        for(Pessoa pessoa : this.pessoas){
            pessoa.exibirInformacoes();
        }
    }
}
