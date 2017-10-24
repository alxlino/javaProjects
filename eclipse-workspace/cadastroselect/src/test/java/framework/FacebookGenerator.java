package framework;

//import org.fluttercode.datafactory.impl.DataFactory;

import com.github.javafaker.Faker;

public class FacebookGenerator {

	public String firstName;
	private String lastName;

	public void geradorDeMassa() {
		
		Faker faker = new Faker();

		//DataFactory df = new DataFactory();
		
		this.setFirstName(faker.name().firstName());
		this.setLastName(faker.name().lastName());
		
		//this.setFirstName(df.getFirstName());
		//this.setLastName(df.getLastName());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void main(String[] args) {
		
		FacebookGenerator generator = new FacebookGenerator();
		generator.geradorDeMassa();
		
		System.out.println(generator.getFirstName());
		System.out.println(generator.getLastName());
		
	}
}


