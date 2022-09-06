package LAB_5_Another_Classes;

import java.util.ArrayList ;


public class Quadrangles {
	

	private static ArrayList<Quadrangle> quadrangles ;
	
	
	public  Quadrangles() {
		Quadrangles.quadrangles = new ArrayList<Quadrangle>() ;
	}

	public ArrayList<Quadrangle> getQuadrangles() {
		return quadrangles;
	}

	public void setQuadrangles(ArrayList<Quadrangle> quadrangles) {
		Quadrangles.quadrangles = quadrangles;
	}

	
	public boolean AddQuadrangle(Quadrangle quadrangle) {
		boolean result = false ;
		if(Quadrangles.quadrangles.add(quadrangle)) 
			result = true ;	
		
		
		return result ;
	}

	

	public static double getAverageSquare()
   {
       double area = 0;
       for (int i = 0; i < quadrangles.size(); i++) {
           area+=quadrangles.get(i).getArea();
       }
       return area/quadrangles.size();
    }

	
	
	
	
	@Override
	public String toString() {
		String result = "" ;
		
		for(Object quadrangle: Quadrangles.quadrangles) {
			result += quadrangle.toString() + '\n' ;
		}
		
		return result += " Average square of quadrangles is " + String.format("%.2f", Quadrangles.getAverageSquare()) + "\n" + " ------------------------------------------------------------------------\n" ;
	}
	

}

