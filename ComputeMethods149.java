import java.util.Random;

class ComputeMethods149{


   public double fToC(double degreesF){
	degreesF = degreesF - 32;
	degreesF = degreesF * 5;
	degreesF = degreesF / 9;
	return degreesF;
   }

   public double hypotenuse(int a, int b){
	a = a*a;
	b = b*b;
	double ab = a + b;
	double c = Math.sqrt(ab);
	return c;
   }
   public int roll(){
	Random rnd = new Random();
	int rollOne = rnd.nextInt(7);
	int rollTwo = rnd.nextInt(7);
	int rollTotal = rollOne + rollTwo;
	return rollTotal;
   }
}