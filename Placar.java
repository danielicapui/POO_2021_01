package deck.carta;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon; 
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

//import Jogo;
public class Placar
{
	private int j1;
	private int j2;
    	private int empate;
	private JLabel play1;
	private JLabel play2;
	private JLabel draw;
    	Placar()
    	{
    		this.j1=0;
     	 	this.j2=0;
      		this.empate=0;
		this.play1=new JLabel("0");
		this.play2=new JLabel("0");
		this.draw=new JLabel("0"); 
   	 }
    	public int getJ1()
    	{
    		return this.j1;
    	}
    	public int getJ2()
   	{
   	 	return this.j2;
    	}
   	public int getEmpate()
  	{
    		return this.empate;
  	}
	public void setJ1(int win)
 	{
    		this.j1=win;
	}
    	public void setJ2(int win)
    	{
    		this.j2=win;
   	}
  	public void setEmpate(int em)
    	{
    		this.empate=em;
   	}
	

    	public void jogoApurar(String quem_ganhou)
    	{
    		if (quem_ganhou=="j1")
      		{
      			this.setJ1(this.getJ1()+1);
			this.mudarPlacar(this.play1,this.getJ1()+"")
     		}
    		else if(quem_ganhou=="j2")
    		{
      			this.setJ2(this.getJ2()+1);
			this.mudarPlacar(this.play2,this.getJ2()+"")
   		}
     		else if empate(quem_ganhou=="ninguem")
    		{
      			this.setEmpate(this.getEmpate()+1);
			this.mudarPlacar(this.draw,this.getEmpate()+"")
     		} 
      		else
      		{
      			System.out("Algo inesperado aconteceu!");
      		}
    	}
	public void mudarPlacar(JLabel label_nome,String text)
	{
		label_nome.setText(text);
	}
}
