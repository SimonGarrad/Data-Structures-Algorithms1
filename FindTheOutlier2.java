package forGithub;
import java.util.*;
public class FindTheOutlier2{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input A");
        int A = scanner.nextInt();
        System.out.println("A = "+A);
        System.out.println("");
        System.out.println("Please input B");
        int B = scanner.nextInt();
        System.out.println("B = "+B);
        System.out.println("");
        System.out.println("Please input C");
        int C = scanner.nextInt();
        System.out.println("C = "+C);
        System.out.println("");
        int max=0;
        int min=0;
        int middle=0;

        if (A>B&&A>C){
            max=A;
        }
        else if (B>C&&B>A){
            max=B;
        }
        else if (C>A&&C>B){
            max=C;
        }
        if (A<B&&A<C){
            min=A;
        }
        else if (B<C&&B<A){
            min=B;
        }
        else if (C<A&&C<B){
            min=C;
        }
        if (A==max&&B==min||B==max&&A==min){
            middle=C;
        }
        else if (B==max&&C==min||C==max&&B==min){
            middle=A;
        }
        else if (C==max&&A==min||A==max&&C==min){
            middle=B;
        }
        if (A==B||B==C||A==C){
            System.out.println("NA");
        } 
        System.out.println("max= "+max);
        System.out.println("min= "+min);
        System.out.println("middle= "+middle);
        if((max-middle)>(middle-min)){
            System.out.println("The outlier is " + max);
        }
        else if ((max-middle)==(middle-min)){
            System.out.println("NA");
        }
        else System.out.println("The outlier is " + min);
    }
}