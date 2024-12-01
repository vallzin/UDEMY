package secao15trabalhandocomarquivos.exerciciofixacao.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SourceFile {
	
	private String path;
	private String fileName;
	private List<Product> prod = new ArrayList<>();
	
	public SourceFile() {
	}

	public SourceFile(String path, String fileName, List<Product> prod) {
		this.path = path;
		this.fileName = fileName;
		this.prod = prod;
	}
	
	

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public List<Product> getProd() {
		return prod;
	}

	public void setProd(List<Product> prod) {
		this.prod = prod;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public void addProduct(Product product) {
		prod.add(product);
	}

	public void addProd(){
		try(BufferedWriter wr = new BufferedWriter(new FileWriter(path, true))){
			for (Product p : prod) {
				wr.write(p.toString());
				wr.newLine();
			}
		}catch(IOException e) {
			e.getMessage();
		}
	}
	
	public void addFolder() {
		
		File folder = new File(path);
		String targetPath = folder.getParent();
		
		boolean success = new File(targetPath + "\\out").mkdir();
		
		System.out.println("Folder created: " + success);
	}
	
	public void calcProd() {
		
		File newPath = new File(path);
		String pathCompleto = newPath.getPath();
		
		try(BufferedWriter wr = new BufferedWriter(new FileWriter(pathCompleto, true))){
			for (Product p : prod) {
				wr.write(p.getName() + ", "+ String.format("%.2f", p.total()));
				wr.newLine();
			}
		
		}catch(IOException e) {
			System.out.println("Error writing file: "+ e.getMessage());
		}
	}

}
