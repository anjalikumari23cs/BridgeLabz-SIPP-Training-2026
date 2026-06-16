import java.util.*;
public class employeeSkillAssignment {
    public static int[] employeeSkill(int arr[],int target,int index){
        //sum of subset 
        if(target==0){
            return new int[0];
        }
        if(index>=arr.length){
            return null;
        }
        if(arr[index]<=target){
            int[] include=employeeSkill(arr,target-arr[index],index+1);
            if(include!=null){
                int[] result=new int[include.length+1];
                result[0]=arr[index];
                for(int i=0;i<include.length;i++){
                    result[i+1]=include[i];
                }
                return result;
            }
        }
        return employeeSkill(arr,target,index+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter employee skill levels: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target skill level: ");
        int target=sc.nextInt();
        int result[]=employeeSkill(arr,target,0);
        System.out.println("Output: ");
        if(result==null){
            System.out.println("No valid combination found.");
        } else {
            for(int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }
        }
    }
}
