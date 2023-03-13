package TCcode;

import org.testng.annotations.Test;

public class Source {

		@Test
		
		public  void main() {
		int a[]= {5,6,7,120,121,122};
		String b[]= {"Alphabets","Numbers","Special Chars","Blank Space",
				"Alphanumerics","Alphabets + Special Chars","Alphabets + Blank Spaces","Numbers + Special Chars","Numbers + Blank Spaces",
				"Special Chars + Blank Spaces","Alphabets + Numbers + Special Chars","Alphabets + Numbers  + Blank Space",
				"Numbers + Special Chars + Blank Space","Alphabets + Special Chars + Blank Space","Alphabets + Numbers + Special Chars + Blank Space"};
		System.out.println("length is = "+ a.length);
		
		for (int j=0;j<b.length;j++)
		{for (int i=0;i<a.length;i++)
			if(a[i]<=5)
			{
				System.out.println("Verify that Campaign name text field should not accept 	"+a[i]+"	"+b[j]+ ".");
			}
			else if (a[i]>=122)
			{
			System.out.println("Verify that Campaign name text field should not accept	"+a[i]+"	"+b[j]+ ".");
			}
			else {System.out.println("Verify that Campaign name text field should accept	"+a[i]+"	"+b[j]+ ".");}
	}

	//pushed from local
	}
}
