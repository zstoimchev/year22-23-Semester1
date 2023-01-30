
public class Square{
	int side;
	void draw () {
		for(int i = 0; i < side; i++) {
			for(int j = 0; j < side; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
