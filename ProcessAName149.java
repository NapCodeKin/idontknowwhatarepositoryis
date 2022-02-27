import java.util.Scanner;

class ProcessAName149{

  public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("First and last name (Example: \"John Doe \"): ");
	String fullName = sc.nextLine();
	int idx1 = fullName.indexOf(' ');
	int idx2 = fullName.indexOf(' ', idx1 + 1);
	String lastName = fullName.substring(idx1, idx2);
	System.out.println("Your name is: " + lastName + ", " + fullName.charAt(0) + ".");
  }
}