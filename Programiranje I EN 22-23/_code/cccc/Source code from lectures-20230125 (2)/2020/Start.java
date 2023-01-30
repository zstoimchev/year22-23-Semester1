
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PovezanSeznam pp = new PovezanSeznam();
		pp.insert(88);
		pp.insert(8);
		pp.insert(1188);
		pp.insert(11);
		pp.insert(22);
		System.out.println(pp.member(88));
		System.out.println(pp.member(555));
		pp.delete(88);
		System.out.println(pp.member(88));
		System.out.println(pp.member(555));
		for(int i = 0; i < 40000; i++) {
			pp.insert(i);
		}
		System.out.println(pp.member(9999));
		
	}

}
