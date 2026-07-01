package com.example.J.gg_API.repositories;

import com.example.J.gg_API.entity.version;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface versionRepository extends JpaRepository<version, Integer> {


}
