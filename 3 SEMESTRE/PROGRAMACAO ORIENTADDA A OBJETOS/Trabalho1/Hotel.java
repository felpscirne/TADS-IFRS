import java.util.ArrayList;
import java.util.List;

public class Hotel{
    
    private String nome;
    private String endereco;
    private List<Quarto> listaDeQuartos;

    // Construtor do hotel, que recebe nome e endereço e inicializa a lista de quartos
    public Hotel(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.listaDeQuartos = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public List<Quarto> getListaDeQuartos(){
        return listaDeQuartos;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    // Método que adiciona um quarto à lista de quartos do hotel
    public void adicionarQuarto(Quarto quarto){
        listaDeQuartos.add(quarto);
    }
    
    public void listarQuartosDisponiveis(){
        for (Quarto quarto : listaDeQuartos) {
            if (quarto.isDisponivel()){
                System.out.println(quarto.toString());
            }
        }
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nEndereço: " + this.endereco;
    }

}

