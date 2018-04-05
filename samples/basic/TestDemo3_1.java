public class TestDemo3_1
{
	public static void main(String[] args)
	{
		class Person
		{
			String name;
			int age;
			public void jinZiTa(int a)
			{
				for(int i=1;i<=a;i++){
					for(int r=a;r>i;r--){
						System.out.print(" ");
					}
					for(int e=1;e<=2*i-1;e++){
						System.out.print("*");
					}
				System.out.println();
				}
			}
		}
		Person Nike =new Person();
		Nike.jinZiTa(13);
	}
}