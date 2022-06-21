package com.capgemini.javaAssignment1;

import java.io.File;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class JavaAssignment1 {

	public static void main(String[] args) throws Exception {
		int count=0;
		String[] stringToSearch;
		Scanner in = new Scanner(new File(".\\src\\test\\resources\\Datafiles\\SearchKeyword.csv"));
		do {
			stringToSearch=in.nextLine().split(", ");
		}while(in.hasNext());
		File file = new File(".\\src\\test\\resources\\Datafiles\\Alexander's_Resume.pdf");
		PDDocument doc= PDDocument.load(file);
		PDFTextStripper pdfTextStripper =new PDFTextStripper();
		String resumeText=pdfTextStripper.getText(doc);
		for(int i=0;i<stringToSearch.length;i++) {
			if(resumeText.contains(stringToSearch[i])){
				count++;
			}
		}
		System.out.println(count);
		float perc = ((float)count/stringToSearch.length)*100;
		System.out.println("Percentage of matches : "+perc+"%");
		// extractor.close();
	}

}
