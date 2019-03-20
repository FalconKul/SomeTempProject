// => Getter can return reference of Object Type, setter can set reference for Object Type.
// With primary type, getter, setter just get, set value
// With Object of primary type (INTERGER, BOOLEAN, ...) getter/setter just get/set value
public class testGerter {
    
    public static void main(String[] args) {
        Student a = new Student("");
        a.initA("Nguyễn Văn A");
        System.out.println("Name của Student a: " + a.getStudentA().getName());
        
        Student b = a.getStudentA();
        System.out.println("Name của Student b: " + b.getName());
       
        
        a.getStudentA().setName("c");
        System.out.println("\nName của Student a after change value of a: " + a.getStudentA().getName());
        System.out.println("Name của Student b after change value of a: " + b.getName());
        
        
        System.out.print("\na.m_name == b.m_name: ");
        if(a.getStudentA().getName().equals(b.getName())) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        
        System.out.print("a == b: ");
        if(a.getStudentA().equals(b)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
          
        
        Student c = new Student("c");
        System.out.print("\nc is a new student \nna.m_name == c.m_name: ");
        if(a.getStudentA().getName().equals(c.getName())) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        
        System.out.print("a == c: ");
        if(a.getStudentA().equals(c)) 
            System.out.println("true");
        else 
            System.out.println("false");
        

        
    }
    // =>Getter can return a reference of object
}
