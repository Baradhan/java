import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		String str = reader.nextLine();
		int num = reader.nextInt();

		System.out.println(str+" "+num);
	}
}