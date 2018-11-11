import java.util.Scanner;
public class numbers{
  public static void main(String[] args){
    int number = 0;
    System.out.println("Enter number");
    Scanner read = new Scanner(System.in);
    number = read.nextInt();

// check 2
    if (number % 2 == 0)
    {System.out.println("number devided by 2");}
    else
    {System.out.println("the number is not divisible by 2");}
//  check 3
int workNumber = number;
int summ = 0;
while(workNumber > 0){
  int summNumber = workNumber % 10;
  summ = summ + summNumber;
  workNumber = workNumber / 10;
}
if (summ % 3 == 0){
  System.out.println("number devided by 3");
}
else{
  System.out.println("the number is not divisible by 3");
}
// check 4
workNumber = number;
workNumber = workNumber % 100;
if (workNumber % 4 == 0){
  System.out.println("number devided by 4");
}
else
{
  System.out.println("the number is not divisible by 4");
}
// check 5
workNumber = number;
workNumber = workNumber % 10;
if (workNumber == 0 || workNumber == 5){
  System.out.println("number devided by 5");}
  else {System.out.println("the number is not divisible by 5");}

// check 6
if (summ % 3 == 0 && number % 2 == 0){
   System.out.println("number devided by 6");}
  else {
    System.out.println("the number is not divisible by 6");}
// check 8
workNumber = number;
workNumber = workNumber % 1000;
if (workNumber % 8 == 0){
  System.out.println("number devided by 8");
}
else{
  System.out.println("the number is not divisible by 8");
}
// check 9
if (summ % 9 == 0){
  System.out.println("number devided by 9");
}
else{
  System.out.println("the number is not divisible by 9");
}
// check 10
workNumber = number;
workNumber = workNumber % 10;
if (workNumber % 10 == 0){
  System.out.println("number devided by 10");
}
else{
  System.out.println("the number is not divisible by 10");
}
// check 25
workNumber = number;
workNumber = workNumber % 100;
if (workNumber == 0 || workNumber == 25 || workNumber == 50 || workNumber == 75){
  System.out.println("number devided by 25");
}
else{
  System.out.println("the number is not divisible by 25");
}

}
  }
