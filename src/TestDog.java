// Person class
class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public boolean purchaseParkingPass(Address a) {
        // Logic to purchase parking pass
        return true; // Placeholder return value
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}

// Student class extending Person
class Student extends Person {
    private Long studentId;
    private Float averageMark;

    public Student(String name, String phoneNumber, String emailAddress, Long studentId, Float averageMark) {
        super(name, phoneNumber, emailAddress);
        this.studentId = studentId;
        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnroll() {
        // Logic to determine eligibility
        return true; // Placeholder return value
    }

    public int getAttendance(AttendanceSheet sheet) {
        return sheet.getAttendance(studentId);
    }

    // Getters and Setters
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Float averageMark) {
        this.averageMark = averageMark;
    }
}

// Professor class extending Person
class Professor extends Person {
    private Float salary;

    public Professor(String name, String phoneNumber, String emailAddress, Float salary) {
        super(name, phoneNumber, emailAddress);
        this.salary = salary;
    }

    public String remarks() {
        // Logic to generate remarks
        return "Sample remarks"; // Placeholder return value
    }

    // Getters and Setters
    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}

// Address class
class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public void notes() {
        // Logic to add notes
        System.out.println("Notes added for address.");
    }

    // Getters and Setters
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

// AttendanceSheet class
class AttendanceSheet {
    private Long studentId;

    public AttendanceSheet(Long studentId) {
        this.studentId = studentId;
    }

    public int getAttendance(Long id) {
        // Logic to get attendance
        return 90; // Placeholder return value
    }

    // Getters and Setters
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}

// Main class to test the implementation
class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Cityville", "State", "12345", "Countryland");
        Student student = new Student("John Doe", "123-456-7890", "john.doe@example.com", 101L, 85.5f);
        Professor professor = new Professor("Jane Smith", "987-654-3210", "jane.smith@example.com", 75000.0f);
        AttendanceSheet sheet = new AttendanceSheet(student.getStudentId());

        System.out.println(student.getName() + " attendance: " + student.getAttendance(sheet));
        System.out.println(professor.getName() + " remarks: " + professor.remarks());
        System.out.println("Address notes:");
        address.notes();
    }
}