package com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Không được phép để trống")
    @Size(max = 800, message = "Không vượt quá 800 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9\\+]*$", message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    private String name;

    @NotEmpty(message = "Không được phép để trống")
    @Size(max = 300, message = "Không quá 300 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9\\+]*$", message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    private String singer;


    @NotEmpty(message = "Không được phép để trống")
    @Size(max = 1000, message = "Không vượt quá 1000 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9\\+(,)\\+]*$", message = "Ngoại trừ dấu phẩy “,” , các ký tự đặc biệt còn lại không được phép lưu vào DB.")
    private String type;

    public Song(String name, String singer, String type) {
        this.name = name;
        this.singer = singer;
        this.type = type;
    }

    public Song() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
