public class  TestDemo1_2
{  
    public static void main(String[] args)
	{  
		//for ѭ������ -> 1-100
		int x;
		int sum=0;
		for(x=1;x<=100;x++){	
			System.out.println(x);//��1����100
			sum+=x;
		}
		System.out.println("(1)��1������ӵ�100:"+x);
		System.out.println("   ��1��100�ۼƵĺ�Ϊ:"+sum);
		
		//while ѭ������ -> 1-100
		int y=1;
		int sum1=0;
		while(y<=100)
		{
			System.out.println(y);//��1����100
			sum1+=y;
			y++;
		}
		System.out.println("(2)��1������ӵ�100:"+x);
		System.out.println("   ��1��100�ۼƵĺ�Ϊ:"+sum1);
		
		// do while ѭ������ -> 1-100
		int z=1;
		int sum3=0;
		do
		{
			System.out.println(z);//��1����100
			sum3+=z;
			z++;
		}while(z<=100);
		System.out.println("(3)��1������ӵ�100:"+z);
		System.out.println("   ��1��100�ۼƵĺ�Ϊ:"+sum3);	
	}
}








