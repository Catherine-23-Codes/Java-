/* Optimal solution
  We assume largest is present in position arr[0],
  then we traverse the entire array and compare if its true or not
    If its true we update the largest elem
    else we compare and if not found, first elem is only the largest elem! 

    T.C = O(N)
    S.C = O(1)
 */

public class Largest_elem_Optimal {
    public static void largestElem(int[]arr){

    // main logic- we assume largest elem is in index 0
        int largest_elem=arr[0];
        //run a loop
        for(int i=0;i<arr.length;i++){
            // compare
            if(arr[i]>largest_elem){
                largest_elem=arr[i];
            }
        }
        System.out.println("The largest elem is:" +largest_elem);
    }
    public static void main(String[] args) {
        int[]arr={1,7,2,4,93,21,-2883};
         largestElem(arr);
    }
}
