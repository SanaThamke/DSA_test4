package javamock1;

public class Average {

	public static void main(String[] args) {
		int[] arr= {3,5,7,8,3,4,67,87,89};
		int sum=0,i=0;
		do {
			sum+=arr[i];
			i++;
		}while(i<arr.length);
		
		System.out.println(sum/arr.length);

	}

}
