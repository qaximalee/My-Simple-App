
public interface FourWheeler {

	public void engineSpec();
	public void weight();
	
	default void show(){
		System.out.println("FourWheeler interface");
	}
}
