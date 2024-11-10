package one_to_one_uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Person {
	public Person() {
		
	}
	public Person(int id, String name, String email, Pancard pc) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pc = pc;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@OneToOne
	private Pancard pc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Pancard getPc() {
		return pc;
	}
	public void setPc(Pancard pc) {
		this.pc = pc;
	}
	
	
}
