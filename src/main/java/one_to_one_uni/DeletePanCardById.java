package one_to_one_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeletePanCardById {
	public static void main(String[] args) {
		EntityManager em= Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et=em.getTransaction();
		int pcid =1;
		Pancard pc=em.find(Pancard.class, pcid);
		Query q= em.createQuery("from Person");
		List<Person> pl =q.getResultList();
		for(Person p:pl) {
			if(p.getPc().getId()==pcid);
			{
				et.begin();
				em.merge(pc);
				et.commit();
			}
		}
		
	}
}