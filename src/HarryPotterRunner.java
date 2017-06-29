
public class HarryPotterRunner {
	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter harry1 = new HarryPotter();
		// 2. become invisible
		harry1.makeInvisible(true);
		// 3. spy on professor snape
		harry1.spyOnSnape();
		// 4. become visible again
		harry1.makeInvisible(false);
		// 5. cast a “stupefy” spell
		harry1.castSpell("STUPEFY!!");
	}
}
