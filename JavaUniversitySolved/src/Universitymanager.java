
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


public class Universitymanager {
    public static void main(String[] args) {
        University univ = new University();
        univ.setName("CIT");
        
        Address ad = new Address();
        ad.setCity("Tirana");
        ad.setStName("Andon Zako Cajupi");
        ad.setStNumber("6");
        univ.setAddress(ad);// link university to address
        
        Student s1 = new Student();
        s1.setFName("Jim");
        s1.setLName("Smith");
        s1.setGender("Male");
        String d1 = "12/23/2000";
        s1.setDob(d1);
        
        univ.getStudents().add(s1);
        
        Student s2 = new Student();
        s2.setFName("Laura");
        s2.setLName("Maccartney");
        s2.setGender("Female");
        String d2 = "11/20/2000";
        s2.setDob(d2);
        univ.getStudents().add(s2);
        
         Student s3 = new Student();
        s3.setFName("Aredio");
        s3.setLName("Vani");
        s3.setGender("M");
        String d3 = "11/20/1999";
        s3.setDob(d3);
        univ.getStudents().add(s3);
        
        System.out.println(" Reports");
        
        System.out.println("List of student");
       Iterator it = univ.getStudents().iterator();
       
       Instructor in1 = new Instructor();
       in1.setFName("John");
       in1.setLName("Black");
       in1.setGender("Male");
       in1.setId("F15638290L6");
       univ.getInstructor().add(in1);
       
       Instructor in2 = new Instructor();
       in2.setFName("Enea");
       in2.setLName("Dhima");
       in2.setGender("M");
       in2.setId("F15634590L6");
       univ.getInstructor().add(in2);
       
       Instructor in3 = new Instructor();
       in3.setFName("Enio");
       in3.setLName("Vrushi");
       in3.setGender("M");
       in3.setId("F15424590L6");
       univ.getInstructor().add(in3);
       
       
       in1.getStudents().add(s2);
       in1.getStudents().add(s1);//linking student to instructor
       in2.getStudents().add(s3);
       // Moving students from in2 to in3
       in3.setStudents(in2.getStudents());
       
       //Assigning Eneas students to new instructor
       Iterator<Student> students = in2.getStudents().iterator();
       
       while(students.hasNext()) {
           students.next().setInstructor(in3);
       }
       
       //0 students advised by Enea
       in2.setStudents(new ArrayList());
       
       
       
       
       
       s1.setInstructor(in1);//linking instructor to student
       s2.setInstructor(in1);
       s3.setInstructor(in2);
       
       
       while(it.hasNext()){
       //obtain a student
        Student student = (Student)it.next();
        System.out.println("name "+student.getFName()+ " "+student.getLName());
       
       }
       
        System.out.println("List of instructors");
       Iterator it2 = univ.getInstructor().iterator();
       while (it2.hasNext()){
       Instructor ins = (Instructor)it2.next();
           System.out.println("name: "+ins.getFName()+" "+ins.getLName());
       }
       
        System.out.println("The instructor and their respective students");
        // printing instructors and their students
       Iterator it3 = univ.getInstructor().iterator();
       
       while(it3.hasNext()){
           Instructor instructor = (Instructor)it3.next();
           System.out.println("The instructor :"+instructor.getFName()+" "+instructor.getLName()
           +" advises "+instructor.getStudents().toString());
           
          /* Iterator it4 = instructor.getStudents().iterator();
           
           while(it4.hasNext()){
               Student stu = (Student)it4.next();
               System.out.println(stu.getFName()+" "+stu.getLName());
               
           }*/
           
       }  
          Courses c1 = new Courses();
          c1.setCName("Software Engineering");
          c1.setCNumber("SE102");
          univ.getCourses().add(c1);//adding a new course to the collection of university
          
          Courses c2 = new Courses();
          c2.setCName("Advanced java");
          c2.setCNumber("JA101");
          univ.getCourses().add(c2);//adding a new course to the collection of university
          
          
          in1.getCourses().add(c1);//assinging courses to an instructor
          in1.getCourses().add(c2);
          
          c1.setInstructor(in1);//linking course to instructor
          c2.setInstructor(in1);
          
          Courses c3 = new Courses();
          c3.setCName("Software Architecture");
          c3.setCNumber("SA102");
          univ.getCourses().add(c3);//adding a new course to the collection of university
          
          Courses c4 = new Courses();
          c4.setCName("Advanced Python");
          c4.setCNumber("PO101");
          univ.getCourses().add(c4);//adding a new course to the collection of university
       
          in2.getCourses().add(c3);//assinging courses to an instructor
          in2.getCourses().add(c4);
          
          c3.setInstructor(in2);//linking course to instructor
          c4.setInstructor(in2);
          
          //Assigning Enio to have Enea's courses
          in3.setCourses(in2.getCourses());
          //Assigning Enea's courses to Enio
          Iterator<Courses> courses = in2.getCourses().iterator();
          while(courses.hasNext()) {
              courses.next().setInstructor(in3);
          }
          //Remove Enea's courses
          in2.setCourses(new ArrayList());
          
          
          
        System.out.println("List of instructors and their respective courses");
        Iterator inst = univ.getInstructor().iterator();
        while (inst.hasNext()){
          Instructor instr = (Instructor)inst.next();
          System.out.println("Instructor "+instr.getFName()+ " "+instr.getLName()+" teaches:");
            System.out.println("courses "+instr.getCourses().toString());
        }
        
        //creating clssroom
        
        Classroom cr = new Classroom();
        cr.setClassNumber("Lab3");
        cr.setCapacity(30);
        cr.setCType("lab");
        
        univ.getClassrooms().add(cr);//adding classroom to the university
        cr.getCourses().add(c1);//assigning courses to the classroom
        cr.getCourses().add(c2);
        cr.getCourses().add(c3);
        cr.getCourses().add(c4);
        
        c1.setClassroom(cr);//linking course to classroom
        c2.setClassroom(cr);
        c3.setClassroom(cr);
        c4.setClassroom(cr);
        
        System.out.println("List of classrooms");
        Iterator cls = univ.getClassrooms().iterator();
        while (cls.hasNext()){
            Classroom clas =  (Classroom)cls.next();
            System.out.println("class number "+clas.getClassNumber()+ " type: "+clas.getCType());
            
            System.out.println("list of course tought in this classroom");
            Iterator cours = clas.getCourses().iterator();
            while (cours.hasNext()){
               Courses crs = (Courses)cours.next();
                System.out.println("course name:" +crs.getCName()+ " "+crs.getCNumber());
            }
        }
        
        // Finding whether we have a student with the name of Laura Maccartney
        Iterator<Student> listOfStudents = univ.getStudents().iterator();
        
        while(listOfStudents.hasNext()) {
            Student maybeLaura = listOfStudents.next();
            if(maybeLaura.getFName().equals("Laura")) {
                System.out.println("Yes we do have a student with the name Laura.");
                System.out.println("The name of Laura's professor is " + maybeLaura.getInstructor().getFName());
                break;
            }
        }
        
        
    }
    
    
    
}
