package com.juaracoding.emtspringbootrestapi.model;

import javax.persistence.*;

@Entity
@Table(name = "ModelX")
public class TugasA {
    @Id
    @Column(name = "IDModelX", columnDefinition = "VARCHAR(30)")
    private String idModelX;
    @Column(name = "Alamat", columnDefinition = "NVARCHAR(255) DEFAULT 'BELUM DIISI' NOT NULL")
    private String alamat;
    @Column(name = "CreatedBy", columnDefinition = "BIGINT DEFAULT 0 NOT NULL")
    private long createdBy;
    @Column(name = "CreatedDate", columnDefinition = "DATETIME DEFAULT getDate() NOT NULL")
    private String createdDate;
    @Column(name = "IsActive", columnDefinition = "SMALLINT NULL")
    private Integer isActive;
    @Column(name = "JenisKelamin", columnDefinition = "CHAR(1) DEFAULT 'P' NULL")
    private char jenisKelamin;
    @Column(name = "MasihHidup", columnDefinition = "BIT NULL")
    private byte masihHidup;
    @Column(name = "ModifiedBy", columnDefinition = "BIGINT NULL")
    private long modifiedBy;
    @Column(name = "ModifiedDate", columnDefinition = "DATETIME NULL")
    private String modifiedDate;
    @Column(name = "Nama", columnDefinition = "CHAR(40) DEFAULT 'SEDANG DIMINTA' NOT NULL")
    private char nama;
    @Column(name = "TanggalLahir", columnDefinition = "DATE NULL")
    private String tanggalLahir;
}