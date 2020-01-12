import java.util.ArrayList; 
import java.util.Date;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.2953056E-83AE-D9CC-2504-760711B9A035]
// </editor-fold> 
public class Student {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.43A5839B-A9B0-B0FE-4431-832750E6EE49]
    // </editor-fold> 
    private String id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.368D7D6D-582E-DFCA-29D9-70D7776385AA]
    // </editor-fold> 
    private String fName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.94B90413-F8E0-0DE1-1247-0E70770D5846]
    // </editor-fold> 
    private String lName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3E04C607-AE87-87E9-5062-031970D437D3]
    // </editor-fold> 
    private String gender;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7000AE09-8B4B-41BA-C886-1C42DE07E0DA]
    // </editor-fold> 
    private String dob;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A6E42B4A-9E01-1AAB-C1A5-528DCEC92860]
    // </editor-fold> 
    private ArrayList<Address> addresses;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4E1E14F8-301A-B99F-DE8E-6BE195AADE36]
    // </editor-fold> 
    private Instructor instructor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8EF96175-C3D5-1C44-D36F-286FF8C7C740]
    // </editor-fold> 
    private ArrayList<Courses> courses;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B0776A12-429A-223D-D20E-D5840D0F38D3]
    // </editor-fold> 
    public Student () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FF90E0FC-1EE0-8148-6A20-ED531EF6A03C]
    // </editor-fold> 
    public ArrayList<Address> getAddresses () {
        return addresses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6C3D2959-C675-9B48-57EE-A76D2FAA3501]
    // </editor-fold> 
    public void setAddresses (ArrayList<Address> val) {
        this.addresses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.06A91A51-3AAC-2216-66E2-02485597B41B]
    // </editor-fold> 
    public ArrayList<Courses> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.47E18439-0D38-4D9B-D246-E0E80D7F583A]
    // </editor-fold> 
    public void setCourses (ArrayList<Courses> val) {
        this.courses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.281EA9A5-716A-21FE-B112-7157608562ED]
    // </editor-fold> 
    public String getDob () {
        return dob;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.51865548-F554-4458-B2A7-3CA33BEF685F]
    // </editor-fold> 
    public void setDob (String val) {
        this.dob = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0793DF79-1A49-4765-DCE6-A187F0B1B9AF]
    // </editor-fold> 
    public String getFName () {
        return fName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.96777D0E-4C4A-22A5-6FAF-A41C4BE573C1]
    // </editor-fold> 
    public void setFName (String val) {
        this.fName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.20B00FC9-FF0E-C21A-5C5A-470028E3DF13]
    // </editor-fold> 
    public String getGender () {
        return gender;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.451E1563-2C52-6964-B3E2-51E879DB0247]
    // </editor-fold> 
    public void setGender (String val) {
        this.gender = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C15E4636-215A-22AF-54EB-84B7D90963A8]
    // </editor-fold> 
    public String getId () {
        return id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3ECB40FE-BA2F-73E6-764A-A8548B52DECA]
    // </editor-fold> 
    public void setId (String val) {
        this.id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.46D7A62F-9B9A-AB5B-846C-983CB88CF71B]
    // </editor-fold> 
    public Instructor getInstructor () {
        return instructor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E246E75F-D6AB-C35F-96FE-AA2718F92F66]
    // </editor-fold> 
    public void setInstructor (Instructor val) {
        this.instructor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3E2048B1-59E3-BFAE-3E9D-F79A94265ED4]
    // </editor-fold> 
    public String getLName () {
        return lName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.91EBF3F4-FB83-8E7A-DD15-F5D741335C96]
    // </editor-fold> 
    public void setLName (String val) {
        this.lName = val;
    }
    @Override
    public String toString(){
    return getFName()+" "+getLName()+" "+getGender()+" "+getDob();
} 
}

