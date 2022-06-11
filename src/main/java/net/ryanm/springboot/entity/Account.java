package net.ryanm.springboot.entity;

import javax.persistence.*;

@Entity
public class Account {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  public Integer id;

  @Column(name = "name", nullable = false)
  public String name;

  @Column(name = "picture")
  public String picture;

  @Column(name = "email")
  public String email;
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}