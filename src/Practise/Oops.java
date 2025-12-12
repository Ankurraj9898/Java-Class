package Practise;




 class Pen {
	 
	 String colour;
	 String brand;
	 
	 public void info () {
		 
		 System.out.println(colour);
	 }

 }

public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen pen = new Pen();
		
		Pen pen2= new Pen();
		
		pen.colour="Blue";
		pen.brand="Cello";
		
		pen2.colour="Red";
		
		pen2.info();
		
	}

}
