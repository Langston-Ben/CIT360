/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Objects;

/**
 *
 * @author benjaminlangston
 */
public class Users {
   private int UID;
   private String FNAME;
   private String LNAME;
   private String UNAME; 
   private String UPASSWORD;
   boolean valid;

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getFNAME() {
        return FNAME;
    }

    public void setFNAME(String FNAME) {
        this.FNAME = FNAME;
    }

    public String getLNAME() {
        return LNAME;
    }

    public void setLNAME(String LNAME) {
        this.LNAME = LNAME;
    }
    
    
    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getUNAME() {
        return UNAME;
    }

    public void setUNAME(String UNAME) {
        this.UNAME = UNAME;
    }

    public String getUPASSWORD() {
        return UPASSWORD;
    }

    public void setUPASSWORD(String UPASSWORD) {
        this.UPASSWORD = UPASSWORD;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.UID;
        hash = 73 * hash + Objects.hashCode(this.FNAME);
        hash = 73 * hash + Objects.hashCode(this.LNAME);
        hash = 73 * hash + Objects.hashCode(this.UNAME);
        hash = 73 * hash + Objects.hashCode(this.UPASSWORD);
        hash = 73 * hash + (this.valid ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Users other = (Users) obj;
        if (this.UID != other.UID) {
            return false;
        }
        if (this.valid != other.valid) {
            return false;
        }
        if (!Objects.equals(this.FNAME, other.FNAME)) {
            return false;
        }
        if (!Objects.equals(this.LNAME, other.LNAME)) {
            return false;
        }
        if (!Objects.equals(this.UNAME, other.UNAME)) {
            return false;
        }
        if (!Objects.equals(this.UPASSWORD, other.UPASSWORD)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Users{" + "UID=" + UID + ", FNAME=" + FNAME + ", LNAME=" + LNAME + ", UNAME=" + UNAME + ", UPASSWORD=" + UPASSWORD + ", valid=" + valid + '}';
    }
    
}

