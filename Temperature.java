//The Temperature class prints calculation of  given temperature in 3 different types
import java.util.Scanner;
public class Temperature
{
    /**
     *  Gets type and value from user, 
     *  Divided into different cases,
     *  Prints the calculation of the temperature according to each case
     */
    public static void main (String [] args)
      {
         Scanner scan = new Scanner (System.in);
         //Defining variables and constants
         final double CELSIUS_ADDITION_1= 5.0/9.0;
         final double CELSIUS_ADDITION_2= 32.0;
         final double KELVIN_ADDITION= 273.15;
         final double FAHRENHEIT_ADDITION= 9.0/5.0;
         
         double kelvin = 0.0;
         double celsius = 0.0;
         double fahrenheit = 0.0;
 
         System.out.println ("This program calculates the conversion between the " +
         "different temperature units");
         System.out.println ("Please enter your temp time-"+ '\n' +"for Celsius enter C"+
         '\n' + "for Fahrenheit enter F" + '\n' + "for Kelvin enter K");
         String userValue = scan.next();
         char TempType=userValue.charAt(0);
         System.out.println ("Thanks. please enter the temperature value");
         double tempValue = scan.nextDouble();
 
        switch (TempType)
         {
            case 'C':
            celsius=tempValue;
            kelvin= tempValue + KELVIN_ADDITION;
            fahrenheit=((tempValue*FAHRENHEIT_ADDITION)+CELSIUS_ADDITION_2); 
            break;
     
            case 'F':
            celsius=CELSIUS_ADDITION_1*(tempValue-CELSIUS_ADDITION_2);
            kelvin=celsius+KELVIN_ADDITION;
            fahrenheit=tempValue;
            break;
     
            case 'K':
            celsius=tempValue-KELVIN_ADDITION;
            kelvin=tempValue;
            fahrenheit=((celsius*FAHRENHEIT_ADDITION)+CELSIUS_ADDITION_2);
            break;
        }
        System.out.println (celsius + " " + "C" + '\n' + fahrenheit + " " + "F" + '\n' + kelvin + " " + "K");
    }
}
 