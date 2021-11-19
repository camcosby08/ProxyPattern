
public class Main {

	public static void main(String[] args) {
		System.out.println("This Program Impliments a Simple Proxy Pattern.");
		
		//create math proxy
		CalculateProxy proxy = new CalculateProxy();
		
		System.out.println("Add Calculation: " + proxy.Add(10, 5));

	}

}
