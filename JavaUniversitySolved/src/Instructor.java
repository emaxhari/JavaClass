import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A96ACB40-3B37-96A9-B299-A65ECF1224BF]
// </editor-fold> 
public class Instructor {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.09E7000A-41FB-AD91-43EE-DBAB9A7CD49B]
    // </editor-fold> 
    private String id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9E0B15D5-2422-9287-454C-86E96D5EDEFE]
    // </editor-fold> 
    private String fName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E4B48553-A991-7A00-4CA3-5987090C5053]
    // </editor-fold> 
    private String lName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4DEC143A-71B4-555E-7D97-8B9B32B38C8C]
    // </editor-fold> 
    private String gender;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.59884BAA-044A-A8F1-F059-8D50A8D79962]
    // </editor-fold> 
    private ArrayList<Student> students = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FD101B69-D3C1-B25A-F057-0387402BB354]
    // </editor-fold> 
    private ArrayList<Courses> courses = new ArrayList();;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A126587A-E95A-80F2-E223-A561BB2BBE13]
    // </editor-fold> 
    private Address address;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.11FFE83B-1DC1-3599-FEB0-E12D46CF70DB]
    // </editor-fold> 
    public Instructor () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F1254351-88DC-1343-6616-7DBB5DED508E]
    // </editor-fold> 
    public Address getAddress () {
        return address;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8AF07637-3F52-30C9-F868-57700FE7E9D7]
    // </editor-fold> 
    public void setAddress (Address val) {
        this.address = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.27212CF8-457B-92F6-6D68-0179E4703E17]
    // </editor-fold> 
    public ArrayList<Courses> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A388A62D-2131-30A1-3F22-9838D5233525]
    // </editor-fold> 
    public void setCourses (ArrayList<Courses> val) {
        this.courses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E4254DEA-8585-C1C2-8C4F-5836A8080F96]
    // </editor-fold> 
    public String getFName () {
        return fName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.23AE871C-B4B3-C60F-1518-47D595566BF9]
    // </editor-fold> 
    public void setFName (String val) {
        this.fName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6971E76F-B771-8E36-3574-BC642E868A74]
    // </editor-fold> 
    public String getGender () {
        return gender;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CC82C3F0-79DE-BFDD-706B-EC77FFD0A157]
    // </editor-fold> 
    public void setGender (String val) {
        this.gender = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0B22948D-9836-2B6C-206C-D392675E7291]
    // </editor-fold> 
    public String getId () {
        return id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A92E25DA-BD02-EB5A-AD52-1FD0E5F52EEB]
    // </editor-fold> 
    public void setId (String val) {
        this.id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B2948754-ECF7-59E4-0D59-3456ECB233A0]
    // </editor-fold> 
    public String getLName () {
        return lName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0D73D6C7-B0C8-6D11-68E9-9B60B61B015E]
    // </editor-fold> 
    public void setLName (String val) {
        this.lName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.10CEFF35-3B74-6868-EC9B-164D9EDF64F0]
    // </editor-fold> 
    public ArrayList<Student> getStudents () {
        return students;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9A39CFC0-D798-4EA0-1A8B-44F258F38D85]
    // </editor-fold> 
    public void setStudents (ArrayList<Student> val) {
        this.students = val;
    }
   @Override
    public String toString(){
    return getFName()+" "+getLName()+" "+getId()+" "+getGender();
} 
}

