
public class StalinSort {

	static void stalin(int a[]) {
		int lastSurvivor = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= lastSurvivor) {
				System.out.println(a[i]);
				lastSurvivor = a[i];
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {8, 1, 6, 1000, 50, 20};
		stalin(numbers);
		numbers = new int[1000];
		numbers[777] = 777;
	}

}
