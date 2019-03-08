package phonebook.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class PersonEntity {

  @Id
  @GeneratedValue
  private int id;
  private String name;
  private int height;

  @ElementCollection
  private List<Address> address = new ArrayList<>();

  public PersonEntity() {
  }

  public int getId() {
    return id;
  }

  public List<Address> getAdresses() {
    return address;
  }

  public void setAddress(List<Address> address) {
    this.address = address;
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

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}
