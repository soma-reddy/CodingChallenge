
import java.util.*;
import java.io.*;

public class Employee {
	public static void main(String args[]) throws IOException {
		List<EmpDetails> empDetails = new ArrayList<>();
		EmpDetails e1 = new EmpDetails(11, "Vikrant", "8572947714", "75 Gardner St, Allston");
		EmpDetails e2 = new EmpDetails(100, "John", "8572947715", "76 Gardner St, Boston");
		EmpDetails e3 = new EmpDetails(113, "Sam", "8572947717", "77 Gardner St, California");

		empDetails.add(e1);
		empDetails.add(e2);
		empDetails.add(e3);

		Iterator<EmpDetails> i = empDetails.iterator();

		while (i.hasNext()) {
			System.out.println(i.next().getdata());
		}
	}
}

class EmpDetails {

	private int id;
	private String name;
	private String phone;
	private String address;

	public EmpDetails(int id, String name, String phone, String address) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	// retrieve data
	public String getdata() {
		return String.format("Id: %d , Name: %s , Phone: %s , Address: %s", this.id, this.name, this.phone,
				this.address);
	}
}
