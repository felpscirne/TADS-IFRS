
import java.time.LocalDate;

public class Reserva {

    private String cliente;
    private String quarto;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;

// Construtor da reserva, que recebe o cliente, o quarto, a data de check-in e a data de check-out
    public Reserva(String cliente, String quarto, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public String getCliente() {
        return cliente;
    }

    public String getQuarto() {
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
        }else if (dataCheckIn.isEqual(dataCheckOut)) {
            System.out.println("Reserva não pode ser confirmada, pois a data de check-in é igual à data de check-out.");
            return;
        }else if (!quarto.isDisponivel()) {
            System.out.println("Reserva não pode ser confirmada, pois o quarto não está disponível.");
            return;
        }else{
            quarto.reservar();            
            System.out.println("Reserva confirmada para o cliente " + cliente + " no quarto " + quarto + " de " + dataCheckIn + " a " + dataCheckOut);
        }

        
        System.out.println("Reserva confirmada para o cliente " + cliente + " no quarto " + quarto + " de " + dataCheckIn + " a " + dataCheckOut);
    }


//Método que cancela a reserva de um quarto para um cliente
    public void cancelarReserva(Reserva reserva) {
        quarto.liberar();
        System.out.println("Reserva cancelada para o cliente " + cliente + " no quarto " + quarto + " de " + dataCheckIn + " a " + dataCheckOut);
    }
}
