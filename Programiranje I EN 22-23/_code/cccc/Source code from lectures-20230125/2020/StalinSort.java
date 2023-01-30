
public class StalinSort {
	static void stalinSort(int []a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= max) {
				max = a[i];
				System.out.println(a[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1, 16, 5, 88, 44, 777};
		stalinSort(numbers);
		
	}

}
