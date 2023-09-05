package com.example.squelette.controller;

import com.example.squelette.entity.CondidatEntity;
import com.example.squelette.entity.StatusEntity;
import com.example.squelette.service.CondidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Condidat")
public class    Condidat {
    @Autowired
    CondidatService condidatService;


    @PostMapping("/AddCondidat")
    CondidatEntity  addCondidat(@RequestBody CondidatEntity c) {
        return condidatService.addCondidat(c);
    }

    @GetMapping("/AfficherAllCondidats")
    List<CondidatEntity> retrieveAll() {
        return condidatService.retrieveAllCondidats();
    }

    @DeleteMapping("/DeleteCondidat/{numCondidat}")
    void deleteCondidat(@PathVariable Long numCondidat) {
        condidatService.deleteCondidat(numCondidat);
    }
    @PutMapping("/Modifier")
    CondidatEntity updateCondidat(@RequestBody CondidatEntity c){
        return condidatService.updateCondidat(c);
    }
    @GetMapping("/countAllByStatus/{statusEntity}")
    int countAllByStatus(@PathVariable StatusEntity statusEntity){
        return condidatService.countAllByStatusEntity(statusEntity);
    }
    @PutMapping("/updateStatus/{status}")
    public CondidatEntity updateStatut(@RequestBody CondidatEntity c,@PathVariable StatusEntity status){
        return condidatService.updateStatut(c,status);
    }
    @GetMapping("/all/{status}")
    public CondidatEntity findAllByStatusEntity(@PathVariable StatusEntity status){
        return condidatService.findAllByStatusEntity(status);
    }
}
