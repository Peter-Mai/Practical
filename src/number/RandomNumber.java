package number;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Random rnum = new Random();
	      int counter;
	      int[] numbers = new int[ 500 ]; 
	      numbers[0] = rnum.nextInt(1000); 
	      int largest = numbers[0]; 
	      int smallest = numbers[0]; 
	      for (counter = 1 ; counter <  500; counter++) 
	      {
	          numbers[counter ] = rnum.nextInt(1000);
	          largest = Math.max( largest , numbers[counter ] ); 
	          smallest = Math.min( smallest , numbers[counter ] ); 

	      }
	      
	      System.out.println("Smallest number out of the 500 was " + smallest);

	}

}
