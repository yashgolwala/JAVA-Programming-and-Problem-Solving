
import java.util.*;

public class prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		int n=scanner.nextInt();
		scanner.nextLine();

		List<Integer> primes;

		Set<Integer> s;

		for(int p=0;p<n;p++)
		{
			s = new HashSet<Integer>();
			primes = new ArrayList<>();
			
			int lower = scanner.nextInt();
			int upper=scanner.nextInt();

			for (int i = 2; i <= upper; i++) {
				boolean isPrimeNumber = true;
				for (int j = 2; j < i; j++) {

					if (i % j == 0) {
						isPrimeNumber = false;
						break; 
					}
				}

				if (isPrimeNumber) {
					primes.add(i);
				}
			}
			int l=primes.size();
			for(int q=0;q<l;q++)
			{
				for(int x=0;x<l;x++)
				{
					int temp=primes.get(q)*primes.get(x);
					if(temp>=lower && temp<=upper)
					{
						s.add(temp);
					}
				}
			}
			a.add(s.size());
		}
		System.out.println(a);
	}
}
