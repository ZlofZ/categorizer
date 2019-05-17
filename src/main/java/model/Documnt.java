package model;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class Documnt extends PDF{
	
	
	
	
	
	
	
	
	
	//==========================================================
	public Documnt(PDDocument file , String fileName) throws IOException{
		super(file , fileName);
	}
	
	public Documnt(File file , String fileName) throws IOException{
		super(file , fileName);
	}
	
	public Documnt(String fileName){
		super(fileName);
	}
}
