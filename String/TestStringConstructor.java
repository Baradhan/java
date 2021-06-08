import java.nio.charset.Charset;
import java.io.IOException;


public class TestStringConstructor{

	public static void main(String[] args) throws IOException {
		byte[] b_arr = {71, 101, 101, 107, 115};
		String str = new String(b_arr);
		System.out.println(str);

		str = new String(b_arr, Charset.defaultCharset());
		System.out.println(str);

		str = new String(b_arr, "US-ASCII");
		System.out.println(str);

		str = new String(b_arr, 1, 3);
		System.out.println(str);

		str = new String(b_arr, 1, 3, Charset.defaultCharset());
		System.out.println(str);

		str = new String(b_arr, 1, 3, "US-ASCII");
		System.out.println(str);

		char[] c_arr = {'G', 'e', 'e', 'k', 's'};
		str = new String(c_arr);
		System.out.println(str);


		str = new String(c_arr, 1, 3);
		System.out.println(str);


		StringBuffer strbuf = new StringBuffer("Geeks");
		str = new String(strbuf);
		System.out.println(str);

		StringBuilder strbud = new StringBuilder("Geeks");
		str = new String(strbud);
		System.out.println(str);

	}

}