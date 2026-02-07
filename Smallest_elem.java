public class Smallest_elem {
    public static void FindSmallest(int[]arr){
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest)
                smallest=arr[i];
        }
        System.out.println("The smallest elem is:" + smallest);
    }
    public static void FindLargest(int[]arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        } 
        System.out.println("the largest elem is:" + largest);
    }
    public static void main(String[] args) {
        int[]arr={10,28,-47,572,488,100,37,41,388,-17};
        FindLargest(arr);
        FindSmallest(arr);


    }
}
