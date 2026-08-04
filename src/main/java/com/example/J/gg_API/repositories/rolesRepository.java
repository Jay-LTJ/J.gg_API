package com.example.J.gg_API.repositories;

import com.example.J.gg_API.entity.roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface rolesRepository extends JpaRepository<roles, Integer> {

    @Query("SELECT setval('roles_roleid_seq', 1, false)")
    void resetRoleIDs();
}
