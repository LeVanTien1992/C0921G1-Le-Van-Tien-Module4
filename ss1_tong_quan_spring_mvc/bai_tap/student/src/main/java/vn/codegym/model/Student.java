package vn.codegym.model;

public class Student {
    private int id;
    private String name;
    private String age;
    private String address;
    private String phone;

    public Student() {
    }

    public Student(int id, String name, String age, String adddress, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = adddress;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", adddress='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
