package org.sid.service;

import org.sid.entities.AppRole;
import org.sid.entities.AppUser;

public interface AccountService{
    public AppUser saveUser(String username, String password, String confirmedPassword);// cette methode permet d'ajouter un user
    public AppRole save(AppRole role);//cette methode permet d'ajouter un role
    public AppUser loadUserByUsername(String username);//cette methode permet de charger un user sachant son username
    public void addRoleToUser(String username, String rolename);// cette methode permet d'ajouter un role un role a un user
}
