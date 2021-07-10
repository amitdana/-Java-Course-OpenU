import java.util.Scanner;
//this program calculates the areas and the perimeters of the exircle and the incircle of a given rectangle
public class Circle
{
 public static void main (String [] args)
 {
 Scanner scan = new Scanner (System.in);
 final double PI=Math.PI;
 System.out.println ("This program calculates the areas " +
 "and the perimeters of the excircle and the incircle " +
 "of a given rectangle ");
 System.out.println (" ");
 
 //Asking the user for values and put it into variables
 System.out.print ("Please enter the two coordinates of the " +
 "left-upper point of the rectangle");
 int leftUpX = scan.nextInt();
 int leftUpY = scan.nextInt();
 
 System.out.print ("Please enter the two coordinates of the " +
 "right-lower point of the rectangle");
 int rightDownX = scan.nextInt();
 int rightDownY = scan.nextInt();
 
 //Calculating the incircle data
 double incircleRadius=(leftUpY-rightDownY)/2;
 double incircleArea=PI * Math.pow(incircleRadius,2);
 double incirclePerimeter=2*PI*incircleRadius;
 System.out.println ("Incircle:radius=" + incircleRadius +",area=" + incircleArea+", perimeter=" +incirclePerimeter); 

 //Calculating the excircle data
 double SLANT_DISTANCE=Math.sqrt((leftUpX-rightDownX)*(leftUpX-rightDownX)+(leftUpY-rightDownY)*(leftUpY-rightDownY));
 double excircleRadius=SLANT_DISTANCE/2; //The diaginak of the rectangle is the diameter of the circle 
 double excircleArea=PI*Math.pow(excircleRadius,2);
 double excirclePerimeter=2*PI*excircleRadius;
 System.out.println ("Excircle:radius=" + excircleRadius +",area=" + excircleArea+", perimeter=" +excirclePerimeter);

 } // end of method main
} //end of class Circle