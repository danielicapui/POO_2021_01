package deck.carta;
import javax.swing.*;
class Gui
{
  private JButton[] b1=new JButton[5];
  private JButton[] b2=new JButton[5];
	private Jogador j1;
  private Jogador j2;

  Gui(Jogador j1,Jogador j2)
  {
  	this.j1=j1;
  	this.j2=j2;
    

    for(int i=0;i<5;i++)
    {
    	//Icon carta1=j1.carta
      //Icon carta2=new ImageIcon(
      this.b1[i]=j1.getMao[i];
      this.b2[i]=j2.getMao[i];
    }
  }
 	
}
