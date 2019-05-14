package Core02.Static;

public class Static {
	private static int staticCount = 0;
	private int nonStaticCount = 0;

	public void incrementCounter() {
		staticCount++;
		nonStaticCount++;
	}

	public static int getStaticCount() {
		return staticCount;
	}

	public int getNonStaticCount() {
		return nonStaticCount;
	}

	public static void main(String args[]) {

		Static me1 = new Static();
		Static me2 = new Static();
		Static me3 = new Static();
		Static me4 = new Static();
		Static me5 = new Static();

		me1.incrementCounter();
		me2.incrementCounter();
		me3.incrementCounter();
		me4.incrementCounter();
		me5.incrementCounter();

		System.out.println("staticCount = " + Static.getStaticCount());
		System.out.println("nonStaticCount of me1 = " + me1.getNonStaticCount());
		System.out.println("nonStaticCount of me2 = " + me2.getNonStaticCount());
		System.out.println("nonStaticCount of me3 = " + me3.getNonStaticCount());
		System.out.println("nonStaticCount of me4 = " + me4.getNonStaticCount());
		System.out.println("nonStaticCount of me5 = " + me5.getNonStaticCount());
	}
}