import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.*;

/**
 *  Created by Chad Wyngaard on 3/2/2019
 *  Part of question 1
 */

public class CollectionsMethods {

   public static ArrayList<String> animalArray = new ArrayList<>();
   public static HashSet<String> animalSet = new HashSet<>();
   public static Map animalMap = new HashMap();


   public static void updateArray()
   {
       animalArray.add("Cat");
       animalArray.add("Dog");
       animalArray.add("Whale");
       animalArray.add("bird");
       animalArray.add("Snake");
       animalArray.add("Fox");

       animalSet.add("Meow");
       animalSet.add("Bark");
       animalSet.add("Click");
       animalSet.add("Tweet");
       animalSet.add("Hiss");
       animalSet.add("Ringdingdingding");



   }


   public static Set<String> keys= animalMap.keySet();


    public static void main (String [] args)
    {
       updateArray();

       int carryOn = 1;

               while(carryOn == 1) {
                   String input = JOptionPane.showInputDialog("Please select one of the collections methods between 1 - 3 \n\n" +
                           "1) List method\n" +
                           "2) Set method\n" +
                           "3) Map method\n" +
                           "\n 0) Exit" );

                   if(Integer.parseInt(input) == 1)
                   {
                       String confirm = JOptionPane.showInputDialog("Would you like to view, add or delete an Object from the array\n\n" +
                               "Please select a number\n" +
                               "1) Add\n" +
                               "2) Remove\n" +
                               "3) View");

                       if (Integer.parseInt(confirm) == 1)
                       {
                           String newName = JOptionPane.showInputDialog("Please enter a new animal");

                           animalArray.add(newName);

                       }
                       else if (Integer.parseInt(confirm) == 2)
                       {
                           String removeName = JOptionPane.showInputDialog("Please enter an index number ");

                           int number = Integer.parseInt(removeName);

                           for (int i = 0; i < animalArray.size(); i++)
                           {
                               if(number == animalArray.indexOf(i))
                               {
                                   animalArray.remove(i);
                               }
                           }

                       }

                       else if (Integer.parseInt(confirm) == 3)
                       {
                           JOptionPane.showMessageDialog(null, animalArray);

                       }


                   }

                   else if (Integer.parseInt(input) == 2)
                   {
                       String confirm = JOptionPane.showInputDialog("Would you like to make any changes to the animal HashSet\n\n" +
                               "Please select a number: \n" +
                               "1) View set\n" +
                               "2) Add\n" +
                               "3) Remove");

                       if (Integer.parseInt(confirm) == 1)
                       {
                           JOptionPane.showMessageDialog(null, animalSet);
                       }

                       else if (Integer.parseInt(confirm) == 2)
                       {
                           String animalSound = JOptionPane.showInputDialog("What sound does your animal make?");

                           animalSet.add(animalSound);

                       }

                       else if (Integer.parseInt(confirm) == 3)
                       {
                           String animalDel = JOptionPane.showInputDialog("Please specify the sound you wish to remove");

                           animalSet.remove(animalDel);
                       }


                   }



                   else if (Integer.parseInt(input) == 3)
                   {

                       animalMap.put(1, "Meow");
                       animalMap.put(2, "Bark");
                       animalMap.put(3, "Click");
                       animalMap.put(4, "Tweet");
                       animalMap.put(5, "Hiss");
                       animalMap.put(6, "Ringdingdingding");

                       String anSound = JOptionPane.showInputDialog("Please choose which animal to see the sound it make \n\n" +
                               "1) Cat\n" +
                               "2) Dog\n" +
                               "3) Whale\n" +
                               "4) Bird\n" +
                               "5) Snake\n" +
                               "6) Fox\n");
                       int num = Integer.parseInt(anSound);

                       JOptionPane.showMessageDialog(null, "The sound that the animal you haven chosen makes is " + (String) animalMap.get(num));

                   }

                   else if(Integer.parseInt(input) == 0)
                   {
                       carryOn ++;
                   }

                   else
                   {
                       JOptionPane.showMessageDialog(null, "Please enter one of the numbers provided");
                   }


               }




    }



}
