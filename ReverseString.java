import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char opt = 'Y';
		while (opt != 'N') {
			System.out.println("Enter the string::");
			String input = br.readLine();
			String revStr = "";
			for (int i = input.length() - 1; i >= 0; i--) {
				revStr += input.charAt(i);
			}
			// display the result
			System.out.println("Reverse String::" + revStr);
			System.out.println("Do you wish to continue ? Press Y  for Yes or N for No");
			opt = (br.readLine().charAt(0));
		}
	}

}
