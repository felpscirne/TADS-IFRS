public class Carro {
    String modelo;
    String cor;
    int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo + "\nCor: " + cor + "\nAno: " + ano + "\n");
    }
}
