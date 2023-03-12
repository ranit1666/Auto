package abc;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		
		String a="abcd";
		ArrayList<String> b=new ArrayList<String>();
		b.add(a);
		Collections.reverse(b);
System.out.print(b);
	}
}
