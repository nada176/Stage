package com.example.squelette.service;

import com.example.squelette.entity.CondidatEntity;
import com.example.squelette.entity.StatusEntity;

import java.util.List;

public interface CondidatInter {
    public CondidatEntity addCondidat(CondidatEntity a) ;
    void deleteCondidat(Long numAbon);

    CondidatEntity updateCondidat(CondidatEntity a);

    List<CondidatEntity> retrieveAllCondidats();
    int countAllByStatusEntity(StatusEntity statusEntity);
    CondidatEntity updateStatut(CondidatEntity c,StatusEntity status);
    CondidatEntity findAllByStatusEntity(StatusEntity status);
}

