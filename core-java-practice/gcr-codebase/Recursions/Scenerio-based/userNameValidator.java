import java.util.*;
public class userNameValidator {
    public static boolean isValidUserName(String username){
        boolean isValid=false;
        for(int i=0;i<username.length();i++){
            char ch=username.charAt(i);
            if(ch>='a'&&ch<='z'){
                isValid=true;
            } else {
                return false;
            }
        }
        return isValid;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        //username='abcds' o/p=true; only lowercase character no mueric value
        //username='abc123' o/p=false;
        System.out.print(isValidUserName(username));
    }
}
