package core_program;

	import java.util.Scanner;
	public class PrimeFactor {
	public void prime(){
		
	    Scanner pf =new Scanner (System.in);
	    System.out.println("Enter a number :");
	     int num = pf.nextInt();
	     for (int i=2; i<=num;i++) {
	         while(num%i==0) {
	             System.out.println(i+ " ");
	             num /= i;
	         }
	     }
	}

	    public static void main(String[] args) {
	       PrimeFactor p=new PrimeFactor();
	       p.prime();

	    }
	}
