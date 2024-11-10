package one_to_one_uni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertPanCard {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pan-No and Pin code");
		Pancard pc = new Pancard(0,sc.next(),sc.nextInt());
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(pc);
		et.commit();
		System.out.println("Pan Details Inserted ...");
	
	}
}
