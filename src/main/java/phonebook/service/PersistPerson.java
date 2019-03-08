package phonebook.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import phonebook.entity.PersonEntity;

public class PersistPerson {

  /**
   * Example of how to create (persist) a post using JPA and EntityManager
   *
   * @param args not used
   */
  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("phonebook_details");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();

    PersonEntity desk1 = new PersonEntity();
    //desk1.setId(10);
    desk1.setName("Arnold");
    desk1.setHeight(182);

    em.persist(desk1);

    em.getTransaction().commit();

    em.close();
    emf.close();


  }

}
