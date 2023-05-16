package simpli.lis;
import java.util.Scanner;
public class LongestIncreasingSubsequence {
	public static int lis(int[] arr,int n) {
		int[] lis = new int[n];
		int max=1;
		
		for(int i=0;i<n;i++) {
			lis[i] = 1;
			for(int j=0;j<i;j++) {
				if (arr[i]>arr[j] && lis[i]<lis[j] + 1) {
					lis[i]=lis[j]+1;
					if (max<lis[i]) {
						max=lis[i];
					}
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter the elements in the array:");
		for (int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int n =size;
		System.out.println("Length of longest increasing subsequence is :" + lis(arr,n));	

	}

}


