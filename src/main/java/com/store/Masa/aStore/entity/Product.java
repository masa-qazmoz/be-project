package com.store.Masa.aStore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products") // table name sa7 products
public class Product { // same lazm Product
    // no need to add pro for all fields, 3adatan bn3malo bas lal id 3shan fel joins b5arbish lma ykon fe kter fields id
    // other fields ma blzam pic,price,name
    @Id
    @Column(name = "proId") //product_id
    private long proId;
    @Column (name="proPic")
    private byte[] proPic;
    @Column (name ="proPrice")
    private int proPrice;
    @Column (name ="proName")
    private String proName;
    // why you have adminId? you can change it to relation @ManyToOne
    @Column (name ="adminId")
    private int adminId;

}

