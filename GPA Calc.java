import java.lang.System.*;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.lang.Math;
class	GPA_Calculator{
	public static void main	(String str[]){
		Scanner scan =	new Scanner	(System.in);
		ArrayList <Class>	classes = new ArrayList	<Class>();
		System.out.println ("Please enter the classes you have taken: their names, the grades you have earned, and the weight of each class (4 or 5). Enter in -1 when done.");	
		System.out.println ("Enter 1 to Start:");
      String e_name = "null";
      while (!(e_name.equals("-1"))){
         String hi = scan.nextLine();
			System.out.println("Name:");
			e_name = scan.nextLine();
         if (e_name.equals("-1"))
            break;
			System.out.println("Grade:");
			double e_grade	= scan.nextDouble();
			System.out.println("Weight:");
			int e_weight =	scan.nextInt();
			classes.add(new Class(e_name,	e_grade,	e_weight));
			}
		System.out.println("GPA: " + GPACalc(classes));
      System.out.println("Do you want a complete copy of all your classes? Enter yes or no:");
      String response = scan.nextLine();
      if (response.toLowerCase().equals("yes")){
         for (Class b: classes){
            System.out.println(b);
            }
         }
         
         
         
      }
      
      public static int Subtraction(Class a){
         int w = a.getWeight();
         int subtract = 0;
         if(a.getGrade() >= 90 && a.getGrade() <= 102)
            subtract = 0;
         else if(a.getGrade() >= 80 && a.getGrade() < 90)
            subtract = 1;
         else if(a.getGrade() >= 70 && a.getGrade() < 80)
            subtract = 2;
         else if(a.getGrade() >= 0 && a.getGrade() < 70){
           if(w == 5)
            subtract = 5;
           else
            subtract = 4;
            }
         return subtract;
         }
      
		public static double GPACalc(ArrayList <Class> arr){
         double GPA = 0;
         for (Class b: arr){
            int w1 = b.getWeight();
            if (w1 == 4){
               GPA = GPA + (4 - Subtraction(b));}
            else if (w1 == 5){
               GPA = GPA + (5 - Subtraction(b));}
               }
         GPA = GPA/arr.size();
         return GPA;
         }
               
         

}

