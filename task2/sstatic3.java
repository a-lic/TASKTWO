//main class
public class sstatic{
    static int a=2;
//non-static method
    void f(){
        System .out.println("The number above is an even number");
  
  }
//method 2
public static void main(String[]args){
    sstatic obj=new sstatic();
    System.out.println(obj.a);
    obj.f();
}











}