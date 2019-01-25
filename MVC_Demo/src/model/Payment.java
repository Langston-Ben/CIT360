/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author benjaminlangston
 */
public class Payment implements Serializable {
    
    private String name;
    private double loanAmount;
    private double years;
    private double periods;
    private double interestRate;

    public Payment() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public double getPeriods() {
        return periods;
    }

    public void setPeriods(double periods) {
        this.periods = periods;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.loanAmount) ^ (Double.doubleToLongBits(this.loanAmount) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.years) ^ (Double.doubleToLongBits(this.years) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.periods) ^ (Double.doubleToLongBits(this.periods) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.interestRate) ^ (Double.doubleToLongBits(this.interestRate) >>> 32));
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
        final Payment other = (Payment) obj;
        if (Double.doubleToLongBits(this.loanAmount) != Double.doubleToLongBits(other.loanAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.years) != Double.doubleToLongBits(other.years)) {
            return false;
        }
        if (Double.doubleToLongBits(this.periods) != Double.doubleToLongBits(other.periods)) {
            return false;
        }
        if (Double.doubleToLongBits(this.interestRate) != Double.doubleToLongBits(other.interestRate)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Payment{" + "name=" + name + ", loanAmount=" + loanAmount + ", years=" + years + ", periods=" + periods + ", interestRate=" + interestRate + '}';
    }
    
    
    
    
    
    
}
