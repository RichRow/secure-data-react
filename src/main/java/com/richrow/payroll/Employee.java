@Data
@Entity
public class Employee {
	
	private @id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String description;

	priate Employee(){}

	public Employee(String firstName, String lastName, String description){
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
	}
}
