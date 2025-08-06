import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String adj1,noun1,adj2,verb1,adj3;

        System.out.print("Enter an adjective (description): ");
        adj1=sc.nextLine();
        System.out.print("Enter an noun (animal or person): ");
        noun1=sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        adj2=sc.nextLine();
        System.out.print("Enter the verb (action): ");
        verb1=sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        adj3=sc.nextLine();

        System.out.println("\nToday I went to a "+adj1+" zoo.");
        System.out.println("In an exhibit, I saw a "+noun1+".");
        System.out.println(noun1+" was "+adj2+" and "+verb1+".");
        System.out.println("I was "+adj3+".");
    }
}
