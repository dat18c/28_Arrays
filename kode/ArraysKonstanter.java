import java.util.Arrays;

public class ArraysKonstanter
{
   public final int DAGE_I_OKTOBER = 31;
   
   public static void main(String[] args)
   {
      //konstant keyword final
      final int DAGE_I_UGEN = 7;
      
      //ny måde at erklære arrays på
      int[] tal = { 0, 1, 2, 0 };
      String[] dage = new String[DAGE_I_UGEN];
      
      tal[3] = DAGE_I_UGEN;
            
      System.out.println(Arrays.toString(tal));
   
   }
}