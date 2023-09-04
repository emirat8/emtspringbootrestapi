package com.juaracoding.emtspringbootrestapi.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "ModelC")
public class ModelC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDModelC", columnDefinition = "BIGINT")
    private Integer idModelC;
    @Column(name = "CreatedBy", columnDefinition = "BIGINT DEFAULT 1 NOT NULL")
    private long createdBy;
    @Column(name = "CreatedDate", columnDefinition = "DATETIME DEFAULT getDate() NOT NULL")
    private String createdDate;
    @Column(name = "IsActive", columnDefinition = "SMALLINT NULL")
    private Integer isActive;
    @Column(name = "ModelC", columnDefinition = "CHAR(25) DEFAULT 'Default model C' NOT NULL")
    private char modelC;
    @Column(name = "ModifiedBy", columnDefinition = "BIGINT NULL")
    private long modifiedBy;
    @Column(name = "ModifiedDate", columnDefinition = "DATETIME NULL")
    private String modifiedDate;

    @ManyToMany
    @JoinTable(name = "MapModelBModelC",
            joinColumns = {@JoinColumn(name = "IDModelC",referencedColumnName = "IDModelC", foreignKey =@ForeignKey(name = "fkMapToModelC"))},
            inverseJoinColumns = {@JoinColumn(name = "IDModelB",referencedColumnName = "IDModelB", foreignKey =@ForeignKey(name = "fkMapToModelB"))},
            uniqueConstraints = @UniqueConstraint(columnNames = {"IDModelC","IDModelB"})
    )
    private List<ModelB> listModelB;
}
