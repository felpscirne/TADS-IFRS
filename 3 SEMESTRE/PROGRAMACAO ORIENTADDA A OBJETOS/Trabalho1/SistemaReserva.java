
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SistemaReserva {
    private List<Hotel> hoteis;
    private List<Cliente> clientes;

    // Cria um administrador para adicionar hoteis
    Administrador adm = new Administrador("admin", 1);

    Scanner scanner = new Scanner(System.in);

    // Construtor do sistema de reservas, que inicializa as listas de hoteis e clientes
    public SistemaReserva() {
    this.hoteis = new ArrayList<>();
    this.clientes = new ArrayList<>();
    }

    public List<Hotel> getHoteis() {
        return hoteis;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    //Método que cadastra um cliente no sistema caso ele não esteja cadastrado
    public void cadastrarCliente(String nome) {
        if (buscarClientePorNome(nome) != null) {
            System.out.println("Cliente já cadastrado.");
            return;
        }

        System.out.println("Digite o email do cliente: ");
        String email = scanner.nextLine();

        System.out.println("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email, telefone); // Cria um novo cliente
        clientes.add(cliente); // Adiciona o cliente à lista de clientes
        System.out.println("Cliente cadastrado com sucesso.");
    }
    //Método que adiciona um quarto à lista de quartos do hotel
    public void adicionarQuarto() {
        System.out.println("Digite o nome do hotel: ");
        String nomeHotel = scanner.nextLine();

        Hotel hotel = buscarHotelPorNome(nomeHotel);

        if (hotel == null) {
            System.out.println("Hotel não encontrado.");
            return;
        }
        try{
            System.out.println("Digite o número do quarto: ");
            String numero = scanner.nextLine();

            System.out.println("Digite o tipo do quarto (SIMPLES, DUPLO OU SUITE): ");
            TipoQuarto tipo = TipoQuarto.valueOf(scanner.nextLine().toUpperCase());

            System.out.println("Digite o preço do quarto: ");
            BigDecimal preco = scanner.nextBigDecimal();

            Quarto quarto = new Quarto(numero, tipo, preco); // Cria um novo quarto
            hotel.adicionarQuarto(quarto); // Adiciona o quarto à lista de quartos do hotel
            System.out.println("Quarto cadastrado com sucesso.");

        } catch (NumberFormatException e) {
            System.out.println("Preço inválido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar quarto, numero ou tipo invalidos.");
        }
    }

    // Método que adiciona um hotel à lista de hoteis
    public void adicionarHotel() {
        
        adm.adicionarHotel(hoteis);
    }

    // Método que lista os quartos disponiveis de um hotel por nome
    public void listarQuartosDisponiveis() {
        System.out.println("Digite o nome do hotel: ");
        String nomeHotel = scanner.nextLine();

        Hotel hotel = buscarHotelPorNome(nomeHotel);

        if (hotel == null) {
            System.out.println("Hotel não encontrado.");
            return;
        }

        hotel.listarQuartosDisponiveis();
    }

    //Método que lista os hoteis cadastrados no sistema
    public void listarHoteis() {
        if (hoteis.isEmpty()) {
            System.out.println("Nenhum hotel cadastrado.");
        }else{
            for (Hotel hotel : hoteis) {
                System.out.println(hotel.toString());
        
            }
        }
    }

    // Faz uma reserva de um quarto para um cliente, caso o hotel e o quarto existam. Caso o cliente não exista, ele é cadastrado.
    public void fazerReserva() {
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        Cliente cliente = buscarClientePorNome(nomeCliente);

        try {
            if (cliente == null) {
                this.cadastrarCliente(nomeCliente);
                
            
            }

            System.out.println("Digite o nome do hotel: ");
            String nomeHotel = scanner.nextLine();

            Hotel hotel = buscarHotelPorNome(nomeHotel);

            if (hotel == null) {
                System.out.println("Hotel não encontrado.");
                return;
            }

            hotel.listarQuartosDisponiveis();
            
            System.out.println("Digite o número do quarto: ");
            String numeroQuarto = scanner.nextLine();

            Quarto quarto = buscarQuartoPorNumero(hotel, numeroQuarto);

        //Caso o quarto não exista ou não esteja disponível, a reserva não é feita.
            if (quarto == null || !quarto.isDisponivel()) {
                if (quarto == null) {
                    System.out.println("Quarto não encontrado.");
                    return;
                } else {
                    System.out.println("Quarto indisponível.");
                    return;
                }
            }

            //Data de check-in e check-out da reserva são solicitadas ao usuário e formatadas.
            System.out.println("Digite a data de check-in (dd/MM/yyyy): ");
            String dataCheckInStr = scanner.nextLine();
            LocalDate checkIn = LocalDate.parse(dataCheckInStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.println("Digite a data de check-out (dd/MM/yyyy): ");
            String dataCheckOutStr = scanner.nextLine();
            LocalDate checkOut = LocalDate.parse(dataCheckOutStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Reserva reserva = new Reserva(cliente, quarto, checkIn, checkOut); // Cria uma nova reserva
            if (cliente != null) { // Sem esta linha codigo informa que cliente pode ser nulo
                cliente.fazerReserva(reserva); // Adiciona a reserva à lista de reservas do cliente e a confirma
            }
        } catch (Exception e) {
            System.out.println("Erro ao fazer reserva, tente novamente.");
        }
    }

    // Método que cancela uma reserva de um cliente para um quarto
    public void cancelarReserva() {
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        Cliente cliente = buscarClientePorNome(nomeCliente);

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        cliente.listarReservas(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Digite o número do quarto que deseja cancelar: ");
        String numeroQuarto = scanner.nextLine();

        for (Reserva reserva : cliente.getReservas()) {
            if (reserva.getQuarto().getNumero().equals(numeroQuarto)) { // Compara o número do quarto da reserva com o número passado por parâmetro
                cliente.cancelarReserva(reserva);// Remove a reserva da lista de reservas do cliente e libera o quarto
                return;
            }
        }
        System.out.println("Reserva não encontrada."); // Caso a reserva não seja encontrada

    }

    // Método que busca um cliente pelo nome e lista suas reservas.
    public void listarReservasCliente() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        Cliente cliente = buscarClientePorNome(nomeCliente);

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        cliente.listarReservas(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

// Método que busca um quarto pelo número em um hotel
    private Hotel buscarHotelPorNome(String nome) {
        for (Hotel hotel : hoteis) {
            if (hotel.getNome().equalsIgnoreCase(nome)) { // Compara o nome do hotel com o nome passado por parâmetro ignorando maiúsculas e minúsculas
                return hotel;
            }
        }

        return null;
    }

    // Método que busca um quarto pelo número em um hotel
    private Cliente buscarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) { // Compara o nome do cliente com o nome passado por parâmetro ignorando maiúsculas e minúsculas
                return cliente;
            }
        }

        return null;
    }

    // Método que busca um quarto pelo número em um hotel
    private Quarto buscarQuartoPorNumero(Hotel hotel, String numero) {
        for (Quarto quarto : hotel.getListaDeQuartos()) {
            if (quarto.getNumero().equals(numero)) { // Compara o número do quarto com o número passado por parâmetro.
                return quarto;
            }
        }

        return null;
    }
}

