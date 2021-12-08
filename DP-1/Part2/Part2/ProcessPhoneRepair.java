package modify;

public class ProcessPhoneRepair {
	public void RepairSteps(IPhone phone) {
		String part1 = phone.GetPhonePart1();
		
		System.out.println(String.format("{0} repaired",part1));
		
		double partCost = phone.GetPart1Cost();
		
		System.out.println(String.format("Repair Cost {0}", partCost*(0.5)));
	}
}
