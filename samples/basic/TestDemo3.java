public class TestDemo3
{
	public static void main(String[] args)
	{
		/*
		����ѭ����д��������
		    *
		   ***
		  *****
		 *******
		*********
		
		��α�д�أ�
		���ȱ�дһ�������
		*
		**
		***
		****
		*****
		�ٽ��п��ǲ�����һ��
		*/
		
		int lay=5;//���ý�����������5��
		for(int i=1;i<=lay;i++)
		{
			//����,ÿ�д򼸸��ո�
			//1->4  2->3  3->2  4->1  5->0
			for(int c=0;c<lay-i;c++)
			{
				System.out.print(" ");
			}
			//���ɣ�ÿ���ж��ٸ� *
			//1->1  2->3  3->5  4->7  5->9
			for(int a=0;a<2*i-1;a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}












