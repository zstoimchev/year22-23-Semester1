
public class Minimum {

	static int min(int[] n, int previousMin) {
		int tmp = n[0];
		if(tmp == previousMin) {
			tmp = n[1];
		}
		for(int i = 0; i < n.length; i++) {
			if(tmp > n[i] && n[i] != previousMin) {
				tmp = n[i];
			}
		}
		return(tmp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1, 5, 17 ,8 ,9, 6, 7};
		int minmin = min(numbers, Integer.MAX_VALUE);
		int minmin2 = min(numbers, minmin);
		System.out.println(minmin2);
	}

}
