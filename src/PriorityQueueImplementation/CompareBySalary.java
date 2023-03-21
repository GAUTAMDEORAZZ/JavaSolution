package PriorityQueueImplementation;

import java.util.Comparator;

public class CompareBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary()>o2.getSalary() ? 1 :-1;
    }
}
