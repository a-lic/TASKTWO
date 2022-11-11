//this program displays whether a year is leap or not
package leapyear;
import java.util.Scanner;
public class leapyear {
    public static void main(String[]args){
        // start of main method
         
        class year{
            public static void leap(){
                year.leap();
            }
        }
int year;
// outputs the year the user has input
System.out.println("enter year");
Scanner input=new Scanner(System.in);
year=input.nextInt();
// using if statements
if((year%4)==0){
    System.out.println("Is a leap year");

    
}
else{
    System.out.println("it is not a leap year");
}

            }
        }
    
    

