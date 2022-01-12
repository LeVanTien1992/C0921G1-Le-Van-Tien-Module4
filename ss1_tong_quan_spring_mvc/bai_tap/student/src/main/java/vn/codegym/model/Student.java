package vn.codegym.model;

public class Student {
    private String id;
    private String name;
    private String age;
    private String adddress;
    private String phone;

    public Student() {
    }

    public Student(String id, String name, String age, String adddress, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adddress = adddress;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getAdddress() {
        return adddress;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
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
                ", adddress='" + adddress + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
