class Solution {
     int numSquareSum(int n) 
	{ 
		int squareSum = 0; 
		while (n!= 0) 
		{ 
			squareSum += (n % 10) * (n % 10); 
			n /= 10; 
		} 

		return squareSum; 
	} 
    public boolean isHappy(int n) {
        	int slow, fast; 


		slow = fast = n; 
		System.out.println(" Number  "+n);
		do
		{ 

			double square = Math.pow(slow, 2);
			System.out.println("My square "+square);
			slow = numSquareSum(slow); 


			fast = numSquareSum(numSquareSum(fast)); 

		} 
		while (slow != fast); 


		return (slow == 1); 
    }
}
