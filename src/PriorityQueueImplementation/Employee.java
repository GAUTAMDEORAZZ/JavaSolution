package PriorityQueueImplementation;

public class Employee implements Comparable<Employee> {
    private Integer employeeId;
    private String Name;
    private Integer salary;
    private String address;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return Name;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(Integer employeeId, String name, Integer salary, String address) {
        this.employeeId = employeeId;
        Name = name;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
    public Employee(){

    }


    @Override
    public int compareTo(Employee o) {
        return this.getEmployeeId()>o.getEmployeeId() ? 1 :-1;
    }
}
