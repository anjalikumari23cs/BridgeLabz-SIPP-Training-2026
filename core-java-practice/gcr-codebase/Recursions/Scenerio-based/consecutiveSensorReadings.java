import java.util.Scanner;
public class consecutiveSensorReadings {
    public static boolean checkReading(int arr[],int index){
        if(index>=arr.length) return true;
        if(arr[index]<arr[index-1]+1) return false;
        return checkReading(arr,index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of readings: ");
        int n=sc.nextInt();
        System.out.println("Enter readings: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean result=checkReading(arr,1);
        System.out.print(result);
    }
}
