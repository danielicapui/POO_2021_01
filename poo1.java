import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
        // inicia classes
        Scanner input = new Scanner(System.in);
        String casa=input.nextLine();
        String visitante=input.nextLine();
        Futebol shika=new Futebol(casa,visitante);
        input.close();
        
	}
}

class Futebol
{
	
	//Atributos
    //Nome de times
    private String casa;
    private String visitante;
    //Total de gols dos times
    private int gols_1;
    private int gols_2;
    //Data e localização da partida
    private String data;
    private String local;
    //Fim Atributos
    Futebol(String casa,String visitante)
    {
        this.casa=casa;
        this.visitante=visitante;
        this.gols_1=0;
        this.gols_2=0;
        this.local="A ser definido";
        this.data="A ser definido";
    }
	//Métodos de colocar valores
    public void setGols_1(int gols)
    {
        this.gols_1=gols;
    }
    public void setGols_2(int gols)
    {
        this.gols_2=gols;
    }
    public void setLocal(String campo)
    {
        this.local=campo;
    }
    public void setData(String horario)
    {
        this.data=horario;
    }
    //Fim métodos set.
    //Métodos para pegar os valores dos atributos;
    public int getGols_1()
    {
        return this.gols_1;
    }
    public int getGols_2()
    {
        return this.gols_2;
    }
    public String getLocal()
    {
        return this.local;
    }
    public String getData()
    {
        return this.data;
    }
    //Fim de métodos de get. 
}	
