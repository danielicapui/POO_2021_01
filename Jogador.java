package deck.carta.CartaBaralho;

public class Jogador {
   private static final int cartas_no_jogo=5;
   private final String nome;
   private final CartaBaralho[] mao;
   private int pontos;
   Jogador(String nome,CartaBaralho[] Mao)
   {
     this.nome=nome;
     this.mao=Mao;
     this.pontos=0;
   }
   public int getPontos()
   {
     return this.pontos;
   }
   public void setPontos(int pontos)
   {
     this.pontos=pontos;
   }
   public CartaBaralho[] getMao()
   {
     return this.mao;
   }
   public String getNome()
   {
     return this.nome;
   }
   public void adicionaPontuacao(CartaBaralho carta1, CartaBaralho carta2)
   {
    
    this.setPontos(this.getPontos()+carta1.getPontos()+carta2.getPontos());
     
   }
}

