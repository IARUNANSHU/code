import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the original string");
        String s1=sc.nextLine();
        System.out.println("enter the subsequence string");
        String s2=sc.nextLine();
        System.out.println(issubsequence(s1, s2));
    }
    public static boolean issubsequence(String s1,String s2){
        int j=0;
        for(int i=0;i<s1.length()&&j<s2.length();i++)
        {
            if (s1.charAt(i)==s2.charAt(j)) {
                j++;
            }
        }
        return j==s2.length();
    }
}



//recursive solution

// static boolean isSubSeq(String s1, String s2, int n, int m){
//         if( m == 0 )
//             return true;
        
//         if( n == 0 )
//             return false;
            
//         if ( s1.charAt(n-1) == s2.charAt(m-1) )
//             return isSubSeq(s1, s2, n-1, m-1);
        
//         else
//             return isSubSeq(s1, s2, n-1, m);
//     }