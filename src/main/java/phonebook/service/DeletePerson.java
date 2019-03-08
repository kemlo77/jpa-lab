package phonebook.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import phonebook.entity.PersonEntity;

public class DeletePerson {

  /**
   * Example of how to delete a post using JPA and EntityManager
   *
   * @param args not used
   */
  public static void main(String[] args) {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("phonebook_details");
    EntityManager entityManager = emf.createEntityManager();

    entityManager.getTransaction().begin();

    PersonEntity person = entityManager.find(PersonEntity.class, 1);

    entityManager.remove(person);

    entityManager.getTransaction().commit();

    entityManager.close();
    emf.close();


  }

}
