
//
public enum TipoQuarto {
    SIMPLES,
    DUPLO,
    SUITE;

   // Método que retorna o tipo de quarto em forma de string formatada
    @Override
    public String toString() {
        switch (this) {
            case SIMPLES: return "Simples";
            case DUPLO: return "Duplo";
            case SUITE: return "Suíte";
            default: throw new IllegalArgumentException("Tipo de quarto inválido." );
        }
    }
}