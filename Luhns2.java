package forGithub;

import java.util.*;
public class Luhns2{
    public static void main(String args[]){
        System.out.println("Please input any credit card number to see if it is valid");
        System.out.println("For example: 6289572841");
        Scanner sc = new Scanner(System.in);
        String ccnumber=sc.nextLine();
        int [] array= new int [ccnumber.length()];
        int sum=0;
        //Creates an int array from each char of the string using Character.getNumericValue
        for(int i=0; i<=array.length-1; i++){
            array[i] = Character.getNumericValue(ccnumber.charAt(i));
        }
        //manages every 2nd number n*2-9
        for (int i=array.length-2; i>=0; i-=2){
            array[i]=array[i]*2;
                if ((array[i])>9){
                    array[i]=array[i]-9;
            }
        }
        //adds up the contents of the array
        for (int i=0;i<=array.length-1; i++){
            sum+=array[i];
        }
        //checks if the number is valid or invalid
        if (ccnumber.length()<4||ccnumber.length()>30||sum%10!=0){
            System.out.println("Invalid");
        }
        else if (sum%10==0){
            System.out.println("Valid");
        }
    }
}