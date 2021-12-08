package modify;

public class Redmi7 implements IPhone {
	public String GetPhonePart1() {
		return "Display";
	}

	@Override
	public double GetPart1Cost() {
		
		return 1000;
	}
}
