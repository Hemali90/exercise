package general;
public class EuclidGCD{

	public static void main(String args[]){
		System.out.println(gcd(5,10));
	}
	public static int gcd(int a, int b){
		if(a==0){
			return b;
		}
		return gcd(b%a,a);
		
	}
}