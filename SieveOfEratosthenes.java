package forGithub;

import java.util.Scanner;
public class SieveOfEratosthenes{
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please input the first number");
        int a = scanner.nextInt();
        System.out.println("Please input the second number");
        int z = scanner.nextInt();
        int n =0;
        int count=0;
        int primes=0;

        System.out.println("The prime numbers between " + a + " and " + z +" are:");

// makes sure numbers inputed are smallest to largest.
        if (z<a){
            n=z;z=a;a=n;
        }
// excludes "0" and "1".
        if ((a==0)||(a==1)){
            a=2;
        }
//these will be used to create and fill the array.
        int j=a;
        int [] array= new int [(z-a)];
//creating the array starting and finishing with a-z.
        for (int i=0; i<=array.length-1; i++, j++){
            array[i]=j;
        }
//checks if the number is prime and adds to primes if so.
        for (int i=0; i<=array.length-1; i++){
            for (int k=1; k<=array[i]/2; k++){
            if(array[i]%k==0){
                count++;
            }
        }
//printing time!
            if (count <2){
                primes++;
                // System.out.println("");
                System.out.println(array[i]);
            }
            count=0;
        }
//this is just to make sure it's working, this prints out the array.
        // for (int i=0; i<=array.length-1;i++){
        // System.out.print(array[i]+", ");
        // }
//this prints out the prime numbers found.
        // System.out.print("");
        System.out.print("There are " + primes + " prime numbers between " + a + " and " + z);
    }
}