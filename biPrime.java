
import java.util.*;

public class biPrime {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> a = new ArrayList<>();
		int n=scanner.nextInt();
		scanner.nextLine();

		List<Double> primes;
		Set<Double> s;

		for(double p=0;p<n;p++)
		{
			s = new HashSet<Double>();
			primes = new ArrayList<Double>();
			int input = scanner.nextInt();
			int input1=scanner.nextInt();

			for (double i = 2; i <= input1; i++) {
				boolean isPrimeNumber = true;
				for (double j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrimeNumber = false;
						break; 
					}
				}
				if (isPrimeNumber) {
					primes.add(i);
				}
			}
			double l=primes.size();
			for(double q=0;q<l;q++)
			{
				for(double x=0;x<l;x++)
				{
					long res=(long) (primes.get((int) q)*primes.get((int) x));
					if(res>=input && res<=input1)
						s.add((double) res);
				}
			}
			a.add((double) s.size());
		}
		for(int i=0; i<a.size()-1;i++) {
			System.out.print(a.get(i)+" ");
		}
		System.out.print(a.get(a.size()-1));
	}
}
