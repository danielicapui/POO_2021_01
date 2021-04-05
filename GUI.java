package deck.carta.Jogador;
import javax.swing.JFrame;
class GUI
{
  private JButton[] b1=new JButton[5];
  private JButton[] b2=new JButton[5];
  private Jogador j1;
  private Jogador j2;
  private JFrame jogo;
  GUI(Jogador j1,Jogador j2)
  {
  	this.j1=j1;
  	this.j2=j2;
    int tamanho=50;
    for(int i=0;i<5;i++)
    {
      //Icon carta1=j1.carta
      //Icon carta2=new ImageIcon(
      this.b1[i]=new JButton(j1.getMao[i]().getImagem());
      this.b2[i]=new JButton(j2.getMao[i]().getImagem());
    }
  }
 	
}
