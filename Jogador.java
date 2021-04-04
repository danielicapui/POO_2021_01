package deck.carta;

public class Jogador {
   private static final int cartas_no_jogo=5;
   private final String nome;
   private final Carta[] mao;
   private int pontos;
   Jogador(String nome,Carta[] Mao)
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
   public Carta[] getMao()
   {
     return this.mao;
   }
   public String getNome()
   {
     return this.nome;
   }
   public void adicionaPontuacao(Carta carta1, Carta carta2)
   {
    
    this.setPontos(this.getPontos()+carta1.getPontos()+carta2.getPontos());
     
   }
}

