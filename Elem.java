import java.util.*;
import java.util.Arrays;
public class Elem {
    public static int Larger(int[] arr){
        for(int i=0;i<arr.length;i++){
                Arrays.sort(arr);  
        }
       return arr[arr.length-1];  
    }
    public static void main(String[] args) {
        int[] arr={1,73,5,27,-28};
        int largest=Larger(arr);
        System.out.println("The largest elem is:"+largest);
    }
}
