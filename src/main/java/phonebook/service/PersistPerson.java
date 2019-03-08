package phonebook.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import phonebook.entity.Address;
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

    Address adress1 = new Address();
    adress1.setCity("Östersund");
    adress1.setPostalCode(83151);
    adress1.setStreet("Pumpmakargränd");

    PersonEntity desk1 = new PersonEntity();
    desk1.setName("George");
    desk1.setHeight(178);
    desk1.getAdresses().add(adress1);


    em.persist(desk1);

    em.getTransaction().commit();

    em.close();
    emf.close();


  }

}
