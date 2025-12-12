package Alert;

public interface ScreenShot_InterFace {
	
	public default void snapShot() {
		System.out.println("ScreenShot is captured");
	}
	
	public void snapShot2();

}
