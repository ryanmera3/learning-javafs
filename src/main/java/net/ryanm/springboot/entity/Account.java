package net.ryanm.springboot.entity;

import javax.persistence.*;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "account")

public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;

  @Column(name = "name", nullable = false)
  public String name;

  @Column(name = "picture")
  public String picture;

  @Column(name = "email")
  public String email;

}