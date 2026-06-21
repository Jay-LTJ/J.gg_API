package com.example.J.gg_API.repositories;

import com.example.J.gg_API.entity.Champion;
import com.example.J.gg_API.entity.version;
import org.springframework.data.jpa.repository.JpaRepository;

public interface championRepository extends JpaRepository<Champion, Integer> {
}
