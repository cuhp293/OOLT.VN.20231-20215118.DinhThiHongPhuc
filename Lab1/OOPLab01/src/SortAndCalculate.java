// Exercise 6.5
import java.util.Scanner;

public class SortAndCalculate {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int iN = keyboard.nextInt();

        System.out.println("Enter the elements in the array: ");
        int[] arr = new int[iN];

        for (int i=0; i<iN; i++)
            arr[i] = keyboard.nextInt();
        
        // Sort array
        for (int i=0; i<iN; i++) {
			for (int j=1; j < iN-i; j++ ) {
				if(arr[j-1] > arr[j]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}

        // Calculate sum
        int iSum = 0;
        for (int i=0; i<iN; i++)
            iSum += arr[i];
        int iAvg = iSum/iN;

        System.out.println("Array after sorting: ");
        for (int i=0; i<iN; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\n");

        System.out.println("Sum of the array: " + iSum);
        System.out.println("The average value of the array: " + iAvg);
    }
}