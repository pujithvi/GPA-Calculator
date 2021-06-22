import java.lang.System.*;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.lang.Math;
class	GPA_Optimizer{
	public static void main	(String str[]){
		Scanner scan =	new Scanner	(System.in);
      double num_classes = 0;
      System.out.println("Enter in your target GPA:");
      double target = scan.nextDouble();
      System.out.println("Enter in your current GPA:");
      double currentGPA = scan.nextDouble();
      System.out.println("Enter in the number of classes you have taken:");
      double currentClasses = scan.nextDouble();
      if (target >= 4.0){
         double w1 = (currentClasses*target)-(currentGPA*currentClasses);
         num_classes = Math.ceil(w1/(5-target));
         System.out.println("Number of additional AP/IB/DE classes necessary (all As): " + num_classes);
         }
               
     
     }
   }