package week1.day1;

public class Armstrong {

	public static void main(String[] args) {
		int input=153;
		// TODO Auto-generated method stub
		int rem,org;
		int cal=0;
		org=input;
		while(input>0)
		{
			rem=input%10;
			input=input/10;
			cal=cal+(rem*rem*rem);
		}
			System.out.println(org);
		if(cal==org)
					
		{
			System.out.println("armstrong");
		}
		else
			System.out.println("not armstrong");
		}

	}


