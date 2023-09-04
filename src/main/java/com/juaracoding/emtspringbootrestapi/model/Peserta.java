package com.juaracoding.emtspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2 (Community Edition)
Build #IC-232.8660.185, built on July 26, 2023
@Author EmiratZ a.k.a. M Emirat Millenium Try
Java Developer
Created on 31/08/2023 11.06
@Last Modified 31/08/2023 11.06
Version 1.0
*/

import com.juaracoding.emtspringbootrestapi.util.ConstantPeserta;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Peserta")
public class Peserta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = ConstantPeserta.NAMA_NOT_NULL)
    @NotEmpty(message = ConstantPeserta.NAMA_NOT_EMPTY)
    @Length(min = 5, max = 15,message = ConstantPeserta.NAMA_MIN_MAX)
    @NotBlank(message = ConstantPeserta.NAMA_NOT_BLANK)
    private String nama;
    private String batch;
    private String alamat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
