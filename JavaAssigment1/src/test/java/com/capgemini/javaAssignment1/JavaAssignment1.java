package com.capgemini.javaAssignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JavaAssignment1 {

	public static void main(String[] args) throws Exception {
		int count=0;
		String[] stringToSearch;
		List<String> listOfSrings = new ArrayList<String>();
		Scanner in = new Scanner(new File("C://Users/ALEXFERN/Downloads/SearchKeyword.csv"));
		do {
	    stringToSearch=in.nextLine().split(", ");
		}while(in.hasNext());
		Scanner ni = new Scanner(new File("C://Users/ALEXFERN/Downloads/AlexanderResume.txt"));

	    for(;ni.hasNext();){
	        listOfSrings.add(ni.next());
	    }
	    String[] stringofFile = listOfSrings.toArray(new String[0]);
	    for(int i=0;i<stringToSearch.length;i++) {
	    	for(int k=0;k<stringofFile.length;k++) {
			    if(stringofFile[k].contentEquals(stringToSearch[i])){
			        count++;
			        break;
			    }
	    	}
	    }
	    float perc = ((float)count/stringToSearch.length)*100;
	    System.out.println("Percentage of matches : "+perc+"%");
	    
	}

}
