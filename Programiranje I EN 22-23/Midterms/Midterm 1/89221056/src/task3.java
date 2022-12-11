import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number of elements: ");
		int n=scan.nextInt();			//enter length of array
		int[] arr1= new int[n];			//creating array of length n
		
		int sum=0;

		System.out.print("Enter elements: ");
		for(int i=0; i<n; i++)
			arr1[i]=scan.nextInt();		//enter array elements
		
		int biggest=arr1[0];			//biggest number from the array
		for(int i=0; i<n; i++)
			if(biggest<arr1[i])			//find biggest number
				biggest=arr1[i];
		
		for(int i=n/2; i<n; i++)
			sum+=arr1[i];
		
		System.out.println("Biggest number: \t"+biggest);
		System.out.println("Sum of second half: \t"+sum);
		System.out.print("Numbers divisible by 7: ");
		for(int i=0; i<n; i++)
			if(arr1[i]%7==0)			//print integers divisible by 7
				System.out.print(arr1[i]+" ");
		
		scan.close();
	}

}
