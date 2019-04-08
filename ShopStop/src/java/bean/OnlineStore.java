/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author benjaminlangston
 */
public class OnlineStore implements Serializable {
    private String storeItemName;
    private String storeItemDesc;
    private String storeItemPrice;
    private String storeItemStock;
//    public List<CD> getElements() {
//        
//        return this.onlineCartList;
//    }

    public OnlineStore() {
    }

    public OnlineStore(String storeItemName, String storeItemDesc, String storeItemPrice, String storeItemStock) {
        this.storeItemName = storeItemName;
        this.storeItemDesc = storeItemDesc;
        this.storeItemPrice = storeItemPrice;
        this.storeItemStock = storeItemStock;
    }

    public String getStoreItemName() {
        return storeItemName;
    }

    public void setStoreItemName(String storeItemName) {
        this.storeItemName = storeItemName;
    }

    public String getStoreItemDesc() {
        return storeItemDesc;
    }

    public void setStoreItemDesc(String storeItemDesc) {
        this.storeItemDesc = storeItemDesc;
    }

    public String getStoreItemPrice() {
        return storeItemPrice;
    }

    public void setStoreItemPrice(String storeItemPrice) {
        this.storeItemPrice = storeItemPrice;
    }

    public String getStoreItemStock() {
        return storeItemStock;
    }

    public void setStoreItemStock(String storeItemStock) {
        this.storeItemStock = storeItemStock;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.storeItemName);
        hash = 31 * hash + Objects.hashCode(this.storeItemDesc);
        hash = 31 * hash + Objects.hashCode(this.storeItemPrice);
        hash = 31 * hash + Objects.hashCode(this.storeItemStock);
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
        final OnlineStore other = (OnlineStore) obj;
        if (!Objects.equals(this.storeItemName, other.storeItemName)) {
            return false;
        }
        if (!Objects.equals(this.storeItemDesc, other.storeItemDesc)) {
            return false;
        }
        if (!Objects.equals(this.storeItemPrice, other.storeItemPrice)) {
            return false;
        }
        if (!Objects.equals(this.storeItemStock, other.storeItemStock)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "OnlineStore{" + "storeItemName=" + storeItemName + ", storeItemDesc=" + storeItemDesc + ", storeItemPrice=" + storeItemPrice + ", storeItemStock=" + storeItemStock + '}';
    }
    
    
    
    
}
