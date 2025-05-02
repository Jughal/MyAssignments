package week1.day2.week1day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1;
		int n=8;
		for (int i = 0; a <=n; i++) {
			System.out.println(a + "");
			int sum=a+b;
			a=b;
			b=sum;
		}
	}

}
