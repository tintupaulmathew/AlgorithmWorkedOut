class Kadanes_Algo
{
public static void main(String args[])
	{
	int a[]={1,6,7,9,-8,4,3,-2,1,-8,4};
	int max_sum=a[0];
	int sum=a[0];
	for(int i=1;i<a.length;i++)
		{
		if(sum<0)
			sum=a[i];

		else
			sum+=a[i];
	max_sum=Math.max(sum, max_sum);
	}
	System.out.println(max_sum);
}}