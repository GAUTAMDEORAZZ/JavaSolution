package PriorityQueueImplementation;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Employee emp1=new Employee(1,"Sumit Kumar",93000,"Banglore");
        Employee emp2=new Employee(4,"Amit Kumar",67000,"Pune");
        Employee emp3=new Employee(3,"Ramesh Kumar",78000,"Bhopal");
        Employee emp4=new Employee(2,"Suresh Kumar",80000,"Simla");
        Employee emp5=new Employee(5,"Yogesh Kumar",76000,"Ranchi");

        Queue<Employee> empPriority=new java.util.PriorityQueue<>(new CompareBySalary());
        empPriority.add(emp1);
        empPriority.add(emp3);
        empPriority.add(emp2);
        empPriority.add(emp4);
        empPriority.add(emp5);
        empPriority.add(emp1);

        while(!empPriority.isEmpty()){
            System.out.println(empPriority.poll());
        }


    }
}
