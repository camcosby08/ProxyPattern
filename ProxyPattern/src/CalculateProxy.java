
public class CalculateProxy implements IMath {
	
	private Math math = new Math();

	@Override
	public double Add(double x, double y) {
		return math.Add(x, y);
	}

	@Override
	public double Subtract(double x, double y) {
		return math.Subtract(x, y);
	}

	@Override
	public double Multiply(double x, double y) {
		return math.Multiply(x, y);
	}

	@Override
	public double Divide(double x, double y) {
		return math.Divide(x, y);
	}

}
