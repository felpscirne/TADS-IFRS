import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nome;
    private String email;
    private String telefone;
    private List<Reserva> reservas;
    
// Construtor do cliente, que recebe nome, email, telefone e inicializa a lista de reservas
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.reservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

// Método que adiciona uma reserva à lista de reservas do cliente e a confirma
    public void fazerReserva(Reserva reserva) {
        reservas.add(reserva);
        reserva.confirmarReserva();
    }

// Método que cancela uma reserva do cliente
    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        reserva.cancelarReserva(reserva);
    }

// Método que lista as reservas do cliente, formatando a data
    public void listarReservas(DateTimeFormatter formatter) {
        System.out.println("Reservas de " + nome + ":");

        for (Reserva reserva : reservas) {
            System.out.println(reserva.toString());
        }
    }
}

