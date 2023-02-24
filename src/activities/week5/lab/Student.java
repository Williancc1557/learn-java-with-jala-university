package activities.week5.lab;

public class Student {
    private String registration;
    private String name;
    private String email;
    private String course;
    private String phone;
    private String address;
    private int absencesNumber;
    private double[] grades;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName(String newName) {
        return this.name;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getEmail(String newEmail) {
        return this.email;
    }

    public void setCourse(String newCourse) {
        this.course = newCourse;
    }
    public String getCourse(String newCourse) {
        return this.course;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAbsencesNumber() {
        return absencesNumber;
    }

    public void setAbsencesNumber(int absencesNumber) {
        this.absencesNumber = absencesNumber;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    private double getTotalGrade() {
        double total = 0;

        for (double grade : this.grades) {
            total += grade;
        }

        return total / 3;
    }

    public Boolean isApproved() {
        return getTotalGrade() >= 70 && this.absencesNumber <= 15;
    }

    public Boolean isReproved() {
        return getTotalGrade() < 50 || this.absencesNumber > 15;
    }

    public Boolean willTakeExam() {
        return (getTotalGrade() >= 50 && getTotalGrade() < 70) && this.absencesNumber <= 15;
    }
}
