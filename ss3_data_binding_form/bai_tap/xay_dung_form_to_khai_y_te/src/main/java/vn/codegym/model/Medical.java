package vn.codegym.model;

public class Medical {
    private String name;
    private String year;
    private int gender;
    private String nationality;
    private String passport;
    private String travelInformation;
    private String vehicleData;
    private int seats;
    private String startDate;
    private String endDate;
    private String travelDescription;
    private String contactAddress;
    private String homeAddress;
    private String phone;
    private String email;
    private String symptomsDescription;
    private String exposureHistory;

    public Medical() {
    }

    public Medical(String name, String year, int gender, String nationality, String passport,
                   String travelInformation, String vehicleData, int seats, String startDate,
                   String endDate, String travelDescription, String contactAddress, String homeAddress,
                   String phone, String email, String symptomsDescription, String exposureHistory) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.nationality = nationality;
        this.passport = passport;
        this.travelInformation = travelInformation;
        this.vehicleData = vehicleData;
        this.seats = seats;
        this.startDate = startDate;
        this.endDate = endDate;
        this.travelDescription = travelDescription;
        this.contactAddress = contactAddress;
        this.homeAddress = homeAddress;
        this.phone = phone;
        this.email = email;
        this.symptomsDescription = symptomsDescription;
        this.exposureHistory = exposureHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    public String getVehicleData() {
        return vehicleData;
    }

    public void setVehicleData(String vehicleData) {
        this.vehicleData = vehicleData;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTravelDescription() {
        return travelDescription;
    }

    public void setTravelDescription(String travelDescription) {
        this.travelDescription = travelDescription;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSymptomsDescription() {
        return symptomsDescription;
    }

    public void setSymptomsDescription(String symptomsDescription) {
        this.symptomsDescription = symptomsDescription;
    }

    public String getExposureHistory() {
        return exposureHistory;
    }

    public void setExposureHistory(String exposureHistory) {
        this.exposureHistory = exposureHistory;
    }

    @Override
    public String toString() {
        return "Medical{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", gender=" + gender +
                ", nationality='" + nationality + '\'' +
                ", passport='" + passport + '\'' +
                ", travelInformation='" + travelInformation + '\'' +
                ", vehicleData='" + vehicleData + '\'' +
                ", seats=" + seats +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", travelDescription='" + travelDescription + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", symptomsDescription='" + symptomsDescription + '\'' +
                ", exposureHistory='" + exposureHistory + '\'' +
                '}';
    }
}
