
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.println("enter the value of x that you wanna search: ");
        int x=sc.nextInt();
        System.out.println("enter the array elements: ");

        for(int i=0; i<size; i++){
            
            numbers[i]=sc.nextInt();
        }
        for (int i=0; i<size; i++){
            if(numbers[i]==x){
                System.out.println("the index of the given value of x will be " +i);
            }

        }

    }
    
}