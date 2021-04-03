package deck.carta;

public enum Naipe 
{
   PAUS ("paus"), OURO("ouro"), COPAS("copas"),ESPADA("espada");
    
    private final String nome;

    private Naipe(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
