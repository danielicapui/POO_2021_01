import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
        // inicia classes de alguns filmes, temporário.
        Filme shika=new Filme(1,"o chamado","terror","Uma garota que mata depois que assiste uma fita");
        Filme shika1=new Filme(2,"O alien","terror","Um ser de outro mundo que invadiu uma nave e caça os tripulantes");
        Filme shika2=new Filme(3,"a extinção","aventura","A humanidade chegou ao climax de sua existência,será, seu fim?");
        Filme[] filmes={shika,shika1,shika2};

        //Filme[] filmes1=criaVetor(10);
        
        Avaliacao neko=new Avaliacao(1,"Daniel",3,"saiu?Da fechar televisão, da uma voadora nela!");
        Avaliacao neko1=new Avaliacao(1,"Lucas",3,"Poderia ter ido ver o filme do pele!");
        Avaliacao neko2=new Avaliacao(1,"Misaki",4,"Comprei a passagem para Marte, beijinhos!");

        Avaliacao usagi=new Avaliacao(2,"Emilie",4,"Isso não existe");
        Avaliacao usagi1=new Avaliacao(2,"Dean",1,"Nada que um colt não resolva!");
        Avaliacao usagi2=new Avaliacao(2,"Sam",3,"Mato deuses, o que será aliens?");

        Avaliacao inu=new Avaliacao(3,"Dinossauro",5,"Finalmente, uma reprise!");
        Avaliacao inu1=new Avaliacao(3,"Astrounauta",3,"Que vista!");
        Avaliacao inu2=new Avaliacao(3,"Mona",1,"A passagem é muito caro!");
        
        Avaliacao[] opinioes={neko,neko1,neko2,usagi,usagi1,usagi2,inu,inu1,inu2}; 
        
	Filme[] filmes2=lerFile(7);
	Videoteca acervo2=new Videoteca(filmes2);
	acervo2.exibirTudo();
        Videoteca acervo=new Videoteca(filmes);
        Opinioes comentarios=new Opinioes(opinioes);
        acervo.exibirTudo();
        comentarios.exibirTudo();
	}
    public static Filme entrada()
    {
        Scanner input = new Scanner(System.in);
        int cod=input.nextInt();
        String nome=input.nextLine();
        String genero=input.nextLine();
        String sinopse=input.nextLine();
        Filme shika=new Filme(cod,nome,genero,sinopse);
        input.close();
        return shika;
    }
    public static Filme[] criaVetor(int tam)
    {
        Filme[] filmes = new Filme[tam];
        for(int i=0 ; i<filmes.length ; i++)
        {
            Filme shika=entrada();
            filmes[i] = new Filme(shika.getCodigo(),shika.getNome(),shika.getGenero(),shika.getSinopse());
        }
        return filmes;
    }
	public static Filme[] lerFile(int tam) throws FileNotFoundException
	{
		File arquivo = new File("movies.txt");
        Scanner sc = new Scanner(arquivo);
		int i=0;
		Filme[] filmes=new Filme[tam];
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String split[] = line.split(";", 4);
			filmes[i]=new Filme(Integer.parseInt(split[0]),split[1],split[2],split[3]);
			i++;
		}
		return filmes;
	}
}
class Filme
{
    private int codigo;
    private String nome;
    private String genero;
    private String sinopse;
	private File imagem;
    Filme(int codigo,String nome,String genero,String sinopse)
    {
        this.codigo=codigo;
        this.nome=nome.toLowerCase();
        this.genero=genero.toLowerCase();
        this.sinopse=sinopse.toLowerCase();
    }
	Filme(int codigo,String nome,String genero,String sinopse,File image)
    {
        this.codigo=codigo;
        this.nome=nome.toLowerCase();
        this.genero=genero.toLowerCase();
        this.sinopse=sinopse.toLowerCase();
		this.imagem=image;
    }
    //Métodos de colocar valores
    public void setCodigo(int cod)
    {
        this.codigo=cod;
    }
    public void setNome(String nom)
    {
        this.nome=nom.toLowerCase();
    }
    public void setGenero(String tipo)
    {
        this.genero=tipo.toLowerCase();
    }
    public void setSinopse(String descricao)
    {
        this.sinopse=descricao.toLowerCase();
    }
	public void setImagem(File image)
	{
		//this.imagem=setIcon(name);
		this.imagem=image;
	}
    //Fim métodos set.
    //Métodos para pegar os valores dos atributos
    public String getNome()
    {
        return this.nome;
    }
    public int getCodigo()
    {
        return this.codigo;
    }
    public String getSinopse()
    {
        return this.sinopse;
    }
    public String getGenero()
    {
        return this.genero;
    }
	public File getImagem()
	{
		return this.imagem;
	}
    //Fim de métodos de get. 
}
class Avaliacao
{
    private int codigo;
    private String username;
    private int nota;
    private String comentario;
    Avaliacao(int codigo,String username,int nota,String comentario)
    {
        this.codigo=codigo;
        this.username=username.toLowerCase();
        this.nota=nota;
        this.comentario=comentario.toLowerCase();
    }
    public void setCodigo(int cod)
    {
        this.codigo=cod;
    }
    public void setUsername(String name)
    {
        this.username=name.toLowerCase();
    }
    public void setNota(int nota)
    {
        this.nota=nota;
    }
    public void setComentario(String feedback)
    {
        this.comentario=feedback.toLowerCase();
    }
    public int getCodigo()
    {
        return this.codigo;
    }
    public int getNota()
    {
        return this.nota;
    }
    public String getComentario()
    {
        return this.comentario;
    }
    public String getUsername()
    {
        return this.username;                       
    }
}
class Videoteca
{
    private Filme[] filmes;
    Videoteca(Filme[] filmes)
    {
        this.filmes=filmes;
    }
    public void setFilme(Filme[] filme)
    {
        this.filmes=filme;
    }
    public Filme[] getFilmes()
    {
        return this.filmes;
    }
    public int searchFilme(String palavra)
    {
        int nom;
        int ption;
        palavra=palavra.toLowerCase();
        for(int i=0;i<filmes.length;i++)
        {
            nom=this.filmes[i].getNome().indexOf(palavra);
            ption=filmes[i].getSinopse().indexOf(palavra);
            if (nom!=-1)
            {
                System.out.printf("Encontrou o filme [%s] , procura por nome retornou: %d\n",filmes[i].getNome(),nom);
                return nom;
            }
            if (ption!=-1)
            {
                System.out.printf("Encontrou o filme [%s] , procura por sinopse retornou: %d\n",filmes[i].getNome(),ption);
                return ption;
            }
        }
        return -1;
    }
    public void showFilme()
    {
        
        System.err.printf("Caso deseje mostrar todos os filmes digite all%n Caso deseje procurar por genero digite a tipo:%n");
        Scanner input = new Scanner(System.in);
        String op=input.nextLine();
        if (op=="all")
        {
            for(int i=0;i<getFilmes().length;i++)
            {
                System.out.printf("%s\n",this.filmes[i].getNome());
            }
        }
        else
        {
            System.out.printf("Foram encontrados os seguintes filmes:%n");
            for(int i=0;i<getFilmes().length;i++)
            {
                
                if (op.toLowerCase()==getFilmes()[i].getGenero())
                {
                    System.out.printf("[%s]%n",getFilmes()[i].getNome());
                }
            }
        }
    }
    public void exibirTudo()
    {
        for(int i=0;i<getFilmes().length;i++)
        {
            System.out.printf(" Codigo do filme: %d%n Nome do filme: %s%n Genero: %s%n Sinopse: %s%n%n",getFilmes()[i].getCodigo(), getFilmes()[i].getNome(), getFilmes()[i].getGenero(),getFilmes()[i].getSinopse());
        }
    }
}
class Opinioes
{
    private Avaliacao[] feedback;
    Opinioes(Avaliacao[] feedback)
    {
        this.feedback=feedback;
    }
    public void setFeedback(Avaliacao[] opiniao)
    {
        this.feedback=opiniao;
    }
    public Avaliacao[] getFeedback()
    {
        return this.feedback;
    }
    public double mediaAvaliacao(int cod)
    {
        double media=0;
        int soma=0;
        for(int i=0;i<getFeedback().length;i++)
        {
            if (getFeedback()[i].getCodigo()==cod)
            {
                media=media+getFeedback()[i].getNota();
                soma++;
            }
        }
        if (soma==0)
        {
            System.out.printf("Nenhum filme encontrado com esse identificador");
            return 0;
        }
        return media/soma;
    }
    public int melhorAvaliacao(int codigo)
    {
        int melhor=-1;
        //int pos=-1;
        ////Pensei em fazer um que mostra a posição da melhor nota mas como a questão não pediu
        ////Retirei, e deixei como está.
        for (int i=0;i<getFeedback().length;i++)
        {
            if (codigo==getFeedback()[i].getCodigo())
            {
                int nota=getFeedback()[i].getNota();
                if (nota==5)
                {
                    //pos=i;
                    return nota;
                }
                else if (melhor<nota)
                {
                    melhor=nota;
                    //pos=i;
                }
            }
        }
        if (melhor==-1)
        {
            System.out.printf("Nenhum filme encontrado com esse código.");
            return melhor;
        }
        return melhor;
    }
    public int piorAvaliacao(int codigo)
    {
        int pior=666666;
        //int pos=-1;
        ////Pensei em fazer um que mostra a posição da pior nota mas como a questão não pediu
        ////Retirei, e deixei como está.
        for (int i=0;i<getFeedback().length;i++)
        {
            if (codigo==getFeedback()[i].getCodigo())
            {
                int nota=getFeedback()[i].getNota();
                if (nota==0)
                {
                    //pos=i;
                    return nota;
                }
                else if (nota<pior)
                {
                    pior=nota;
                    //pos=i;
                }
            }
        }
        if (pior==666666)
        {
            System.out.printf("Nenhum filme encontrado com esse código.");
            return pior;
        }
        return pior;
    }
    public void exibirTudo()
    {
        for(int i=0;i<getFeedback().length;i++)
        {
            System.out.printf(" Codigo do filme: %d%n Usuário: %s%n Nota: %d%n Comentário: %s%n%n",getFeedback()[i].getCodigo(), getFeedback()[i].getUsername(), getFeedback()[i].getNota(),getFeedback()[i].getComentario());
        }
    }
}
