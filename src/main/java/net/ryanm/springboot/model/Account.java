package net.ryanm.springboot.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "accounts")
public class Account {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  @Column(name = "name", nullable = false)
  public String name;

  @Column(name = "picture")
  public String picture;

  @Column(name = "email")
  public String email;
  
  public Account(){

  }
  public Account(String name, String picture, String email){
    this.name = name;
    this.picture = picture;
    this.email = email;
  }
  public String getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getPicture(){
    return picture;
  }

  public void setPicture(String picture){
    this.picture = picture;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email = email;
  }

  @Override
  public String toString(){
    return "Account [id=" + id + ", name=" + name + ", picture=" + picture + ", email=" + email + "]";
  }
}