package com.store.Masa.aStore.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="admins")
// hdol el classes lazm ykono upper w 3a'lban singular
// 3adatan bkon user -> type or roles admin
@Setter
@Getter // this annotation adds getter and setted for all fields
public class Admin {  // should be Admin
    @Id
    @Column(name = "adminId") /// tables ussually admin_id not camel
    private Long adminId;

    @Column(name = "email")  // Column names should match your DB table
    private String email;

    @Column(name = "phone")
    private String phone;
    @Column(name = "name")  // Column names should match your DB table
    private String name;

    @Column(name = "password")
    private String password;   // hdol private fields no one access them -> you shoudl add getters and setters
    // el password shouldn't be saved, and if saved mish lazm trja3 haik
    // should be enrypted
}
