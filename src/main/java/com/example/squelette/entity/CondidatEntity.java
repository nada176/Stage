package com.example.squelette.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CondidatEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCondidat ;
    private  String nom ;
    private  String prenom ;
    private  String adress ;
    private  String tel ;
    @Enumerated(EnumType.STRING)
    private StatusEntity statusEntity ;
    private  String email ;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date date ;

    @OneToOne

    private InfoProfessionnellesEntity infoProfessionnellesEntity;
}
