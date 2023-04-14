package com.simformsolutins.string;

public class Greeting {

  public static void main(String[] args) {
    String firstGreeting = "Hello ma'am";
    firstGreeting = "     Good Morning!";//3 tabs for trim()



    System.out.println(firstGreeting);//only print Good Morning because its string Literal , and immutable string

    System.out.println();
    firstGreeting = firstGreeting.trim();//using
    System.out.println(firstGreeting);

    //I forgot to add Good Morning! using string buffer I can append into it
    StringBuffer stringBuffer = new StringBuffer("Hello sir") //I forgot to add Good Morning! using string buffer I can append into it
        .append(" ,Good Morning!")
        .append("\nfirst of all thank you to giving me this opportunity")
        .append("\nI am parth solanki")
        .append("\nI am basically form Rajkot")
        .append("\nI am currently working in simform as java trainee ");
    System.out.println(stringBuffer);
    System.out.println();

    System.out.println();

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
