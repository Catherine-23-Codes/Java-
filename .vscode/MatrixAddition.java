import java.util.Scanner;
public class MatrixAddition {
    public static void main(String [] args){
        if(args.length!=0){
            System.out.println("Please provide a valid value of N for command line argument!");
            return;
        }
        int N= Integer.parseInt(args[0]);
        int[][] matrix1=new int [N][N];
        int[][] matrix2=new int[N][N];
        int[][] SumMatrix=new int[N][N];

        Scanner sc=new Scanner(System.in);
        System.out.println("The firts matrix is:");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                matrix1[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter second matrix :");
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            matrix2[i][j]=sc.nextInt();
        }
    }
    System.out.println("The sum matrix is:");
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            SumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
        }
    }
    System.out.println("the sum of the resultanat matrix is:");
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            System.out.print(SumMatrix[i][j]+" ");
        }
    }
    System.out.println( );
    sc.close();
}
}