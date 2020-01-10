import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.8C042E6E-3794-ECE3-4F30-DE22834DC2F1]
// </editor-fold> 
public class Courses {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F2605912-5BFA-E933-B7B5-36CC5D4D9737]
    // </editor-fold> 
    private String cNumber;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1E2E8C22-55AE-8ABC-3DB1-ECA47368C29C]
    // </editor-fold> 
    private String cName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BBAE0F3D-A42F-823E-74CC-F04F763953A6]
    // </editor-fold> 
    private Instructor instructor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C9E2995B-A8FF-0CCF-6CA6-D9CA002BA942]
    // </editor-fold> 
    private ArrayList<Student> students;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DD2C0E13-BD04-588D-C978-D1E0FC0CC433]
    // </editor-fold> 
    private Classroom classroom;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.11F868D9-B06D-6406-7751-EDF036227B46]
    // </editor-fold> 
    public Courses () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E941BA1B-34AC-4FB3-1E88-0E8E3B48B715]
    // </editor-fold> 
    public String getCName () {
        return cName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2CE4BF3B-102F-E9E3-742E-A4A9FDEC6025]
    // </editor-fold> 
    public void setCName (String val) {
        this.cName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E2C1B78B-B8FF-A5D0-6F3F-B16242045EAD]
    // </editor-fold> 
    public String getCNumber () {
        return cNumber;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.151A62B9-8C8F-CD3F-D7E2-12B4A8B96859]
    // </editor-fold> 
    public void setCNumber (String val) {
        this.cNumber = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A5C521B2-89BF-E1FD-7B61-0A6406546B86]
    // </editor-fold> 
    public Classroom getClassroom () {
        return classroom;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9DD42CE2-B9ED-D0C5-E182-C80FD6BC9EE2]
    // </editor-fold> 
    public void setClassroom (Classroom val) {
        this.classroom = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4F04A501-444F-6A66-2462-07E9D7B7A884]
    // </editor-fold> 
    public Instructor getInstructor () {
        return instructor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9DF0CB44-A102-724C-A221-BDB5E28A0C42]
    // </editor-fold> 
    public void setInstructor (Instructor val) {
        this.instructor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6E6373B9-F391-7324-C83B-929EF991B612]
    // </editor-fold> 
    public ArrayList<Student> getStudents () {
        return students;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.68F62AE3-2AC2-12F7-F948-A0D202A077E5]
    // </editor-fold> 
    public void setStudents (ArrayList<Student> val) {
        this.students = val;
    }
    
    @Override
    public String toString(){
    return getCName()+" "+getCNumber();
} 

}

