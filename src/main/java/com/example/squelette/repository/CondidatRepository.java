package com.example.squelette.repository;

import com.example.squelette.entity.CondidatEntity;
import com.example.squelette.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CondidatRepository extends JpaRepository<CondidatEntity,Long > {
//    int countAllByStatus(StatusEntity statusEntity);
    int countAllByStatusEntity(StatusEntity statusEntity);
CondidatEntity findAllByStatusEntity(StatusEntity status);
}
