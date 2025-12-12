package Practise;


class Car {
	
	String Brand;
	int Year;

	Car (){

      this.Brand = "Unknown";
      this.Year = 2020;
	}

	Car (String Brand){

       this.Brand = Brand;
       this.Year= 2021;
	}

	Car (String Brand, int Year){
      
      this.Brand= Brand;
      this.Year=Year;

	}
	
	
	public void display() {
		System.out.println( "Car is " + Brand + " and model of " + Year);
		
	}
	
}


public class Constructor_OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj = new Car();
		obj.display();
		
		Car objj = new Car("Toyoto");
        objj.display();		
	
        Car objjj = new Car("Hundai", 2024);
        objjj.display();		
		
        
	}

}









