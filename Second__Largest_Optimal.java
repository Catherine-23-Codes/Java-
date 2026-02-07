import java.util.*;

public class Second__Largest_Optimal {
    public static void secondLargest(int[]arr){
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(num > largest){
                second_largest=largest;
                largest=num;
            } else{
                if(num>second_largest && num!=largest){
                    second_largest=num;
                }
            }
        }
        System.out.println("The second largest number is:"+second_largest);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,85,-2,7,22,4};
        secondLargest(arr);
    }
}
