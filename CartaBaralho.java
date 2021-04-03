		
package deck.carta;
import javax.swing;
public class CartaBaralho {
    
    private Carta carta;
    private Naipe naipe;
    private ImageIcon imagem;

    public CartaBaralho(Carta carta, Naipe naipe,String nome) {
        this.carta = carta;
        this.naipe = naipe;
        this.imagem=new ImageIcon(nome);
    }

    public Carta getCarta() {
        return carta;
    }

    public Naipe getNaipe() {
        return naipe;
    }
    public Image getImagem()
    {
      return imagem;
    }
    
    public static CartaBaralho [] geraBaralho (){
        int tamanhoBaralho = Naipe.values().length * Carta.values().length;
        String imagem_nome;
        CartaBaralho baralho [] = new CartaBaralho[tamanhoBaralho];
        int idx = 0;
        for (Naipe naipe : Naipe.values())
        {
        
            for(Carta carta : Carta.values())
            {
                imagem_nome=carta.getNome().concat(naipe.getNome());
                baralho [idx++] = new CartaBaralho(carta,naipe,imagem_nome);
            }
        }
        return baralho;
    }
    
    public static void main(String[] args) {
        CartaBaralho meuBaralho [] = CartaBaralho.geraBaralho();
        for(CartaBaralho minhaCarta : meuBaralho)
            System.out.println (minhaCarta.getCarta().getNome() + " de " +
                    minhaCarta.getNaipe().getNome());
    }
    
}
