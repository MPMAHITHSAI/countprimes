package counting_primes;

import java.util.Scanner;
public class primescount {
    static int findCount(int n)
    {
        int count=0;
        if(n<=1)
            return 0;
        for(int i=2;i<=n;i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count-1;
    }
    public static boolean isPrime(int n) {
		if(n==1 | n==0) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
			
	}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=findCount(n);
        System.out.println(count);
    }
}