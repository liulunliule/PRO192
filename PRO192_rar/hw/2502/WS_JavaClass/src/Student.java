
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 840G3
 */
public class Student {
    private String mID;
    private String mFullName;
    private Date mDOB;
    private String mPhone;
    private String mAddress;

    public Student(String mID, String mFullName, Date mDOB, String mPhone, String mAddress) {
        this.mID = mID;
        this.mFullName = mFullName;
        this.mDOB = mDOB;
        this.mPhone = mPhone;
        this.mAddress = mAddress;
    }

    public Student() {
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmFullName() {
        return mFullName;
    }

    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }

    public Date getmDOB() {
        return mDOB;
    }

    public void setmDOB(Date mDOB) {
        this.mDOB = mDOB;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }
    
    
}
