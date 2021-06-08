public class TestBreak2{
	public static void main(String[] args){
		boolean t = true;

		first:
		{
			second:
			{
				third:
				{
					System.out.println("Before break statement");

					if(t)
						break second;
				}

				System.out.println("This wont execute");
			}

			System.out.println("This is after second block");
		}
	}
}
