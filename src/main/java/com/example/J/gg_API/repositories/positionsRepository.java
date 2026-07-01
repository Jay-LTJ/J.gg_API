package com.example.J.gg_API.repositories;


import com.example.J.gg_API.entity.positions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface positionsRepository extends JpaRepository<positions, Integer> {
}
