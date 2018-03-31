public class TestDemo2
{
	public static void main(String[] args)
	{

//因此switch case执行时，一定会先进行匹配，匹配成功返回当前case的值，再根据是否有break，判断是否继续输出，或是跳出判断。	

/*	
//1.当每一个case都不存在break时，JVM并不会顺序输出每一个case对应的返回值，而是继续匹配，匹配不成功则返回默认case(default)。

        //根据用户输入，判断是星期几？switch 语句范例
		char c='e';   //修改字符来判定星期几
		switch(c)     //swtich()变量类型只能是int、short、char、byte和enum类型(枚举类型）
		{
			case 'a':
				System.out.println("今天星期一，猴子穿新衣");				
			case 'b':
				System.out.println("今天星期二，猴子穿吊带");
			case 'c':
				System.out.println("今天星期三，猴子爬雪山");
			default:
				System.out.println("不知道星期几");
		}
        //输出：不知道星期几
*/
		
		
/*				
//2.当每一个case都不存在break时，匹配成功后，从匹配成功的case开始，依次返回后续所有case的返回值。

        //根据用户输入，判断是星期几？switch 语句范例
		char c='b';   //修改字符来判定星期几
		switch(c)     //swtich()变量类型只能是int、short、char、byte和enum类型
		{
			case 'a':
				System.out.println("今天星期一，猴子穿新衣");				
			case 'b':
				System.out.println("今天星期二，猴子穿吊带");
			case 'c':
				System.out.println("今天星期三，猴子爬雪山");
			default:
				System.out.println("不知道星期几");
		}
        //输出：今天星期二，猴子穿吊带
		//      今天星期三，猴子爬雪山
		//      不知道星期几
*/	
			
				
/*					
//3.若当前匹配成功的case不存在break，则从当前case开始，依次返回后续case的返回值，直到遇到break，跳出判断。

        //根据用户输入，判断是星期几？switch 语句范例
		char c='b';   //修改字符来判定星期几
		switch(c)     //swtich()变量类型只能是int、short、char、byte和enum类型
		{
			case 'a':
				System.out.println("今天星期一，猴子穿新衣");				
			case 'b':
				System.out.println("今天星期二，猴子穿吊带");
			case 'c':
				System.out.println("今天星期三，猴子爬雪山");break;
			default:
				System.out.println("不知道星期几");
		}
		//输出：今天星期二，猴子穿吊带
		//      今天星期三，猴子爬雪山
*/

	
//4.若未找到匹配的case，则执行默认的case(default)。

        //根据用户输入，判断是星期几？switch 语句范例
		char c='e';   //修改字符来判定星期几
		switch(c)     //swtich()变量类型只能是int、short、char、byte和enum类型
		{
			case 'a':
				System.out.println("今天星期一，猴子穿新衣");break;				
			case 'b':
				System.out.println("今天星期二，猴子穿吊带");break;
			case 'c':
				System.out.println("今天星期三，猴子爬雪山");break;
			default:
				System.out.println("不知道星期几");
		}
		//输出：不知道星期几
		
		
	}
}