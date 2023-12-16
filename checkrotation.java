import java.util.Scanner;

public class checkrotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the original string");
        String s1=sc.nextLine();
        System.out.println("enter the rotated string");
        String s2=sc.nextLine();
        System.out.println(isrotated(s1, s2));
    }
    public static boolean isrotated(String s1, String s2){
        if (s1.length()!=s2.length()) {
            return false;
        }
        String temp=s1+s1;
        return temp.indexOf(s2)!=-1;
    }
}
