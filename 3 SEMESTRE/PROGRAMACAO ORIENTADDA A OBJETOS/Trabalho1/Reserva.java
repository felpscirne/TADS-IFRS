
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {

    private Cliente cliente;
    private Quarto quarto;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;

// Construtor da reserva, que recebe o cliente, o quarto, a data de check-in e a data de check-out
    public Reserva(Cliente cliente, Quarto quarto, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

//Método que confirma a reserva de um quarto para um cliente em um determinado período
    public void confirmarReserva() {
        if (dataCheckIn.isBefore(LocalDate.now())) {
            System.out.println("Reserva não pode ser confirmada, pois a data de check-in já passou.");
            return;
        }else if (dataCheckOut.isBefore(dataCheckIn)) {
            System.out.println("Reserva não pode ser confirmada, pois a data de check-out é anterior à data de check-in.");
            return;
        }else{
            quarto.reservar();
        }

        
        System.out.println("Reserva confirmada para o cliente " + cliente + " no quarto " + quarto + " de " + dataCheckIn + " a " + dataCheckOut);
    }

//Método que cancela a reserva de um quarto para um cliente
    public void cancelarReserva(Reserva reserva) {
        quarto.liberar();
    }

//Método que formata a reserva
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataCheckInFormatada = dataCheckIn.format(formatter);
        String dataCheckOutFormatada = dataCheckOut.format(formatter);
        return "Cliente: " + cliente + "\nQuarto: " + quarto + "\nData de check-in: " + dataCheckInFormatada + "\nData de check-out: " + dataCheckOutFormatada;
    }


}
