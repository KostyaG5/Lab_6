package LAB_5_Another_Classes;
import java.util.ArrayList ;

public class Paralelograms {
	
	private static ArrayList<Paralelogram> paralelograms ;
	
	public  Paralelograms() {
		Paralelograms.paralelograms = new ArrayList<Paralelogram>() ;
	}

	public ArrayList<Paralelogram> getParalelograms() {
		return paralelograms;
	}

	public void setParalelograms(ArrayList<Paralelogram> paralelograms) {
		Paralelograms.paralelograms = paralelograms;
	}

	public boolean AddParalelogram(Paralelogram paralelogram) {
		boolean result = false ;
		if(Paralelograms.paralelograms.add(paralelogram)) 
			result = true ;	
		
		
		return result ;
	}
	
	
	
	public static Paralelogram findParalelogramMaxSquare() {
		Paralelogram maxParalelogramArea = paralelograms.get(0);
        for (int i = 1; i < paralelograms.size(); i++) {
            if (paralelograms.get(i).getArea() > maxParalelogramArea.getArea()) {
                maxParalelogramArea = paralelograms.get(i);
            }
        }
        return maxParalelogramArea;
    }
    public static Paralelogram findParalelogramMinSquare() {
    	Paralelogram minParalelogramArea = paralelograms.get(0);
        for (int i = 1; i < paralelograms.size(); i++) {
            if (paralelograms.get(i).getArea() < minParalelogramArea.getArea()) {
                minParalelogramArea = paralelograms.get(i);
            }
        }
        return minParalelogramArea;
    }
	

    @Override
	public String toString() {
		String result = "" ;
		
		for(Object paralelogram: Paralelograms.paralelograms) {
			result += paralelogram.toString() + '\n' ;
		}
		
		return result += " Min square of paralelograms  is " + Paralelograms.findParalelogramMinSquare() + "\n" + " Max square of paralelograms  is " + Paralelograms.findParalelogramMaxSquare() + "\n\n" ;
	}
    
    
	
}