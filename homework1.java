import java.util.Scanner;
public class homework1{
  public  static  void main (String[] args){
    System.out.println("what is you name?");

    Scanner reader=new Scanner(System.in);
    String name = reader.next();
    System.out.print("Hello " + name);

  }
}
