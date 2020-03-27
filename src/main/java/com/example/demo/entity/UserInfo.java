package com.example.demo.entity;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "user_entity")
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "email", unique = true)
  private String email;

  @Column(name = "password")
  private String password;
}
