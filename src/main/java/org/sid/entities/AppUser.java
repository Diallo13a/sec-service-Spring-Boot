package org.sid.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity //relation objet mapping
@Data //pour les getters et setters
@AllArgsConstructor //constructeur avec paramettre
@NoArgsConstructor //constructeur sans params
@ToString //methode
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;
    private boolean actived;
    @ManyToMany(fetch = FetchType.EAGER) // 'FetchType.EAGER' A chaque fois qu'il charge un user il va charger ses roles
    private Collection<AppRole> roles = new ArrayList<>();
}
