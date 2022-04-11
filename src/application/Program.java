package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*File arquivo = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		
		for (File folder: folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		
		for (File file: files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subDir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());

		sc.close();
	}

}
