import java.util.Arrays;

public class ArrayMetoder
{
   public static void main(String[] args)
   {
      
      int[] tal = new int[3];
      tal[0] = 3;
      tal[1] = 8;
      tal[2] = 2;
      int tallet = 5;
      
      
      //udskriv array tal og tallet før kald af metode
      System.out.println(Arrays.toString(tal) + " tallet: " + tallet);
      System.out.println("Adresse for tal: " + tal);
      
      //kald metode, der laver om på array tal og tallet
      skrivArray(tal, tallet);
      
      //udskriv array tal og tallet efter kald af metode
      //tallet er det samme som før (call by value)
      //array tal er ændret (call by reference)
      System.out.println(Arrays.toString(tal) + " tallet: " + tallet);
   
   }

   public static void skrivArray(int[] list, int mitTal)
   {
      System.out.println(Arrays.toString(list) + " mitTal: " + mitTal);
      System.out.println("Adresse for list: " + list);
      //lav om på array list og integer mitTal
      list[0] = 42;
      mitTal = 42;
      System.out.println(Arrays.toString(list) + " mitTal: " + mitTal);
   }
   
   public static void swap(int[] list, int index1, int index2)
   {
      //byt om på index1 og index2 i array list
      //list[index1] og list[index2] er de to tal, der skal byttes om
      
   }
   
}