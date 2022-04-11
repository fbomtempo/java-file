package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class try_with_resources {

	public static void main(String[] args) {

		/*String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}*/
		
		String path = "C:\\temp\\out.txt";
		String[] lines = new String[] {"Teste1", "Teste2", "Teste3"};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
