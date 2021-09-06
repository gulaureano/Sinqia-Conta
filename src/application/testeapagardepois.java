package application;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class testeapagardepois {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String pathSourceFile = "C:\\Users\\gustavo.jesus\\Desktop\\java\\classe.txt";
		File file = new File(pathSourceFile);
		List<ProdutoApagarDepois> produto = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String line = br.readLine();
			
			while (line != null) {
				String[] array = line.split(",");
				
				String nome = array[0];
				Double valor = Double.parseDouble(array[1]);
				Integer quantidade = Integer.parseInt(array[2]);
				
				produto.add(new ProdutoApagarDepois(nome, valor, quantidade));
				line = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\gustavo.jesus\\Desktop\\java\\summary.txt"))){
				for (int i=0; i<produto.size();i++){
					bw.write(produto.get(i).nome + ", " + String.format("%.2f", produto.get(i).total()));
					bw.newLine();
				}
			}
		}
		catch (IOException e){
			System.out.println("Error in reading file: " + e.getMessage());
		}
			
	}
}

// C:\Users\gustavo.jesus\Desktop\java\classe.txt