package isp.lab6.exercise1;
import java.util.HashMap;

public class Student {

    private String name;
    private String id;
    private HashMap<String, Integer> grades = new HashMap<>();
    public Student(String name, String id, HashMap<String, Integer> grades)
    {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public HashMap<String, Integer> getGrades() {return grades;}
    public void setGrades(HashMap<String, Integer> grades) {this.grades = grades;}


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", grades=" + grades +
                '}';
    }
}
