package phonebook.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import phonebook.entity.PersonEntity;

public class UpdatePerson {

  /**
   * Example of how to update a post using JPA and EntityManager
   *
   * @param args not used
   */
  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("phonebook_details");
    EntityManager entityManager = emf.createEntityManager();

    entityManager.getTransaction().begin();

    PersonEntity person = entityManager.find(PersonEntity.class, 151);

    System.out.println("Before");
    System.out.println("id: " + person.getId());
    System.out.println("Name: " + person.getName());
    System.out.println("Height: " + person.getHeight());

    person.setHeight(174);
    person.getAdresses().get(0).setStreet("Mjölnargränd");


    entityManager.persist(person);

    entityManager.getTransaction().commit();

    entityManager.close();
    emf.close();


  }

}
