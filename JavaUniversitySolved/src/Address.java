import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.48D3EF0E-8DEA-7AC0-31E3-13C435224766]
// </editor-fold> 
public class Address {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ED882361-C4B0-DA67-664E-F0E007CD0360]
    // </editor-fold> 
    private String stName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ED5349D5-3908-DE3D-4A85-D42F0ED3F108]
    // </editor-fold> 
    private String stNumber;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CF96A8B3-AB9B-A4FF-3C23-54F11DC5620E]
    // </editor-fold> 
    private String city;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7A587C64-50DA-D247-8CD4-5478D42F36B8]
    // </editor-fold> 
    private String country;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.38830859-082B-CF43-FF70-F79131D1670F]
    // </editor-fold> 
    private Student mStudent;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8198B08F-5EAC-B5A9-E3BA-90E18A95F180]
    // </editor-fold> 
    private Instructor mInstructor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DAC14257-FD12-4F55-6927-F1042D07088E]
    // </editor-fold> 
    public Address () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2E26736D-8533-AC4A-5E85-2D785EFDAAFA]
    // </editor-fold> 
    public String getCity () {
        return city;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ABEE5C90-74C4-D406-B957-52BD19A644D0]
    // </editor-fold> 
    public void setCity (String val) {
        this.city = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.76420224-BF72-3E6E-B3C6-BC014FF50094]
    // </editor-fold> 
    public String getCountry () {
        return country;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.12530420-A812-D552-17D7-CB7BB3B9E5C6]
    // </editor-fold> 
    public void setCountry (String val) {
        this.country = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0EFE0942-BC94-FC75-2D6F-30C93EF67E99]
    // </editor-fold> 
    public Instructor getInstructor () {
        return mInstructor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3F915089-E58E-A0E4-D1DC-955D405E068A]
    // </editor-fold> 
    public void setInstructor (Instructor val) {
        this.mInstructor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8CA5EEAE-A4DF-0C58-7885-10D334744917]
    // </editor-fold> 
    public Student getStudent () {
        return mStudent;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1F6A17EA-5407-9C8F-2CF3-4FB623B9500B]
    // </editor-fold> 
    public void setStudent (Student val) {
        this.mStudent = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AEEF4D67-84E0-A946-FF22-8EB504DC694E]
    // </editor-fold> 
    public String getStName () {
        return stName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AD51EC50-7ED8-C679-14E8-D222A19DAF6A]
    // </editor-fold> 
    public void setStName (String val) {
        this.stName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1D915D70-8F45-2C06-3E29-0306F0743371]
    // </editor-fold> 
    public String getStNumber () {
        return stNumber;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6517CE7E-2672-1F06-D2BC-55E6C91DACAE]
    // </editor-fold> 
    public void setStNumber (String val) {
        this.stNumber = val;
    }

}

