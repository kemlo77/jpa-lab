package furniture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistPerson {

  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("phonebook_details");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();

    PersonEntity desk1 = new PersonEntity();
    desk1.setId(10);
    desk1.setName("Harold");
    desk1.setHeight(182);

    em.persist(desk1);

    em.getTransaction().commit();

    em.close();
    emf.close();


  }

}
