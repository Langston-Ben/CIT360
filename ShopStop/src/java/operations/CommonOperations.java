/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import bean.CategoryModel;
import bean.InvModel;
import bean.Users;
import controller.CategoryControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CommonOperations {

    Session session = null;
    SessionFactory sessionFactory = sessionFactory = new Configuration().configure().buildSessionFactory();

    public Users getLoginDetails(Users user) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        String UNAME = user.getUNAME();
        String UPASSWORD = user.getUPASSWORD();
//         String FNAME=user.getFNAME();
//         String LNAME=user.getLNAME();

        String SQL_QUERY = "FROM Users users WHERE users.UNAME = '" + UNAME + "' "
                + "AND users.UPASSWORD= '" + UPASSWORD + "'";
        Query query = (Query) session.createQuery(SQL_QUERY);
        for (Iterator it = query.iterate(); it.hasNext();) {
            Users u = (Users) it.next();

            user.setUID(u.getUID());
            user.setFNAME(u.getFNAME());
            user.setLNAME(u.getLNAME());
            user.setUNAME(u.getUNAME());
            user.setUPASSWORD(u.getUPASSWORD());
            user.setValid(true);
        }
        session.getTransaction().commit();
        session.close();
        return user;
    }

    public Users registerUser(Users user) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        user.setValid(true);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    public InvModel invMgt(InvModel inv) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(inv);
        inv.setValid(true);
        session.getTransaction().commit();
        session.close();
        return inv;
    }

//    public Map<String, String> list() {
//
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//        Map<String, String> toView = new LinkedHashMap<>();
//        Query query = session.createQuery("from categories");
//        CategoryModel category = new CategoryModel();
//        for (Iterator it = query.iterate(); it.hasNext();) {
//
//            CategoryModel u = (CategoryModel) it.next();
//
//            category.setCategoryId(u.getCategoryId());
//            category.setCategoryName(u.getCategoryName());
//
//        }
//        HashSet<CategoryModel> categories = (HashSet<CategoryModel>) session.createQuery("from categories").list();
//
//        for (CategoryModel c : categories) {
//            toView.put(c.getCategoryId() + "cat", c.getCategoryName());
//
//        }
//
//        session.getTransaction().commit();
//        session.close();
////        return (List<Category>) category;q
//
//        return toView;
//    }

    public CategoryModel categoryMgt(CategoryModel cat) {
        
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(cat);
        session.getTransaction().commit();
        session.close();
        return cat;
    }
        
        
        
    
//
//
    public List<CategoryModel> list() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Configuration configuration = new Configuration().configure();

    configuration.addAnnotatedClass(bean.CategoryModel.class);
//        List<toView> toViews = null;
        

//        List<CategoryModel> listCategory = session.createQuery("FROM bean.CategoryModel").list();
        List<CategoryModel> listCategory = new ArrayList<>();
//      
        String SQL_QUERY = "FROM bean.CategoryModel order by categoryName";
        Query query = (Query) session.createQuery(SQL_QUERY);
        
          
               
        
        for (Iterator it = query.iterate(); it.hasNext();) {
            CategoryModel u = (CategoryModel) it.next();
            
            String name= u.getCategoryName();

            int id = u.getCategoryId();
//            String name = u.getCategoryName();
            
            CategoryModel category = new CategoryModel(id, name);
            
            
//
//            u.setCategoryId(u.getCategoryId());
//            u.setCategoryName(u.getCategoryName());
            
            listCategory.add(category);
        }
        session.getTransaction().commit();
        session.close();
        return listCategory;
    }
    
//    public void showAllRecord(){
//        session=sessionFactory.openSession();
//        session.beginTransaction();
//        String SQL_QUERY="FROM Users";
//        Query query=session.createQuery(SQL_QUERY);
//        for(Iterator it=query.iterate();it.hasNext();){
//            Users u=(Users)it.next();
//            System.out.println("UID="+u.getUID());
//            System.out.println("UNAME="+u.getUNAME());
//            System.out.println("UPASSWORD="+u.getUPASSWORD());
//        }
//        session.getTransaction().commit();
//    }
//    
    public Map<Integer, String> MapList() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Configuration configuration = new Configuration().configure();

    configuration.addAnnotatedClass(bean.CategoryModel.class);
        
        Map<Integer, String> listCategory = new HashMap<>();
     
        String SQL_QUERY = "FROM bean.CategoryModel order by categoryName";
        Query query = (Query) session.createQuery(SQL_QUERY);
        
        Iterator it = query.iterate();
//            CategoryModel u = new CategoryModel();
            
            
            while (it.hasNext()) {
            
            CategoryModel u = (CategoryModel) it.next();
            int id = u.getCategoryId();
            String name = u.getCategoryName();
            
            CategoryModel category = new CategoryModel(id, name);
            
            

            listCategory.put(category.getCategoryId(), category.getCategoryName());
            
            u.setCategoryId(u.getCategoryId());
            u.setCategoryName(u.getCategoryName());
            
//            
//            listCategory.add(category);
        }
        session.getTransaction().commit();
        session.close();
        return listCategory;
    }
    
}
