import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.589D59CF-0999-8CE3-1721-D1C1C20638D6]
// </editor-fold> 
public class University {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B4ADF75D-3A48-EA85-A953-A51355AA6D07]
    // </editor-fold> 
    private ArrayList<Courses> courses = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.481845F7-99B7-6859-2FFF-EB8E5C1925AE]
    // </editor-fold> 
    private String name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F4106577-8209-FC65-91C0-19F1EA57F54F]
    // </editor-fold> 
    private Address mAddress;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.02A35B45-1675-0C1C-C53A-6793995C262B]
    // </editor-fold> 
    private ArrayList<Student> students = new ArrayList();;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A80E3A3F-AC81-54FB-9445-02229C2AD14E]
    // </editor-fold> 
    private ArrayList<Instructor> instructor = new ArrayList();;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0EABF77C-D67F-7D38-D7A1-F96470337757]
    // </editor-fold> 
    private ArrayList<Classroom> classrooms = new ArrayList();;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C8E21A8F-9027-8C53-0D94-A11A51806DCE]
    // </editor-fold> 
    public University () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F5472A91-A2CE-E5A4-9310-5E9898A3BC89]
    // </editor-fold> 
    public ArrayList<Classroom> getClassrooms () {
        return classrooms;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CB7F9945-FEB6-604C-E0C3-DE1420FF0BF6]
    // </editor-fold> 
    public void setClassrooms (ArrayList<Classroom> val) {
        this.classrooms = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C691EBE4-61FD-9E86-B3C5-45E4DDB6BAD3]
    // </editor-fold> 
    public ArrayList<Instructor> getInstructor () {
        return instructor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.04FFD0D9-3989-9D8D-57CE-ECB823520008]
    // </editor-fold> 
    public void setInstructor (ArrayList<Instructor> val) {
        this.instructor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ABC2C4DF-3295-E652-A3BA-91764E8EB84E]
    // </editor-fold> 
    public Address getAddress () {
        return mAddress;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7289AB60-FED6-1C3C-CB89-A9DEBDABCFAF]
    // </editor-fold> 
    public void setAddress (Address val) {
        this.mAddress = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2634A254-954A-67B7-A609-0C2D1FE11731]
    // </editor-fold> 
    public String getName () {
        return name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D5CB77A0-71DE-CC20-C89B-CC3B8CB841EC]
    // </editor-fold> 
    public void setName (String val) {
        this.name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.624E37A9-C709-19A3-01BA-6282FBDC22FD]
    // </editor-fold> 
    public ArrayList<Student> getStudents () {
        return students;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.75E6AB3C-49AF-FF11-9122-7E5D9DDE53A5]
    // </editor-fold> 
    public void setStudents (ArrayList<Student> val) {
        this.students = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C8DC587A-9F33-ACD9-4EC6-D4889F5A608E]
    // </editor-fold> 
    public ArrayList<Courses> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.95BDE083-EBCB-121D-A42F-1086886F20A4]
    // </editor-fold> 
    public void setCourses (ArrayList<Courses> val) {
        this.courses = val;
    }

}

