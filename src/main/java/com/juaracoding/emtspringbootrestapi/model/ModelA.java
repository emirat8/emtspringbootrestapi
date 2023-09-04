package com.juaracoding.emtspringbootrestapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ModelA")
public class ModelA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDModelA", columnDefinition = "BIGINT")
    private String idModelA;
    @Column(name = "CreatedBy", columnDefinition = "BIGINT DEFAULT 1 NOT NULL")
    private long createdBy;
    @Column(name = "CreatedDate", columnDefinition = "DATETIME DEFAULT getDate() NOT NULL")
    private String createdDate;
    @Column(name = "IsActive", columnDefinition = "SMALLINT NULL")
    private Integer isActive;
    @Column(name = "ModelA", columnDefinition = "CHAR(20) DEFAULT 'Default model A' NOT NULL")
    private char modelA;
    @Column(name = "ModifiedBy", columnDefinition = "BIGINT NULL")
    private long modifiedBy;
    @Column(name = "ModifiedDate", columnDefinition = "DATETIME NULL")
    private String modifiedDate;

    @OneToMany(mappedBy = "modelA")
    private List<ModelB> listModelB;
}
