public class Class{
   private String name;
   private double grade;
   private int weight;
   
   public Class (String n, double g, int w){
      name = n;
      grade = g;
      weight = w;
      }
   
   public String getName(){
      return name;}
      
   public double getGrade(){
      return grade;}
      
   public int getWeight(){
      return weight;}
      
   public String toString(){
      return "Name: " + name + "\n\tGrade: " + grade + "\n\tWeight: " + weight;
      }
  }
