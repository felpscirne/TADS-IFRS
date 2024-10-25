import java.util.List;
import java.util.ArrayList;

public class Hotel{
    
    private String nome;
    private String endereco;
    private List<Quarto> listadequartos[];

    // Construtor do hotel, que recebe nome e endereço e inicializa a lista de quartos
    public Hotel(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.listadequartos = new ArrayList<Quarto>();
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    

}

