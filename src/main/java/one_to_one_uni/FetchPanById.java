package one_to_one_uni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class FetchPanById {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		System.out.println("Enter id: ");
		Person p=em.find(Person.class,new Scanner(System.in).nextInt());
		System.out.println(p.getName());
		System.out.println(p.getPc().getpNo());
		
	}
}
