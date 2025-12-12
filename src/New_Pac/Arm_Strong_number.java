package New_Pac;

public class Arm_Strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 153;
		int b=a;
		
		int re=0;
		
		while(a >0) {
			
			int tem=a%10;
		     re= re+ (tem*tem*tem);
		     a=a/10;
		}
		
		if (b==re) {
			System.out.println(re +" is a Arm strong number");
		}
	}

}
