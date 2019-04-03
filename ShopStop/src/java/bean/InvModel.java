/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author benjaminlangston
 */
public class InvModel implements Serializable {
    
    private int invId;
    private int categoryId;
    private String itemName;
    private String itemDesc;
    private String itemPrice;
    private String itemStock;
    boolean valid;

    public InvModel() {
    }
    
    

    public int getInvId() {
        return invId;
    }

    public InvModel(int invId, int categoryId, String itemName, 
            String itemDesc, String itemPrice, String itemStock) {
        this.invId = invId;
        this.categoryId = categoryId;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemPrice = itemPrice;
        this.itemStock = itemStock;
    }

    public void setInvId(int invId) {
        this.invId = invId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    

    
    
    
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    
    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemStock() {
        return itemStock;
    }

    public void setItemStock(String itemStock) {
        this.itemStock = itemStock;
    }

    @Override
    public int hashCode() {
        int hash = 5;
    
        hash = 97 * hash + Objects.hashCode(this.itemName);
        hash = 97 * hash + Objects.hashCode(this.itemDesc);
        hash = 97 * hash + Objects.hashCode(this.itemPrice);
        hash = 97 * hash + Objects.hashCode(this.itemStock);
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
        final InvModel other = (InvModel) obj;
        
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemDesc, other.itemDesc)) {
            return false;
        }
        if (!Objects.equals(this.itemPrice, other.itemPrice)) {
            return false;
        }
        if (!Objects.equals(this.itemStock, other.itemStock)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InvModel{" + "categoryId=" + categoryId + ", itemName=" + itemName + ", itemDesc=" + itemDesc + ", itemPrice=" + itemPrice + ", itemStock=" + itemStock + '}';
    }
    
    
    
}
