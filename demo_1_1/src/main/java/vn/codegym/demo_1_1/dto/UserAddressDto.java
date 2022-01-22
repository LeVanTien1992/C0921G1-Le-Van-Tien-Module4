package vn.codegym.demo_1_1.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class UserAddressDto {

    @NotEmpty(message = "Name not Empty Pleazzz")
    private String name;

    @NotEmpty
    @Pattern(regexp = "^([\\+84|84|0]+(3|5|7|8|9|1[2|6|8|9]))+([0-9]{8})\\b$")
    private String phone;

    @NotEmpty(message = "Name not Empty Pleazzz")
    private String street;

    @NotEmpty(message = "Name not Empty Pleazzz")
    private String city;

    public UserAddressDto(String name, String phone, String street, String city) {
        this.name = name;
        this.phone = phone;
        this.street = street;
        this.city = city;
    }

    public UserAddressDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
