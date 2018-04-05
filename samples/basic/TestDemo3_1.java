public class TestDemo3_1
{
	public static void main(String[] args)
	{
		class Person
		{
			String Name;
			int Age;
			
			public void getName()
			{
				System.out.println("Name:"+Name);
			}
			
			public void getAge()
			{
				System.out.println("Age:"+Age);
			}
			
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
		Person Person1 =new Person();
		Person1.Name="Nike";
		Person1.getName();
		Person1.Age=22;
		Person1.getAge();
		Person1.jinZiTa(13);
		
	}
}