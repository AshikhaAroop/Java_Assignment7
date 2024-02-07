import java.util.Scanner;

public class FindMaxSumOfArrayPair_1 {
    public static void main(String[] args) {

        int len;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the length of array");
        len=sc.nextInt();
        int [] arr = new int[len];
        System.out.println("Please enter the array items");
        for(int i=0;i<len;++i)
        {
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<len-1;++i)
        {
            for(int j=i;j<len-1;++j){
                if(arr[i]>arr[j+1]){
                    temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The pairs having max sum are "+arr[len-2]+" and "+arr[len-1]);
        int sum= arr[len-1]+arr[len-2];
        System.out.println("And the sum is "+sum);
    }
}