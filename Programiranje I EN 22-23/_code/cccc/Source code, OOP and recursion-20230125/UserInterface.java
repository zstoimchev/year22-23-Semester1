
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Disk disk = new Disk();
		if(disk.write("banana.txt", "banana")) System.out.println("OK");
		else System.out.println("ERROR");
	}

}
