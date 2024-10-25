import java.util.List;
import java.util.Scanner;

public class Administrador {
    
    private String nome;
    private int id;

    Scanner scanner = new Scanner(System.in);

// Construtor do administrador, que recebe nome e id
    public Administrador(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }


    // Método que adiciona um hotel à lista de hoteis
    public void adicionarHotel(List<Hotel> hoteis) {
     System.out.println("Digite o nome do hotel: ");
        String nomeHotel = scanner.nextLine();

        if (buscarHotelPorNome(hoteis, nomeHotel) != null) {
            System.out.println("Hotel já cadastrado.");
            return;
        }

        System.out.println("Digite o endereço do hotel: ");
        String endereco = scanner.nextLine();

        Hotel hotel = new Hotel(nomeHotel, endereco); // Cria um novo hotel
        hoteis.add(hotel); // Adiciona o hotel à lista de hoteis
        System.out.println("Hotel cadastrado com sucesso.");
    }

    // Método que busca um hotel pelo nome
    public Hotel buscarHotelPorNome(List<Hotel> hoteis, String nome) {
        for (Hotel hotel : hoteis) {
            if (hotel.getNome().equalsIgnoreCase(nome)) { // Compara o nome do hotel com o nome passado por parâmetro ignorando maiúsculas e minúsculas
                return hotel;
            }
        }

        return null;
    }

    // Método que busca um hotel pelo nome e o remove da lista de hoteis
    public void removerHotel (List<Hotel> hoteis) {
        System.out.println("Digite o nome do hotel que deseja remover: ");
        String nomeHotel = scanner.nextLine();

        Hotel hotel = buscarHotelPorNome(hoteis, nomeHotel);

        if (hotel == null) {
            System.out.println("Hotel não encontrado.");
            return;
        }

        hoteis.remove(hotel);
        System.out.println("Hotel removido com sucesso.");
    }
    
    
}