package forGithub;

import java.util.*;
public class FindTheOutlier{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 3 numbers");
        
        double [] array = new double[3];
        for (int i=0;i<array.length; i++){
            array[i]=scanner.nextDouble();
        }
        scanner.close();

        System.out.println("");

        sort(array);

        double max=array[2];
        double mid=array[1];
        double min=array[0];

        if ((max-mid)>(mid-min)){
            System.out.println("The outlier is " + max);
        }
        else if ((max-mid)==(mid-min)){
            System.out.println("NA");
        }
        else System.out.println("The outlier is " + min);
    }
    
    public static double[] sort(double[] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    double t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
        return array;
    }
}