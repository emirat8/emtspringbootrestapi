package com.juaracoding.emtspringbootrestapi.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "ModelB")
public class ModelB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDModelB", columnDefinition = "BIGINT")
    private Integer idModelB;
    @Column(name = "CreatedBy", columnDefinition = "BIGINT DEFAULT 1 NOT NULL")
    private long createdBy;
    @Column(name = "CreatedDate", columnDefinition = "DATETIME DEFAULT getDate() NOT NULL")
    private String createdDate;
    @Column(name = "IsActive", columnDefinition = "SMALLINT NULL")
    private Integer isActive;
    @Column(name = "ModelB", columnDefinition = "CHAR(30) DEFAULT 'Default model B' NOT NULL")
    private char modelB;
    @Column(name = "ModifiedBy", columnDefinition = "BIGINT NULL")
    private long modifiedBy;
    @Column(name = "ModifiedDate", columnDefinition = "DATETIME NULL")
    private String modifiedDate;

    @ManyToOne
    @JoinColumn(name="IDModelA", foreignKey =  @ForeignKey(name = "IDModelA", foreignKeyDefinition = "FOREIGN KEY ([IDModelA]) REFERENCES [ModelA] ([IDModelA]) ON DELETE SET NULL ON UPDATE SET NULL"))
    private ModelA modelA;
    @ManyToMany(mappedBy = "listModelB")
    private List<ModelC> listModelC;
}
