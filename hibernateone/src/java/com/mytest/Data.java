/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mytest;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
////import com.mytest.Members;
/**
 *
 * @author benjaminlangston
 */
@ManagedBean
@SessionScoped


public class Data {
    
    private Members m;
    private HibernateUtil helper;
    private Session session;
    private String name;
    
    public String getName() {
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        m = (Members) session.get(Members.class, 1);
        
        this.name = m.getName();
    return name;
    }
    
    public void addMember() {
        
//        Members r = new Members();
//       
//       r = Members.getName();
//     
//    
       
    
        m = new Members("Ben");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();
        session.close();
        

}
    
}
