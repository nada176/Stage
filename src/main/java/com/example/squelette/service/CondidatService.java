package com.example.squelette.service;

import com.example.squelette.entity.CondidatEntity;
import com.example.squelette.entity.StatusEntity;
import com.example.squelette.repository.CondidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondidatService implements CondidatInter {
    @Autowired
    CondidatRepository condidatRepository ;


    @Override
    public CondidatEntity addCondidat(CondidatEntity c) {
        return condidatRepository.save(c);
    }

    @Override
    public void deleteCondidat(Long numCond) {
        condidatRepository.deleteById(numCond);

    }

    @Override
    public CondidatEntity updateCondidat(CondidatEntity c) {
        return condidatRepository.save(c);
    }

    @Override
    public List<CondidatEntity> retrieveAllCondidats() {
        List<CondidatEntity> c = (List<CondidatEntity>) condidatRepository.findAll();
        return c;
    }
    public int countAllByStatusEntity(StatusEntity statusEntity) {
        return condidatRepository.countAllByStatusEntity(statusEntity);
    }

    @Override
    public CondidatEntity updateStatut(CondidatEntity c, StatusEntity status) {
        c.setStatusEntity(status);
        return  condidatRepository.save(c);


    }

    @Override
    public CondidatEntity findAllByStatusEntity(StatusEntity status) {
        return condidatRepository.findAllByStatusEntity(status);
    }
}
