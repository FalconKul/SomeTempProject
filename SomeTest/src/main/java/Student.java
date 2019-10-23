package main.java;

public class Student {
    private String m_name;
    private Student a;
    
    public Student(String name) {
        m_name = name;
    }
    
    public void initA(String name) {
        a = new Student(name);
    }
    
    public void setName(String name) {
        m_name = name;
        
    }
    
    public String getName() {
        return m_name;
    }
    
    public Student getStudentA() {
        return a;
    }
}
