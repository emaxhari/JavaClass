import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.8D7E0492-1080-1CD7-DBFC-B7431CF45F07]
// </editor-fold> 
public class Classroom {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.62253558-AB94-6293-EA78-795C25CA29EA]
    // </editor-fold> 
    private String classNumber;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0FE6F6C4-B9C4-E806-D0FF-38E0614ADEAB]
    // </editor-fold> 
    private String cType;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.701751CC-6BDC-8EE2-732F-2F96565FE881]
    // </editor-fold> 
    private int capacity;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2B3499F9-DE60-B60A-4C50-3BA3C8B57BC7]
    // </editor-fold> 
    private ArrayList<Courses> courses = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2D905491-DDF6-AD18-0AA5-289CD792190C]
    // </editor-fold> 
    public Classroom () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DEE26056-905C-242E-E286-CC6F3866A552]
    // </editor-fold> 
    public String getCType () {
        return cType;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.564C7ABF-EF98-1495-4518-11639D201800]
    // </editor-fold> 
    public void setCType (String val) {
        this.cType = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.371F9CF4-8293-11FD-F710-C12000575164]
    // </editor-fold> 
    public int getCapacity () {
        return capacity;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.718D655D-4F8A-1F6B-D266-6122ED8A9930]
    // </editor-fold> 
    public void setCapacity (int val) {
        this.capacity = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B27F8DE2-D87D-8184-0CE2-056BCF936339]
    // </editor-fold> 
    public String getClassNumber () {
        return classNumber;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C25878FC-AD4F-8E9F-39BF-80F547F827D2]
    // </editor-fold> 
    public void setClassNumber (String val) {
        this.classNumber = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D4892667-1D41-C2AD-0545-CB1F1F4D98FF]
    // </editor-fold> 
    public ArrayList<Courses> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5D04E805-E279-824E-2BB2-742145671567]
    // </editor-fold> 
    public void setCourses (ArrayList<Courses> val) {
        this.courses = val;
    }

}

