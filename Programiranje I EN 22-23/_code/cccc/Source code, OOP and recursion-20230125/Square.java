
public class Square {
	public Square(int a){
		this.a = a;
	}
	
	int a;
	protected void draw(){
		for(int i = 0; i < a; i++){
			for(int j = 0; j < a; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
