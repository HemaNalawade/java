
public class LargestSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int large,small,i;
		int a[] = new int[]{15, 28, 33, 46, 52};
		int n = a.length;
		large=small=a[0];
		for(i=1;i<n;++i)
		{
		if(a[i]>large)
		large=a[i];

		if(a[i]<small)
		small=a[i];
		}

		System.out.println("The smallest element is :" + small );
		System.out.println("The largest element is :"+ large );

	}

}
