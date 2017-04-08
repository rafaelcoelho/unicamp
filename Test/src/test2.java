
public class test2 {
	public test2(int w, int x) {
		super();
		this.w = w;
		this.x = x;
	}

	public int w;
	public int x;
	
	public int doSomething(){
		
		x = 1;
		for (int i = 0; i <= 100; i++) {
			for (int j = 50; j < 100; j++) {
				x++;
			}
		}
		
		return x;
	}
}
