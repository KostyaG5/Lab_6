package LAB_6;

import java.util.Scanner;
import LAB_5_Another_Classes.Paralelogram;
import LAB_5_Another_Classes.Paralelograms;
import LAB_5_Another_Classes.Quadrangle ;
import LAB_5_Another_Classes.Quadrangles ;



public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);		
	
	
		System.out.println("\tEnter number of Quadrangles \n") ;
		final int  currentNumberQuadrangles = sc.nextInt();
		System.out.println("\tEnter number of Paralelograms \n") ;
		final int  currentNumberParalelograms = sc.nextInt();
		

	//	Paralelograms paralelograms = new Paralelograms(currentNumberParalelograms) ;
		
		Quadrangles quadrangles = new Quadrangles() ;
		for(int i = 0 ; i < currentNumberQuadrangles ; i++) {
			boolean correct = false ; 
			while(correct == false) {
				int x1 = (int)((Math.random()*40)-20) , x2 = (int)((Math.random()*40)-20) , x3 = (int)((Math.random()*40)-20) , x4 = (int)((Math.random()*40)-20)  , y1 = (int)((Math.random()*40)-20) , y2 = (int)((Math.random()*40)-20) , y3 = (int)((Math.random()*40)-20) , y4 = (int)((Math.random()*40)-20) ;
				boolean tempCorrect = Quadrangle.CheckCorrectCoordinate( x1,  x2,  x3,  x4,  y1,  y2,  y3, y4) ;
				if( tempCorrect == false) {
					correct = false ;
				} else {
					correct = true ; 
					Quadrangle quadrangel = new Quadrangle(x1 , x2 , x3 , x4 , y1 , y2 , y3 , y4);
					quadrangles.AddQuadrangle(quadrangel); 
					
				}
			 }
		 }
	  
		
		System.out.print(quadrangles.toString());
		
		
		Paralelograms paralelograms = new Paralelograms() ;
		for(int i = 0 ; i < currentNumberParalelograms ; i++) {
			boolean correct = false ; 
			while(correct == false) {
				int x1 = (int)((Math.random()*40)-20) , x2 = (int)((Math.random()*40)-20) , x3 = (int)((Math.random()*40)-20) , x4 = (int)((Math.random()*40)-20)  , y1 = (int)((Math.random()*40)-20) , y2 = (int)((Math.random()*40)-20) , y3 = (int)((Math.random()*40)-20) , y4 = (int)((Math.random()*40)-20) ;
				boolean tempCorrect = Paralelogram.CheckCorrectCoordinate( x1,  x2,  x3,  x4,  y1,  y2,  y3, y4) ;
				if( tempCorrect == false) {
					correct = false ;
				} else {
					correct = true ; 
					Paralelogram paralelogram = new Paralelogram(x1 , x2 , x3 , x4 , y1 , y2 , y3 , y4);
					paralelograms.AddParalelogram(paralelogram); 
					//System.out.println(paralelogram);
				}
			 }
		 }
		
		System.out.print(paralelograms.toString());
	//	System.out.print(" Min square of paralelograms  is " + Paralelograms.findParalelogramMinSquare() + "\n\n");
	//	System.out.print(" Max square of paralelograms  is " + Paralelograms.findParalelogramMaxSquare() + "\n\n");
	
	}
	
	
	
}

