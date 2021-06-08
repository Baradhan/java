public class TestConsole{
	public static void main(String[] args){
		String name = System.console().readLine();
		int num = Integer.parseInt(System.console().readLine());
		System.out.println(name+" "+num);
	}
}