import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) 
	{
		Vector <String>  nomi = new Vector<>();
		Vector <String>  lavori = new Vector<>();
		Vector <String>  luoghi = new Vector<>();
		Vector <String>  dipendenti = new Vector<>();
		
		Scanner in;
		try {
			in = new Scanner(new BufferedReader (new FileReader("file.txt")));
			
			in.useDelimiter(",|\n");
			while (in.hasNext())
			{
				nomi.add(in.next());
				lavori.add(in.next());
				luoghi.add(in.next());
				dipendenti.add(in.next());
			}
			System.out.println(nomi);
			System.out.println(lavori);
			System.out.println(luoghi);
			System.out.println(dipendenti);
			
		} catch (IOException e)
		{
			System.out.println("Nessun file presente");
			System.exit(0);
		}
	}

}
