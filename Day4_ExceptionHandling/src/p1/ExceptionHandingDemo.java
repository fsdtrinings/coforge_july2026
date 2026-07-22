package p1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.*; // #include ios....h


public class ExceptionHandingDemo 
{
	public static void main(String[] args) {
		
		
		String str = "Ramesh";
		System.out.println(" loading of layout ...");
		try {
			System.out.println("Welcome "+str.charAt(-80));
		} catch (Throwable e) {
			System.out.println(e);
		}
		finally {
			System.out.println("System ending");
		}
		
		System.out.println("process end");
	
		// -----------------------------------------
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File("File.txt"))))
		{
			System.out.println("A");
			
			System.out.println("Welcome "+str.charAt(-80));
			br.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
		
		
		catch (IOException e) {
			System.out.println(e.toString());
		}
		
		catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}


















