//Java program to find the given string is pallindrome or not
import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the words(in lowercase)");
        String word=sc.nextLine();
        isPallindrome(word);
    }
    
    public static void isPallindrome(String str){
        String first_half="";
        String second_half="";
        for(int i=0;i<=str.length()/2;i++){
             first_half=first_half+str.charAt(i);
             second_half=second_half+str.charAt((str.length()-1)-i);           

        }
        // System.out.println(first_half);
        // System.out.println(second_half);
        if(first_half.equals(second_half)){
            System.out.println("Given word is Pallindrome");
        }
        else{
            System.out.println("Given word is Not Pallindrome");
        }
    }
}
