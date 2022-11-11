package methodsinjava;

import java.util.Scanner;
public class Shapes{
    public static void main(String[]args){
        largestnumber();
     class numbers{
    }
}
    public static void largestnumber() {
        
        Scanner input = new Scanner(System.in);
        //getting user input
        System.out.println("\nEnter num1:");
        int num1= input.nextInt();
        System.out.println("Enter num2:");
        int num2 = input.nextInt();
        System.out.println("Enter num3:");
        int num3 = input.nextInt();

        if(num1>num2&&num1>num3)
            System.out.println("the largest number is:" + num1); 

            else if (num2>num1 && num2>num3)
            System.out.println("the largest number is:" + num2);

            else if (num3>num1 && num3>num2)
            System.out.println("the largest number is:" + num3);

            if(num1<num2&&num1<num3)
            System.out.println("the smallest number is:" + num1); 

            else if (num2<num1 && num2<num3)
            System.out.println("the smallest number is:" + num2);

            else if (num3<num1 && num3<num2)
            System.out.println("the smallest number is:" + num3);
        
            else
          System.out.println("the numbers are the same");
    }   
    }
 
    

        
