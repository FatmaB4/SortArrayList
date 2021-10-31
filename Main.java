import java.util.*;

class Main {
  public static void main(String[] args) {

    //1 - Original Input
    //01 - Left Padding
    //10 - Right Padding

    //*****START PADDING*****
    String input = "5";

    String lPad = String.format("%2s", input).replace(" ", "0");
    System.out.println("LEFT PADDING");
    System.out.println(lPad);
    System.out.println();

    String rPad = String.format("%-2s", input).replace(" ", "0");
    System.out.println("RIGHT PADDING");
    System.out.println(rPad);
    System.out.println();
    //*****START PADDING*****

    ArrayList<String> flower = new ArrayList<String>();
    flower.add("01 Roses");
    flower.add("12 Carnations");
    flower.add("03 Tulips");
    flower.add("06 Daisy");
    flower.add("09 Bushes");
    flower.add("05 Trees");
    flower.add("02 Grass");

    /*
    for (int i = 2; i < flower.size(); i++)
    {
      if (flower.get(i).contains("Trees"))
      {

      }
    }
    */

    System.out.println("Before Sort");
    System.out.println(flower);
    System.out.println();
    
    flower.sort( Comparator.comparing( String::toString ) );
    
    System.out.println("After Sort");
    System.out.println(flower);
    System.out.println();

    String value = flower.get(flower.size() - 1);
    System.out.println(value);
    System.out.println();

    String[] maxFlower = value.split(" ", 2);

    System.out.println("PRINT MAX FLOWER");
    System.out.println(maxFlower[1]);
  }
}