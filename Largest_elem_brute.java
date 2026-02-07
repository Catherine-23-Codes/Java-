/*Largest elem in an array
   Brute force apporach -
  1) Sort the array
  2) wkt no.of elems(n)--> so arr[n-1] gives the largest elem 
 
  3)T.C = 0(N log N) -> sorting
  4)S.C = 0(1)

  There's no better solution for this
 */

  import java.util.Arrays;
  public class Largest_elem_brute {
    public static int findLargest(int[] arr) {
        // Sort the array in ascending order using **.sort() function**
        Arrays.sort(arr);
        // Return the last element (largest) i.e -->> arr[n-1]
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, -4, 56, 90};
        int largest = findLargest(arr);
        System.out.println("Largest element (brute force): " + largest);
    }
}

