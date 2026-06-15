import java.util.*;
public class simpleInterest {
    public static void simpleinterest(int principle,int rate,int time){
        int simpleInterest=(principle*rate*time)/100;
        System.out.println(simpleInterest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principle=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        simpleinterest(principle, rate, time);
    }
}
