public class TestDemo2
{
	public static void main(String[] args)
	{

//���switch caseִ��ʱ��һ�����Ƚ���ƥ�䣬ƥ��ɹ����ص�ǰcase��ֵ���ٸ����Ƿ���break���ж��Ƿ������������������жϡ�	

/*	
//1.��ÿһ��case��������breakʱ��JVM������˳�����ÿһ��case��Ӧ�ķ���ֵ�����Ǽ���ƥ�䣬ƥ�䲻�ɹ��򷵻�Ĭ��case(default)��

        //�����û����룬�ж������ڼ���switch ��䷶��
		char c='e';   //�޸��ַ����ж����ڼ�
		switch(c)     //swtich()��������ֻ����int��short��char��byte��enum����(ö�����ͣ�
		{
			case 'a':
				System.out.println("��������һ�����Ӵ�����");				
			case 'b':
				System.out.println("�������ڶ������Ӵ�����");
			case 'c':
				System.out.println("������������������ѩɽ");
			default:
				System.out.println("��֪�����ڼ�");
		}
        //�������֪�����ڼ�
*/
		
		
/*				
//2.��ÿһ��case��������breakʱ��ƥ��ɹ��󣬴�ƥ��ɹ���case��ʼ�����η��غ�������case�ķ���ֵ��

        //�����û����룬�ж������ڼ���switch ��䷶��
		char c='b';   //�޸��ַ����ж����ڼ�
		switch(c)     //swtich()��������ֻ����int��short��char��byte��enum����
		{
			case 'a':
				System.out.println("��������һ�����Ӵ�����");				
			case 'b':
				System.out.println("�������ڶ������Ӵ�����");
			case 'c':
				System.out.println("������������������ѩɽ");
			default:
				System.out.println("��֪�����ڼ�");
		}
        //������������ڶ������Ӵ�����
		//      ������������������ѩɽ
		//      ��֪�����ڼ�
*/	
			
				
/*					
//3.����ǰƥ��ɹ���case������break����ӵ�ǰcase��ʼ�����η��غ���case�ķ���ֵ��ֱ������break�������жϡ�

        //�����û����룬�ж������ڼ���switch ��䷶��
		char c='b';   //�޸��ַ����ж����ڼ�
		switch(c)     //swtich()��������ֻ����int��short��char��byte��enum����
		{
			case 'a':
				System.out.println("��������һ�����Ӵ�����");				
			case 'b':
				System.out.println("�������ڶ������Ӵ�����");
			case 'c':
				System.out.println("������������������ѩɽ");break;
			default:
				System.out.println("��֪�����ڼ�");
		}
		//������������ڶ������Ӵ�����
		//      ������������������ѩɽ
*/

	
//4.��δ�ҵ�ƥ���case����ִ��Ĭ�ϵ�case(default)��

        //�����û����룬�ж������ڼ���switch ��䷶��
		char c='e';   //�޸��ַ����ж����ڼ�
		switch(c)     //swtich()��������ֻ����int��short��char��byte��enum����
		{
			case 'a':
				System.out.println("��������һ�����Ӵ�����");break;				
			case 'b':
				System.out.println("�������ڶ������Ӵ�����");break;
			case 'c':
				System.out.println("������������������ѩɽ");break;
			default:
				System.out.println("��֪�����ڼ�");
		}
		//�������֪�����ڼ�
		
		
	}
}