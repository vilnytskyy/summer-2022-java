import java.io.*;
import java.util.*;

public class Notes
{
  public static void main(String[] args)
  {
    String str = "The dog barks";
    
    // Go through the first word character by character without displaying anything
    // Precondition: str does not begin with spaces. Words are separated by spaces.
    // Thus, str in position 0 is not a space char.
    int i = 0;
    while (str.charAt( i ) != ' ')
    {
      i++ ;
    }
  
  
    // Postcondition: str in position i IS a space.
    // Go through all the spaces after the first word
    while (str.charAt( i ) == ' ')
    {
      i++ ;
    }
  
  
    // Postcondition: str in position i IS NOT a space.
    // Go through the second word character by character and display each character.
    // Precondition: str[ i ] is the first letter of the second word
    while (str.charAt( i ) != ' ') // This only works for sentences of three words or more. Try to fix it!
    {
      System.out.print( str.charAt ( i ) );
      i++ ;
    }


    System.out.println();

    int[] arr = new int[]{1};
    // arr[0] = 1;
  
    System.out.println(arr[0]);
  
    int arr2[] = new int[1];
    arr2[0] = 5;
  
    System.out.println(arr2[0]);
  }
}
