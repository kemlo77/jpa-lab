package phonebook.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import phonebook.entity.PersonEntity;

public class FindPerson {

  /**
   * Example of how to find a post using JPA and EntityManager
   *
   * @param args not used
   */
  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("phonebook_details");
    EntityManager em = emf.createEntityManager();

    PersonEntity person = em.find(PersonEntity.class, 1);
    System.out.println("id: " + person.getId());
    System.out.println("Name: " + person.getName());
    System.out.println("Height: " + person.getHeight());

    em.close();
    emf.close();
  }

}
