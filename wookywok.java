import java.util.Scanner;

public class wookywok {
  public static void main(String[] args){
int end = 0;
int numberOrder = 0;
System.out.println("Hello in Wookywok");
    while(end<1){
    numberOrder ++;

Scanner reader = new Scanner(System.in);

int cycle = 0;
String noodle = "";

while(cycle<1){
  System.out.println("Please choose noodles:");
  System.out.println("1:Cheese noodles");
  System.out.println("2:Egg noodles");
  System.out.println("3:Glass nodles");

  int noodleChoose = reader.nextInt();
  switch(noodleChoose){
  case 1:
  System.out.println("You choose Cheese noodles");
   noodle = "Cheese noodles";
   cycle = 1;
  break;
  case 2:
  System.out.println("You choose Egg noodles");
   noodle = "Egg noodles";
   cycle = 1;
  break;
  case 3:
  System.out.println("You choose Glass noodle");
   noodle = "Glass Noogles";
   cycle = 1;
  break;
  default:
  System.out.println("Please make choose again");
  System.out.println("");
break;



}
}



cycle = 0;

String meat = "";

while(cycle < 1){
  System.out.println("Please choose meat:");
  System.out.println("1:Beaf ");
  System.out.println("2:Pork ");
  System.out.println("3:Lamb");
  int meatChoose = reader.nextInt();
  switch(meatChoose){
  case 1:
  System.out.println("You choose Beaf");
   meat = "beaf";
   cycle = 1;
  break;
  case 2:
  System.out.println("You choose Pork");
   meat = "pork";
   cycle = 1;
  break;
  case 3:
  System.out.println("You choose Lamb");
   meat = "lamb";
   cycle = 1;
  break;
  default:
  System.out.println("Please choose correct");
  System.out.println("");
}
}



cycle = 0;

String sauce = "";

while(cycle < 1){
  System.out.println("Please choose sauce:");
  System.out.println("1:spicy sauce ");
  System.out.println("2:soy sauce ");
  System.out.println("3:sesame sauce");

  int sauceChoose = reader.nextInt();
  switch(sauceChoose){
  case 1:
  System.out.println("You choose with spicy sauce");
   sauce= "spicy sauce";
   cycle = 1;
  break;
  case 2:
  System.out.println("You choose Soy sauce");
   sauce = "Soy sauce";
   cycle = 1;
  break;
  case 3:
  System.out.println("You choose sesame sauce");
   sauce="sesame sauce";
   cycle = 1;
  break;
  default:
  System.out.println("Please choose correct");
  System.out.println("");
}
}
System.out.println("Thank you for order ");
System.out.println("You order N " + numberOrder + ":");
System.out.println( noodle + " with " + meat + " and " + sauce );
System.out.println("");
System.out.println("");
System.out.println("");
}
}
}
