package com.everis.citiesapi.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "pais")
public class Country {

    @Id
    private long id;

    @Column (name = "nome")
    private String name;

    @Column (name = "nome_pt")
    private String portugueseName;

    @Column (name = "sigla")
    private String code;

    private int bacen;

    public Country() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public String getCode() {
        return code;
    }

    public int getBacen() {
        return bacen;
    }
}
