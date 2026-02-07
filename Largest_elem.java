public class Largest_elem{
    public static void FindLargest(int[] arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("The largest elem is:"+largest);
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,22,47,549,-37,29};
        FindLargest(arr);
    }
}