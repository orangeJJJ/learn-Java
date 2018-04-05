public class  TestDemo1_2
{  
    public static void main(String[] args)
	{  
		//for 循环计算 -> 1-100
		int x;
		int sum=0;
		for(x=1;x<=100;x++){	
			System.out.println(x);//从1数到100
			sum+=x;
		}
		System.out.println("(1)从1这个数加到100:"+x);
		System.out.println("   从1到100累计的和为:"+sum);
		
		//while 循环计算 -> 1-100
		int y=1;
		int sum1=0;
		while(y<=100)
		{
			System.out.println(y);//从1数到100
			sum1+=y;
			y++;
		}
		System.out.println("(2)从1这个数加到100:"+x);
		System.out.println("   从1到100累计的和为:"+sum1);
		
		// do while 循环计算 -> 1-100
		int z=1;
		int sum3=0;
		do
		{
			System.out.println(z);//从1数到100
			sum3+=z;
			z++;
		}while(z<=100);
		System.out.println("(3)从1这个数加到100:"+z);
		System.out.println("   从1到100累计的和为:"+sum3);	
	}
}








