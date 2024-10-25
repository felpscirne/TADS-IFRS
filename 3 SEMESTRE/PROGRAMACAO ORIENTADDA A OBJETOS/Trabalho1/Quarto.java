
import java.math.BigDecimal;

public class Quarto {
    
    private String numero;
    private TipoQuarto tipo;
    private BigDecimal preco;
    private boolean isDisponivel;

    // Construtor do quarto, que recebe número, tipo e preço e inicializa como disponível
    public Quarto(String numero, TipoQuarto tipo, BigDecimal preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.isDisponivel = true;
    }

    public String getNumero() {
        return numero;
    }

    public TipoQuarto getTipo() {
        return tipo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return isDisponivel;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(TipoQuarto tipo) {
        this.tipo = tipo;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    // Método que reserva um quarto
    public void reservar() {
        if (isDisponivel) {
            isDisponivel = false;
            System.out.println("Quarto reservado com sucesso.");
        } else {
            System.out.println("Quarto já reservado, tente novamente.");
        }    
    }

// Método que libera um quarto
    public void liberar(){
        if (!isDisponivel) {
            isDisponivel = true;
            System.out.println("Quarto liberado com sucesso.");
        } else {
            System.out.println("Quarto já estava disponível.");
        }
    }

    @Override
    public String toString() {
        return "Número: " + numero + "\nTipo: " + tipo + "\nPreço: R$" + preco + "\nDisponibilidade: " + (isDisponivel? "Disponivel" : "Reservado");
    }
}
