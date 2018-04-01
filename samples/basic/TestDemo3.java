public class TestDemo3
{
	public static void main(String[] args)
	{
		/*
		利用循环编写出金字塔
		    *
		   ***
		  *****
		 *******
		*********
		
		如何编写呢？
		可先编写一半金字塔
		*
		**
		***
		****
		*****
		再进行考虑补上另一半
		*/
		
		int lay=5;//设置金字塔行数，5行
		for(int i=1;i<=lay;i++)
		{
			//规律,每行打几个空格
			//1->4  2->3  3->2  4->1  5->0
			for(int c=0;c<lay-i;c++)
			{
				System.out.print(" ");
			}
			//规律，每行有多少个 *
			//1->1  2->3  3->5  4->7  5->9
			for(int a=0;a<2*i-1;a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}












