package org.example.ibroximjon.spring_data_jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Table
@Entity
public class Author {
    @Id
    @GeneratedValue
    Integer id;
    String firstName;
    String lastName;
    String email;
    Integer age;
}
