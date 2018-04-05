public class  TestDemo1_2
{  
    public static void main(String[] args)
	{  
		int x;
		int sum=0;
		for(x=1;x<=100;x++){	
			System.out.println(x);//从1数到100
			sum+=x;
		}
		System.out.println("从1这个数加到100:"+x);
		System.out.println("从1到100累计的和为:"+sum);
	}
}