/*
 * Here is a starting point for your Matrix tester. You will have to fill in the rest with
 * more code to sufficiently test your Matrix class. We will be using our own MatrixTester for grading. 
*/
package assignment01;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MatrixJUnitTester {

  Matrix threeByTwo, twoByThree, twoByTwoResult, twoByFourResult, twoByTwo, twoByFour, twoByFour2;
  /* Initialize some matrices we can play with for every test! */

  @Before
  public void setup() {
    threeByTwo = new Matrix(new int[][] { { 1, 2, 3 }, { 2, 5, 6 } });
    twoByThree = new Matrix(new int[][] { { 4, 5 }, { 3, 2 }, { 1, 1 } });
    twoByTwo = new Matrix(new int[][] { { 13, 12 }, { 29, 26 } });
    twoByFour = new Matrix(new int[][] { { 1, 2, 3, 4 }, { 0, 1, 3, 6} }); // extra (my test)
    twoByFour2 = new Matrix(new int[][] { { 1, 2, 4, 5 }, { 1, 2, 2, 2 } }); // extra (my test)
    
    // this is the known correct result of multiplying M1 by M2
    twoByTwoResult = new Matrix(new int[][] { { 13, 12 }, { 29, 26 } });
    // this is the known correct sum of adding twoByFour by twoByFour2
    twoByFourResult = new Matrix(new int[][] { { 2, 4, 7, 9 }, { 1, 3 ,5 ,8 } });
    
  }

  @Test
  public void timesWithBalancedDimensions() {
    Matrix matrixProduct = threeByTwo.times(twoByThree);
    //System.out.println("MatrixProduct timesBalanced function " + "\n" +  matrixProduct.toString()); 
    Assert.assertTrue(twoByTwoResult.equals(matrixProduct));
  }

  @Test
  public void timesWithUnbalancedDimensions() {
	Matrix matrixProduct = threeByTwo;
	//System.out.println("MatrixProduct timesUnbalanced function " + "\n" +  matrixProduct.toString()); 
	Assert.assertFalse(twoByTwoResult.equals(matrixProduct)); 
  }
  
  @Test
  public void twoByTwoToString() {
    String resultString = "13 12 " + "\n" + "29 26 " + "\n";
    Assert.assertEquals(resultString, twoByTwoResult.toString());
  }
  
  @Test
  public void plusWithUnbalancedDimensions() {
	  Matrix matrixProduct = threeByTwo.plus(twoByThree);
	  Assert.assertFalse(threeByTwo.equals(matrixProduct));
	  
  }
  
  @Test
  public void plusWithBalancedDimensions() {
	  Assert.assertFalse(twoByFour.equals(twoByFour2));
	  
  }
  
  @Test
  public void twoByFourToString() {
	  String resultStr = "2 4 7 9 " + "\n" + "1 3 5 8 " + "\n";
	  Assert.assertEquals(resultStr, twoByFourResult.toString());
  }
  
  //implement other test cases
  
  
  
}
