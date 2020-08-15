import java.util.*;
public class DigitPairs{
	public static void main(String args[]){
		int n=8;
		int[] a={286,567,321,345,123,110,767,111};
		int l=0,s=0;
		int[] ar=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int r1=a[i]%10;
			int r2=(a[i]/10)%10;
			int r3=(a[i]/100)%10;
			if(r1>r2&&r1>r3)
			{
				l=r1;
			}
			else if(r2>r3)
			{
				l=r2;
			}
			else
			{
				l=r3;
			}
			//System.out.println(l);
			if(r1<r2&&r1<r3)
			{
				s=r1;
			}
			else if(r2<r3)
			{
				s=r2;
			}
			else
			{
				s=r3;
			}
			//System.out.println(s);
			int b=(l*11)+(s*7);
			//System.out.println(b);
			b=(b/10)%10;
			ar[i]=b;
		}
		int c[]=new int[10];
		int d[]=new int[10];
		int j=0,k=0;
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0)
			{
				c[j++]=ar[i];
			}
			else
			{
				d[k++]=ar[i];
			}
		}
		int m=0,count1=0,count2=0,count=0;
		for(int i=0;i<j;i++)
		{
			if(count1!=2){
			for(int f=i+1;f<j;f++)
			{
				if(c[i]==c[f])
				{
					count1++;
				}
			}
		  }
		}
		for(int i=0;i<k;i++)
		{
		    if(count2!=2){
			for(int f=i+1;f<k;f++)
			{
				if(d[i]==d[f])
				{
					count2++;
				}
			}
		}
		}
		count=count1+count2;
		System.out.println(count);
	}
}