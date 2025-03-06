import java.util.ArrayList;
import java.util.Scanner;

/**
* This program prints out suggestions for hobbies outside or inside
*/
public class toDo {

/**
* The ArrayLists that hold the information from the outside.txt and inside.txt files
*/
  private ArrayList<String> outside;     
  private ArrayList<String> inside;      

  /**
   * Initializes the outside/inside ArrayLists to hold the data from their corresponding text files
   * @param outsideFile indexes correspond to the outside.txt file
   * @param insideFile indexes correspond to the inside.txt file
   */
  public toDo(String outsideFile, String insideFile) {
    this.outside = FileReader.toStringList(outsideFile);
    this.inside = FileReader.toStringList(insideFile);
  }

  /**
   * Prompts the user
   */
  public void prompt() {
    String currentToDo = "";
    String currentIntro = "";
    Scanner input = new Scanner(System.in);
    System.out.println("What suggestion would you like: outside or inside?");
    String choice = input.next();

  /**
   * If the user answers out or outside, it randomly generates one of the indexes from the outside.txt and prints it with the intro
   */
    if (choice.equals("out") || choice.equals("outside")) {
      currentToDo = getOption(outside);
      currentIntro = getCurrentIntro(currentToDo);
      System.out.println(currentIntro);
    } 
  /**
   * If the user answers in or inside, it randomly generates one of the indexes from the inside.txt and prints it with the intro
   */
    if (choice.equals("in") || choice.equals("inside")) {
      currentToDo = getOption(inside);
      currentIntro = getCurrentIntro(currentToDo);
      System.out.println(currentIntro);
    }
    
  /**
   * asks the user if they want one-word suggestions. If they answer yes, they specify inside or outside
   */
   System.out.print("Would you like a list of simplified, one-word suggestions?");
   choice = input.next();
      
     if (choice.equals("yes")) {
     System.out.print("Inside or Outside?");
     choice = input.next(); 

   /**
   * based on user's input, it prints each index's first word in either list.
   */
      if (choice.equals("out") || choice.equals("outside")) {
        printFirstWordOutside();
        System.out.println("Goodbye!");
    } 
    
    if (choice.equals("in") || choice.equals("inside")) {
        printFirstWordInside();
        System.out.println("Goodbye!");
    } 
  }
  
    input.close();
    
  }

  /**
   * Returns a String containing an intro
   * @param holds the index that will be randomly generated 
   * @return prints out the suggestion generated 
   */
  public String getCurrentIntro(String name) {
    return "Your suggestion is to: " + name;
  }

  /**
   * method that randomizes the elements in the ArrayLists 
   * @param holds the inside or outside ArrayList
   * @return a random index from one of the ArrayLists.
   */
  public String getOption(ArrayList<String> options) {
    int randomIndex = (int)(Math.random() * options.size());
    return options.get(randomIndex);
  }

  /**
   * Prints the first words of each index of the outside ArrayList
   */
  
public void printFirstWordOutside() {
    System.out.println("\nOutside suggestions:");
    for (String activity : outside) {
        int spaceIndex = activity.indexOf(" "); // Find the index of the first space
        String firstWord = activity.substring(0, spaceIndex); // Handle single-word activities
        System.out.println(firstWord);
    }
}

  /**
   * Prints the first words of each index of the inside ArrayList
   */

  public void printFirstWordInside() {
    System.out.println("\nInside suggestions:");
    for (String activity : inside) {
        int spaceIndex = activity.indexOf(" "); // Find the index of the first space
        String firstWord = activity.substring(0, spaceIndex); // Handle single-word activities
        System.out.println(firstWord);
    }
}

}