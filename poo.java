import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	
        // inicia classes
        Scanner input = new Scanner(System.in);
        String nome=input.nextLine();
        ExemploString shika=new ExemploString(nome);
        input.close();
        shika.remove_blank();
        shika.to_lowerString();
        shika.first_15();
        shika.saida();
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
    //Métodos para pegar os valores dos atributos;
    public int getGols_1()
    {
        return gols_1;
    }
    public int getGols_2()
    {
        return gols_2;
    }
	public void saida()
	{
		System.out.printf("%s\n",this.nome_under);
        System.out.printf("%s\n",this.nome_lower);
        System.out.printf("%s\n",this.nome_15);
	}   
}	
