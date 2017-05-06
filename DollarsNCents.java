/*
Natashia Copple Lab #2, P4.7
*/
package dollarsncents;
import java.util.*;
public class DollarsNCents {

    public static void main(String[] args) {
        //get user input, create object
        Scanner in = new Scanner(System.in);
        //create variables
        double price;
        int dollars, cents;
        //ask for user input
        System.out.print("Please enter the price: ");
        //asign input to variable
        price = in.nextDouble();
        //assign the price to an integer variable dollars
        dollars = (int)price;
        //multiply the difference price - dollars by 100 and add 0.5
            //and assign the result to an integer variable cents
        cents = (int)(((price - dollars) * 100) + 0.5);
        //print out dollars and cents
        System.out.println("Dollars: " + dollars + "\n" + "Cents: " + cents);
         
        
    }
    
}
