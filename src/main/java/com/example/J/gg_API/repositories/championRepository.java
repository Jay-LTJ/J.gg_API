package com.example.J.gg_API.repositories;

import com.example.J.gg_API.entity.Champion;
import com.example.J.gg_API.entity.version;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface championRepository extends JpaRepository<Champion, Integer> {

    @Query("SELECT setval('champs_champid_seq', 1, false)")
    void resetChampIDs();

}
