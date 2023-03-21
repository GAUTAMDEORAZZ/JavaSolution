package CompratorCompare;

public class Student implements Comparable<Student> {
    private String name;
    private Integer rollNo;
    private Integer marks;
    private Integer age;

    public Student(){

    }

    public Student(String name, Integer rollNo, Integer marks, Integer age) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        if(this.getName().compareTo(o.getName())>0){
            return 1;
        }
        if(this.getName().compareTo(o.getName())<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}
