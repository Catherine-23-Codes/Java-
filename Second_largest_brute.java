/* Second Largest- Brute force
    1) wkt-> largest =arr[n-1];
    2) for second largest, we sort the elem and run loop in descending order!
     so here we use "n-2" as initial condition till i>=0 and decrement the loop! 


     T.C = Sorting- O(nlogn + n)
     S.C = O(1)
 */



import java.util.Arrays;

public class Second_largest_brute {
    public static void FindSecondLargest(int[] arr){
        Arrays.sort(arr); // Sort the array in ascending order

        int n = arr.length;
        int secondLargest = -1;

        // Start from second-last element and find the first number that's not equal to the largest
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] != arr[n - 1]) {
                secondLargest = arr[i];
                break;
            }
        }
            System.out.println("The second largest is: " + secondLargest);
    }
    

    public static void main(String[] args) {
        int[] arr = {1, 7, 38, 2, 9, 2, 19, 2, 2};
        FindSecondLargest(arr);
    }
}