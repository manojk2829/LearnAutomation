package deletePractise;

public class PalindromeNumber {

	public static void main(String[] args) {
		int temp,sum=0,n=1321;
		temp=n;
		while(n>0){
			int r = n%10;
			sum= (sum*10)+r;
			n=n/10;
		}if(temp ==sum){
			System.out.println("Number is Palindrome..." + temp);
		}else{
			System.out.println("Numer is not palindrome...." + temp);
		}
	}
}
