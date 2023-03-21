package CompratorCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studnetList=new ArrayList<>();
        Student s1=new Student("Amit Kumar",5,344,15);
        Student s2=new Student("Rajesh Kumar",3,388,16);
        Student s3=new Student("Vikash Kumar",8,433,18);
        studnetList.add(s2);
        studnetList.add(s3);
        studnetList.add(s1);
        Collections.sort(studnetList);
        System.out.println(studnetList);
        Collections.sort(studnetList,new CompareByMarks());
        System.out.println(studnetList);
        Collections.sort(studnetList,new CompareByRoll());
        System.out.println(studnetList);

    }
}
