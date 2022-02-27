class TestClass149{

  public static void main (String[] args){
	ComputeMethods149 ml = new ComputeMethods149();

	double degreesC = ml.fToC(100);
	System.out.println("Degrees in Celsius: " + degreesC);	

	double theHypo = ml.hypotenuse(3, 4);
	System.out.println("Hypotenuse is: " + theHypo);

	int diceRoll = ml.roll();
	System.out.println("Double dice roll sum: " + diceRoll);
  }
}