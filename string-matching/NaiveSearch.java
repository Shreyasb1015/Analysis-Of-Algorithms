import java.util.*;
import java.util.Scanner;

public class NaiveSearch {
 
    static void search(String pat, String txt)
    {
        int l1 = pat.length();
        int l2 = txt.length();
        int i = 0, j = l2 - 1;
 
        for (i = 0, j = l2 - 1; j < l1;) {
 
            if (txt.equals(pat.substring(i, j + 1))) {
                System.out.println("Pattern found at index "
                                   + i);
            }
            i++;
            j++;
        }
    }
     
     
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String pat=scanner.nextLine();
        System.out.print("Enter the match: ");
        String mat=scanner.nextLine();    
        search(pat, mat);
    }
}
