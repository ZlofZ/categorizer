package controller;

import IO.IOController;
import model.Documnt;

import java.io.File;
import java.util.ArrayList;

public class Categorizer{
	private static IOController io;
	private static ArrayList<Documnt> documents;
	private String lastHandled;
	
	private void getCSVData(){
		ArrayList<String> csvRows = io.loadTxt(new File("csv/barcodes.CSV"));
		for(String row: csvRows){
			String[] splitRow = row.split(",");
			String barcode = splitRow[16].substring(1,splitRow[16].length()-1);
			String name = splitRow[9].substring(1,splitRow[9].length()-1);
			if(lastHandled.compareTo(name)<0 && lastHandled.length() <= name.length()){
				documents.add(new Documnt(name));
			}
		}
	}
	
	public Categorizer(){
		io = new IOController();
		
	}
}
