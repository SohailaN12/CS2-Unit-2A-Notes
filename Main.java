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
      double z = 6.0;
      System.out.println(x == z); // true (6 and 6.0 are the same value!)

      // IF STATEMENTS: use boolean expressions to amke 
      // DECISIONS about which code to execute 

      // Determine what value or condition your choice rests on 
      // Ex: Using the elevator at BWL depends on TIME 
      double time = 8.5; // means 8:30 AM 
      time = 7.75; // means 7:45 AM
      time = 8.2; // means 8:15 AM 

      // Put the CONDITION to test in parenthesis
      if ( time < 8 ) {
         // if statement BODY only runs if CONDITION was TRUE 
         System.out.println("You can take the elevator!");
      }
      // Statement below is out of the if statement, so it'll run anyway 
      System.out.println("The elevator is only available before 8 AM!");

      // TWO-WAY SELECTION: if block + else block 
      time =8.0;
      if ( time < 8 ) {
         System.out.println("Eligible for elevator!");
   
      }
      else {
         // Statement in ELSE block runs when If block is fulse
         System.out.println("Take the stairs...");
      }

      // Another example of TWO-WAY SELECTION 
      // in this code, using just a boolean VALUE (not an EXPRESSION)
      boolean heads = false; // filpped tails
      // if (true) 
      if ( heads ) {
         System.out.println("Flipped heads, Wear white.");
      }
      else {
         System.out.println("Filpped tails! Wear black.");
      }

      // MULTI-WAY SELECTION 
      // 1. NESTING if statements is like asking "follow-up questions"
      int age = 18;
      boolean havePermit = true;
      System.out.println("Let's see if you can take this road test...");
      if ( age >= 16 ) {
         System.out.println("Alright, I guess you're old enough...");
         // After passing the first condition (age >= 16)
         // you ask a FOLLOW-UP (another if statement)
         if ( havePermit == true ) {
            System.out.println("Fine, get in the car.");
         }
      }
      else {
         System.out.println("Yoo're too young, Grow up");
      }

      // 2. ELSE IF BLOCKS (chained conditionals)
      // when you are accounting for multiple possible answers
      int battery = 19; 
      // Always start the block with an IF statement 
      if ( battery >= 95 ) {
         System.out.println("unplug your phone!");

      }
      // ORDER MATTERS for else if blocks
      // as soon as a condition it met, the rest of the chain is SKIPPED!
      else if ( battery < 20 ) {
         System.out.println("LOW POWER MOOD");
      }
      else if ( battery <= 50 ) {
         System.out.println("Plug in your phone soon...");
      }
      else {
         System.out.println("otherwise...");
      }

      // COMPOUNDS BOOLEAN EXPRESSIONS
      // to test TWO conditions in an if statement 
      boolean cleanedRoom = false;
      boolean didHW = false;

      // the AND (&&) operator joins two expressions 
      // only comes out to TRUE if BOTH ARE TRUE!
      if ( (cleanedRoom == true) && (didHW == true) ) {
         System.out.println("Go have fun!");
      }

      // The OR (||) operator joins two expressions
      // comes out to TRUE if AT LEAST ONE is TRUE!
      // (less restrictive condition than AND)
      if ( (cleanedRoom == true) || (didHW == true ) ) {
         System.out.println("The less strict parents are fine with you going out!");
      }

      // The NOT (!) operator can be used to NEGATE 
      // a boolean expression
      if ( ! (didHW == true ) ) {
         System.out.println("Do your CodeCollab! The class is depending on you!");
      }
      // REMINDER: boolean VARIABLES can be used 
      // instead of full EXPRESSIONS (with relational operators)
      if ( !didHW ) {
         System.out.println("You did NOT do your HW...");
      }

      // IMPORTANT NOTE ABOUT STRINGS 
      // (and other Object data types)
      // You can't use the == operator to CHECK EQUALITY 
      // instead, use a String Method called .equals()
      String course = "AP Computer Science";
      if (course.equals("AP Computer Science") ) {
         System.out.println("Time to learn JAVA!");
      }
      // .equal is CASE-SENSITIVE 
      // it checks every single character in order berween the 2 Strings 

      String message1 = "Hello World";
      String message2 = "Hello World";
      if ( message1.equals(message2) ) {
         System.out.println("The messages match perfectly!");
      }
      // You can mix String VARIABLES with String LITERALS 
      // EX) both are string LITERALS below
      if ( "hi".equals("hi") ) {
         System.out.println("hi :)");
      }
      






   } // this closes the Main METHOD
} // this closes the Main CLASS
