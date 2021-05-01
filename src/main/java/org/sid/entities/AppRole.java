package org.sid.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //relation objet mapping
@Data //pour les getters et setters
@AllArgsConstructor //constructeur avec paramettre
@NoArgsConstructor //constructeur sans params
@ToString //methode
public class AppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long Id;
    private String roleName;
}
