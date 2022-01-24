package com.example.ung_dung_quan_ly_khach_hang_phan_trang_tiem_kiem.model;

import com.sun.istack.internal.NotNull;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]*", message = "Chữ phải nhập từ a-zA-Z")
    private String firstName;
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]*", message = "Chữ phải nhập từ a-zA-Z")
    private String lastName;


    @ManyToOne
    @JoinColumn(name = "province_id", referencedColumnName = "id")
    private Province province;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
