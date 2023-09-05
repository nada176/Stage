package com.example.squelette.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class InfoProfessionnellesEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long experienceprofessionnelle  ;
    private  String competences  ;
    private  String certifications  ;
    private  String langueparlée  ;

    @OneToOne(mappedBy="infoProfessionnellesEntity")
    private CondidatEntity condidatEntity  ;

    @OneToOne

    private InfoProfessionnellesEntity infoProfessionnellesEntity;
}
