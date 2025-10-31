public class Main {

   public static void main(String []args) {

      // BOOLEAN VARIABLES can only hold true or fales 
      boolean lightsOn = false;
      boolean dannyPresent = true; 

      // BOOLEAN EXPRESSIONS are like questions (or comparison)
      // where the only possible answers are true or fales 
      boolean exp1 = (dannyPresent == true); // is danny here 
      boolean exp2 = (lightsOn != true); // are the lights NOT on? (off)

      // Comparing numerical values 
      int x = 6;
      int y = 7; 

      // Check for EQUALITY using the == operator 
      System.err.println(x == y); // you can print boolean exp. directly 
      // Check for NOT equal using the != operator
      boolean exp3 = (x != y); // store the boolean exp result in a variable 
      System.out.println( exp3 );

      // compare numeric values (int, double) using RELATIONAL OPERATOR
      System.out.println(x < y); // true (6 IS LESS THEN 7)
      System.out.println(x > y); // false 
      System.out.println(x <= y); // true 
      System.out.println( x >= y); // false 
      System.out.println(y >= x ); // true (ORDER MATTERS w/rel operator)
      System.out.println(y == y ); // true 

      // can you compare ints and bouble 
      bouble z = 6.0;
      System.out.println(x == z); // true (6 and 6.0 are the same value!)
   }
}
