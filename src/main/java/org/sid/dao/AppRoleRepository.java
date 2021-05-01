package org.sid.dao;

import org.sid.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //pour avoir les fonctionnalites de api resource
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {

    public AppRole findByRoleName(String roleName);//pour savoir le role existe dans la BD
}
