package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		System.out.println("The sum is "+c.add(23,20,30));
        System.out.println("The subtraction is"+c.sub(40, 23));
        System.out.println("The product is"+c.mul(323.5, 53.6));
        System.out.println("The division is"+c.div(3.5f, 6.7f));
	}

}
