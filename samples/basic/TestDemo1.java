public class TestDemo1
{
	public static void main(String[] args)
	{
		
		//for循环 范例
		
		/*
		for(初始化; 循环条件; 步长)
			{
			语句; //循环体
			}
		*/
		
		for(int a=0;a<100;a++)
		{
			System.out.println("大家好，我是渣渣辉！");
		}
		
		
		//while循环 范例    while循环是先判断,在执行语句
		
		/*
		while(循环条件)
			{
			语句;//循环内容,循环体
			}
		*/
		
		int i=0;
		while(i<10)
		{
			System.out.println("Hello World!");
			i++;
		}
		
		
		//do while循环 范例    do while循环是先执行,后判断
		/*
		do
		{
		语句;//代码语句,循环体
		}while(循环条件);	
		*/
		
		int e=0;
		do
		{
			System.out.println("世界，你好！");
			e++;
		}while(e<100);
				
	}
}
