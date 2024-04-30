package DSA_TOPICS.Arrays;

import java.util.*;
import java.util.stream.Collectors;


public class Student {

    private  int id;
    private  String name;

    public Student()
    {}



    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        final Student student=new Student(2,"KAnishka");
        //student.setId(1);
        //student.setName("Kanishka");

       // Student s1=new Student(1,"abc");
       // student=s1;

        System.out.println(student.toString());

        Student student1=new Student();
        student1.setId(1);
        student1.setName("Kanishka");

        Student student2=new Student();


        Set<Student> set=new HashSet<>();
        //Map<Student,Student>

        set.add(student);
        set.add(new Student(2,"Arrti"));
        set.add(student);



        System.out.println(set.size());

//        set.add(student);
//        set.add(student1);

     //   System.out.println(set);

//       for(Map.Entry<Student,Student> s: set.entrySet()){
//           System.out.println(s);
//       }




       /*
        list.add(new Student(1,"Kanishka"));
        list.add(new Student(2,"Aarti"));
        list.add(new Student(3,"Swati"));


       String listName=list.stream().map(i->i.getName()).collect(Collectors.joining(", "));
        System.out.println(listName);*/
    }
}
