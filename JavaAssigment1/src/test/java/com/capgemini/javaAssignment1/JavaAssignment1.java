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
		Scanner in = new Scanner(new File(".\\src\\test\\resources\\Datafiles\\SearchKeyword.csv"));
		do {
	    stringToSearch=in.nextLine().split(", ");
		}while(in.hasNext());
		Scanner ni = new Scanner(new File(".\\src\\test\\resources\\Datafiles\\AlexanderResume.txt"));

	    for(;ni.hasNext();){
	        listOfSrings.add(ni.next());
	    }
	    for(int i=0;i<stringToSearch.length;i++) {
			    if(listOfSrings.contains(stringToSearch[i])){
			        count++;
			    }
	    }
	    System.out.println(count);
	    float perc = ((float)count/stringToSearch.length)*100;
	    System.out.println("Percentage of matches : "+perc+"%");
	    
	}

}
