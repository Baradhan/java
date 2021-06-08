class TestNestedIf {
	public static void main(String[] args){
		int i=5;

		if(i<15)
			if(i<10)
				if(i==5)
					System.out.println("i is equal to 5");
				else
					System.out.println("i is not equal to 5");
			else
				System.out.println("i is greater than 10");
		else if(i>15)
			System.out.println("i greated than 15");
		else if(i==15)
			System.out.println("i equal to 15");
	}
}