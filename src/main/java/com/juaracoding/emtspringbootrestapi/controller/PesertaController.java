package com.juaracoding.emtspringbootrestapi.controller;
/*
IntelliJ IDEA 2023.2 (Community Edition)
Build #IC-232.8660.185, built on July 26, 2023
@Author EmiratZ a.k.a. M Emirat Millenium Try
Java Developer
Created on 31/08/2023 11.05
@Last Modified 31/08/2023 11.05
Version 1.0
*/

import com.juaracoding.emtspringbootrestapi.model.Peserta;
import com.juaracoding.emtspringbootrestapi.repo.PesertaRepo;
import com.juaracoding.emtspringbootrestapi.service.PesertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/api/peserta/")
public class PesertaController {

    @Autowired
    PesertaRepo pesertaRepo;

    @Autowired
    PesertaService pesertaService;

    @GetMapping("/")
    public ResponseEntity<Object> getAllData() {
        Map<String,Object> m = new HashMap<String,Object>();
        List<Peserta> daftarPeserta = pesertaRepo.findAll();
        m.put("data",daftarPeserta);
        m.put("waktu",new Date());
        m.put("message","Data ada !!");

        return new ResponseEntity<Object>(m,HttpStatus.ACCEPTED);
    }

    @PostMapping("/")
    public String postData(@Valid @RequestBody Peserta peserta) {
        pesertaService.save(peserta);
        return peserta.getNama() + " berhasil ditambahkan";
    }

    @GetMapping("/detail")
    public Map<String,Object> searchPesertaById(@RequestParam(value = "id") Integer id) {
        Optional<Peserta> hasil = pesertaRepo.findById(id);
        Map<String,Object> m = new HashMap<>();
        if(hasil.isEmpty())
        {
            m.put("message","Data tidak ada");
            return m;
        }
        m.put("data",hasil.get());
        m.put("message","Data ditemukan");
        return m;
    }

}
