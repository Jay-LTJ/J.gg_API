package com.example.J.gg_API.repositories;

import com.example.J.gg_API.entity.ChampionStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface championStatsRepository extends JpaRepository<ChampionStats, Integer>{

    @Query("SELECT setval('riftstats_riftstatsid_seq', 1, false)")
    void resetChampStatIDs();
}
