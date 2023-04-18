package com.simformsolutins.string;

/**
 * - Create main class and string variable for String, StringBuffer and StringBuilder
 * - Append at least five lines in StringBuffer and StringBuilder.
 * - Convert all variables string to upper case latter and trim leading and trailing white space if any.
 * - Print all variables in console.
 */

public class Greeting {

  public static void main(String[] args) {
    String firstGreeting = "Hello ma'am";//string literal
    firstGreeting = "     Good Morning!";//3 tabs for trim()


    /**
     * only print Good Morning because its string Literal , and immutable string
     */
    System.out.println(firstGreeting);

    System.out.println();
    /**
     * using trim trailing and leading spaces remove
     */
    firstGreeting = firstGreeting.trim();
    System.out.println(firstGreeting);

    /**
     * using string buffer I can append into it
     */

    StringBuffer stringBuffer = new StringBuffer("Hello sir")
        .append(" ,Good Morning!")
        .append("\nfirst of all thank you to giving me this opportunity")
        .append("\nI am parth solanki")
        .append("\nI am basically form Rajkot")
        .append("\nI am currently working in simform as java trainee ");
    System.out.println(stringBuffer);
    System.out.println();

    System.out.println();

    /**
     * using string builer I can append into it
     */

    StringBuilder stringBuilder = new StringBuilder("Hello Jay,")
          .append( "Good Morning!")
          .append("\nJay : Good Morning")
          .append("\nMe : How are you?")
          .append("\nJay : Fine")
          .append("\nMe : What are you doing?")
          .append("\nJay : Nothing , just chill");
    System.out.println(stringBuilder);


    System.out.println();
    System.out.println(firstGreeting.toUpperCase());
    System.out.println();
    System.out.println(stringBuilder.toString().toUpperCase());

    System.out.println();
    System.out.println(stringBuffer.toString().toUpperCase());


  }
}
