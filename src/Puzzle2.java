
public class Puzzle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true && false && false;
		boolean c = true & false & false;
		
		System.out.println("B: " + b);
		System.out.println("B: " + c);
		
		int i1 = 35;
		int i2 = 175;
		int i3 = 045;
		float f1 = 0x57f;
		double d1 = 3D;
		short x = 0x7fff;
		
		i1 += i1 + i2 + i3;
		x += 1;
		
		d1 += (i1*f1)/d1;
		d1 -= x;
				
		System.out.println("D1 = " + d1);
		
		Puzzle3 p = new Puzzle3();
		System.out.println("ajhsjdhakjh...");
	}

}

class Puzzle3 {
		static {
		System.out.println("Este programa Java roda sem ter um metodo main...");
	}
}
