/* Second Largest Better
 1) 1st Pass -
    First we find the largest elem using optimal way

 2) 2nd pass-
    we take second largest to be -1
    then compare all the elem to second_largest
    Imp cond-- if our arr index is greater than second largest && arr index is not equal 
     to largest,
        then we have found our second largest elem;


    T.C = O(N+N)=O(2N)
 */

public class Second_Largest_Better{
    public static void largestelem(int[]arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("The largest elem is:"+largest);
    }
    public static void secondLargest(int[]arr){
        int second_largest=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
           // if(arr[i]>second_largest && arr[i]!=largest){
                System.out.println("the second largest is:"+second_largest);
            }
        }
        public static void main(String[] args) {
        int[]arr={1,2,4,5,6,2,-4,6};
        secondLargest(arr);
    }
    }

