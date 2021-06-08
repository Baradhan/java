public class TestStringBuiltInCall {
	public static void main(String[] args){
		String str = "GeeksForGeeks";

		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 8));
		System.out.println(str.indexOf("eeks"));
		System.out.println(str.indexOf("eeks", 3));
		System.out.println(str.lastIndexOf("eeks"));
		System.out.println(str.concat("GeeksForGeeks"));
		System.out.println(str.equals("GeeksForGeeks"));
		System.out.println(str.equalsIgnoreCase("geeksforgeeks"));
		System.out.println("Great".compareTo("Geeks"));
		System.out.println("great".compareTo("Geeks"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println("  GeeksForGeeks  ".trim());
		System.out.println(str.replace('G', 'F'));
		System.out.println(str.replaceFirst("Geeks", "Baradhan"));
		System.out.println(str.replaceAll("Geeks", "Baradhan"));
		System.out.println(str.startsWith("Geeks"));
		System.out.println(str.endsWith("Geeks"));
		System.out.println(str.toCharArray());
		System.out.println(str.isEmpty());
		System.out.println(str.split("For",1));

	}
}