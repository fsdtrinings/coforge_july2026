package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainFile {

	public static void main(String[] args) {
		try {
			MainFile app = new MainFile();
			
			String filePath = "C:\\Users\\ashis\\OneDrive\\Desktop\\Coforge\\corejava_ws\\Day1App\\src\\p1\\EmployeeMain.java";
			
			app.doRead(filePath,"getSalary");
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}//end main
	
	
	
	// File f = new File(path);
	// PrintWrite pw = new PrintWriter(new FileWriter(file, true));
	//   true - update
	//   false
	
	
	
	
	public void doRead(String path,String findText) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		List<Integer> lineNumbers = new ArrayList<>();
		String line = null;
		int x = 1;
		
		while((line = br.readLine())!=null)
		{
			System.out.println((x)+"\t"+line);
			if(line.contains(findText))
			{
				lineNumbers.add(x);
			}
			x++;
		}
		
		
		if(lineNumbers.size()>0)
		{
			System.out.println(findText+" Found ");
			lineNumbers.stream().forEach((a)->System.out.print(a+","));
		}
	}
}
