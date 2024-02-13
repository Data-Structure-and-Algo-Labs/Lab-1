import java.lang.Math;

public class Main {

  // public static void main(String[] args) {
  //   System.out.println(part0(5,5));
  // }

  
    public static int part0(int lhs, int rhs) {
      // Complete this method such that returns the sum of the two interger arguements.
      //TODO: hi
  
      // This method as already been implemented for you as an example -
      int sum = lhs + rhs; // finding out the sum
      return sum; // and then returning it
    }
  
  
    public String part1() {
      // Declare a String variable, name it student and assign it the value "Malcolm."
      String student = "Malcolm";
      // once you are done, return the string variable you created on the following line -
      // hint: return NAME_OF_VARIABLE;
      return student;
    }
  
    public int part2(int lhs, int rhs) {
      // Complete this method so it returns out the remainder of the two parameters.
      int remainder = lhs % rhs;
 
      // hint: int result = ???
      // hint: and then: return result; ?
      return remainder;
    }
  
    public int part3(int lhs, int rhs) {
      int quotient = lhs / rhs;
      // Complete this method so it returns the quotient of the two parameters.
      return quotient;
    }
  
    public int part4(int lhs, int rhs) {
      // Complete this method so it returns the product of the two parameters.
      int product = lhs * rhs;
      return product;
    }
  
    public String part5(String lhs, String rhs) {
      // Complete this method to return the two String parameters combined (concatenated) together.
      // the combined string must have exactly one space (that is, this - " ") between them.
      String combined = lhs + " " + rhs;
      return combined;
    }
  
    public String part6(long val) {
      // Complete this method such that it returns the long integer value as a string, but the string
      // should be formatted in a nice way.
      // by nice way, I mean comma-separated; so if `val` (the arguement) is equal to `1000`, the
      // method must return "1,000"
      // if `val` is `12141`, the method must return "12,141".
  
      // hint: did we learn about something called String.format()?
  
      // hint: you can read more at this link -
      // https://dzone.com/articles/java-string-format-examples#:~:text=The%20most%20common%20way%20of%20formatting%20a%20string,Formatter%20and%20link%20it%20to%20a%20StringBuilder%20.
      String formattedString = String.format("%,d", val); 
      return formattedString;
    }
  
    public int part7(String val) {
      // Complete this method such that it returns the index of the first exclamation mark you can
      // find in the string.
      int index = val.indexOf("!");
      return index;
    }
  
    
    public String part8(String val) {
      // Complete this method such that it returns every part of the string right
      // before the exclamation mark.
      // for example - If `val` is "Hello! How are you?", the method should
      // return "Hello"
  
      // Note: all strings passed to this method will always contain one
      // exclamation mark.
      int index = val.indexOf("!");
      String result = val.substring(0, index);
      return result;
    }
  
    public double part9() {
      // Complete this method such it returns a random decimal value between 0 and 1
      double random = Math.random();

      return random;
    }
  
    public int part10() {
      // Complete this method such it returns a random number between 0 and 500
      int random = (int) (Math.random() * 501);
      return random;
    }
  
    public int part11(int start, int end) {
      // Complete this method such it returns a random number between the `start` integer arguement
      // and the `end` integer arguement.
      int random = (int) (Math.random() * (end - start + 1)) + start;
      return random;
      }
    }
  