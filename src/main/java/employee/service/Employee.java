package employee.service;

public class Employee {
    private String id;
    private String firstName;
    private String surname;
    private String birthdate;
    private String homeAddress;
    private String officeLocation;
    private String officePhone;
    private String title;
    private int salary;
    private String taxFileNumber;

    public Employee(String id, String firstName, String surname, String birthdate, String homeAddress, String officeLocation, String officePhone, String title, int salary, String taxFileNumber) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.birthdate = birthdate;
        this.homeAddress = homeAddress;
        this.officeLocation = officeLocation;
        this.officePhone = officePhone;
        this.title = title;
        this.salary = salary;
        this.taxFileNumber = taxFileNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTaxFileNumber() {
        return taxFileNumber;
    }

    public void setTaxFileNumber(String taxFileNumber) {
        this.taxFileNumber = taxFileNumber;
    }
}

