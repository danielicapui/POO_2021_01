		
package deck.carta;
import javax.swing;
public class CartaBaralho {
    
    private Carta carta;
    private Naipe naipe;
    private ImageIcon imagem;

    public CartaBaralho(Carta carta, Naipe naipe,String nome) {
        this.carta = carta;
        this.naipe = naipe;
	//caso a pasta imagem não estejam no local substituia o método para a localização
	//this.imagem=new ImageIcon("imagem_carta/".concat(nome));
        this.imagem=new ImageIcon(nome)
	//relativo da pasta e projeto
	//this.imagem=new ImageIcon(getClass().getResource("/pacoteprojeto/imagem_carta/imagens.jpg")
	
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
                //Se as imagens estiverem no mesmo diretório podem usar do jeito que está.
		imagem_nome=carta.getNome().concat(naipe.getNome());
		//Caso as imagens estiverem em outro diretório use
		//coloque as imagens a pasta das imagens no src do seu projeto. Ou na mesma localização dos arquivos classes para pode ser acessados.
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
