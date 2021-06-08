public class TestForEnhancedLoop{
	public static void main(String[] args){
		String[] strArr1 = {"A", "B", "C", "D", "E"};
		String strArr2[] = {"A", "B", "C", "D", "E"};

		for(String element: strArr1){
			System.out.println(element);
		}

		for(String element: strArr2){
			System.out.println(element);
		} 
	}
}