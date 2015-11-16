 
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author naylj6470
 */
public class Recurssion {

    /**
     * @param args the command line arguments
     */
    
    //Problem 1
    static int sumDigits(int n)
        {
            
            if(n == 0)
            {
                return 1;
            }else
            {
                return sumDigits(n%1) + sumDigits(n/2);
            }
            
            
//            int n1 = n%10;
//            int n2 = n/10;
//            int n3 = n2%10;
//            int n4 = n2/10;
//            System.out.println(n1);
//            System.out.println(n2);
//            System.out.println(n3);
//            System.out.println(n4);
//            int sum = n1+n3+n4;
//            System.out.println(sum);
//            return sum;
            
//            for(int i = 0;)
//            {
//            
//            }
            
            
            
        }
    
    
    public int marble(int[] bags, int max){
        if(bags.length == 0){
            return 0;
        }
        int[] leftovers = new int[bags.length - 1];
        int aBag = bags[0];
        for(int i=0; i<leftovers.length; i++){
            leftovers[i] = bags[i+1];
            }
        int with = aBag + marble(leftovers,max-aBag);
        int without = marble(leftovers,max);
        if(with>without && with<=max){
            return with;
        }else if(without>with && without<=max){
            return without;
        }else{
            return 0;
        }
    }   
    
    
    public boolean isPalindrome(String s){
        if(s.length() <= 1){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1,s.length()-1));
        }else{
            return false;
        }
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        
//        System.out.println(sumDigits(n));
//        
//        
//        System.out.println(126%10);
//        System.out.println(12/10);
//        System.out.println(12%10);
//        System.out.println(isPalindrome(racecar));
        
        
    }

    
}
