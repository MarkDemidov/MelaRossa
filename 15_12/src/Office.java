public class Office {
    private String firstName;
    private String lastName;
    private int salary;
    private int year;

    public Office(String firstName, String lastName, int salary, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.year = year;
    }

    public Office() {

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Office{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", year=" + year +
                '}';
    }
}
