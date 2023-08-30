package com.juaracoding.emtspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2 (Community Edition)
Build #IC-232.8660.185, built on July 26, 2023
@Author EmiratZ a.k.a. M Emirat Millenium Try
Java Developer
Created on 30/08/2023 13.44
@Last Modified 30/08/2023 13.44
Version 1.0
*/

public class Tunggal {
    private CalonPeserta calonPeserta;

    private Long id;
    private Integer intZ;

    public CalonPeserta getCalonPeserta() {
        return calonPeserta;
    }

    public void setCalonPeserta(CalonPeserta calonPeserta) {
        this.calonPeserta = calonPeserta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIntZ() {
        return intZ;
    }

    public void setIntZ(Integer intZ) {
        this.intZ = intZ;
    }
}