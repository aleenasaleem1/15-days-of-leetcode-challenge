import java.util.Scanner;
public class Solution {
    public static boolean isPalindrome(String s){
        
        String str=s.toLowerCase();
        int st=0;
        int end =str.length()-1;

        while (st<=end){
            if (!isAlphaNumeric(str.charAt(st))){
            st++;
            continue;}
            if (!isAlphaNumeric(str.charAt(end))){
                end--;
                continue;}
           
            if (str.charAt(st)!=str.charAt(end))
            return false;
            else
            st++;
            end--;
        }
        return true;
    }
    public static boolean  isAlphaNumeric(char s){
        if (Character.isLetter(s) || Character.isDigit(s))
        return true;

        return false;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a string");
        String s= sc.nextLine();
        boolean result =isPalindrome(s);
        System.out.println("Is palindrome"+ result);
        
        

    }
    
}