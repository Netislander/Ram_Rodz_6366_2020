/**
 * InnerCounting_Numbers
 */
import java.util.Scanner;

 public class InnerCounting_Numbers {

    public static void main (String[] args) {
Scanner user_input = new scanner(System.in);
String first_name;
System.out.print("Enter your first name: ");
first_name = user_input.next();

String family_name;
System.out.print("Enter your family name: ");
family_name = user_input.next();

String full_name;
full_name = first_name + " " + family_name;

System.out.println("You are " + full_name);
    }
}