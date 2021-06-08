public class TestCommandLineArgument {
	public static void main(String[] args){
		if(args.length!=0){
			for(String str:args){
				System.out.println(str);
			}
		}
	}
}