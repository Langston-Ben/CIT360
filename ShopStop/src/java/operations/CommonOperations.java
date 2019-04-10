/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import bean.CategoryModel;
import bean.InvModel;
import bean.OnlineStore;
import bean.Users;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import static javax.ws.rs.core.HttpHeaders.USER_AGENT;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import org.quickconnectionfamily.java.JSONInputStream;
import org.quickconnectionfamily.java.JSONOutputStream;

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
//    public List<CategoryModel> list() {
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//        Configuration configuration = new Configuration().configure();
//
//    configuration.addAnnotatedClass(bean.CategoryModel.class);
////        List<toView> toViews = null;
//        
//
////        List<CategoryModel> listCategory = session.createQuery("FROM bean.CategoryModel").list();
//        List<CategoryModel> listCategory = new ArrayList<>();
////      
//        String SQL_QUERY = "FROM CategoryModel categoryModel order by categoryName";
//        Query query = (Query) session.createQuery(SQL_QUERY);
//        
//          
//               
//        
//        for (Iterator it = query.iterate(); it.hasNext();) {
//            CategoryModel u = (CategoryModel) it.next();
//            
//            String name= u.getCategoryName();
//
//            int id = u.getCategoryId();
////            String name = u.getCategoryName();
//            
//            CategoryModel category = new CategoryModel(id, name);
//            
//            
////
////            u.setCategoryId(u.getCategoryId());
////            u.setCategoryName(u.getCategoryName());
//            
//            listCategory.add(category);
//        }
//        session.getTransaction().commit();
//        session.close();
//        return listCategory;
//    }
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

        String SQL_QUERY = "FROM CategoryModel categoryModel order by CategoryName";
        Query query = (Query) session.createQuery(SQL_QUERY);

        Iterator it = query.iterate();
//            CategoryModel u = new CategoryModel();

        while (it.hasNext()) {

            CategoryModel u = (CategoryModel) it.next();
            int id = u.getCategoryId();
            String name = u.getCategoryName();

            CategoryModel category = new CategoryModel(id, name);

            listCategory.put(category.getCategoryId(), category.getCategoryName());

//            u.setCategoryId(u.getCategoryId());
//            u.setCategoryName(u.getCategoryName());
//            
//            listCategory.add(category);
        }
        session.getTransaction().commit();
        session.close();
        return listCategory;
    }

//    public Map<Integer,String> enlistEverything(){
//    session = sessionFactory.openSession();
////    Transaction tx = null;
//    Map<Integer,String> toView = new LinkedHashMap<>();
//   
//        session.beginTransaction();
//        Map<CategoryModel, String> category = (HashMap<CategoryModel, String>)(HashMap<CategoryModel, String>)
//                session.createQuery("FROM bean.CategoryModel");
//        
//
//        for(CategoryModel d : category){
//            toView.put(d.getCategoryId(),d.getCategoryName());
//        }
//        session.getTransaction().commit();
//        session.close();
//    
//    return toView;
//    }
//    
//    public class InventoryReport {
    public List InventoryReport() {

        session = sessionFactory.openSession();
        session.beginTransaction();
        Configuration configuration = new Configuration().configure();

        configuration.addAnnotatedClass(bean.CategoryModel.class);

        List iReport = new ArrayList<>();

        String SQL_QUERY = "FROM InvModel invModel order by invName";
        Query query = (Query) session.createQuery(SQL_QUERY);

        Iterator it = query.iterate();

        while (it.hasNext()) {

            InvModel u = (InvModel) it.next();

            int iId = u.getInvId();
            int cId = u.getCategoryId();
            String iName = u.getItemName();
            String iDesc = u.getItemDesc();
            String iPrice = u.getItemPrice();
            String iStock = u.getItemStock();

            InvModel invReport = new InvModel(iId, cId, iName, iDesc, iPrice, iStock);

            iReport.add(invReport);
//            File reportFile = new File("invReport.json");
//
//            System.out.println(invReport + " has been written to a file.");
//
//            try {
//                FileOutputStream fileStream = new FileOutputStream(reportFile);
//                JSONOutputStream jsonOut = new JSONOutputStream(fileStream);
//                jsonOut.writeObject(invReport);
//                jsonOut.close();
//            } catch (Exception e) {
//                System.out.println("Error Writing File Out");
//            }

        }
        session.getTransaction().commit();
        session.close();
        return iReport;
    }

    public List UserReport() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Configuration configuration = new Configuration().configure();

        configuration.addAnnotatedClass(bean.CategoryModel.class);

        List uReport = new ArrayList<>();

        String SQL_QUERY = "from Users users order by LNAME";
        Query query = (Query) session.createQuery(SQL_QUERY);

        Iterator it = query.iterate();

        while (it.hasNext()) {

            Users u = (Users) it.next();

            int uId = u.getUID();
            String fName = u.getFNAME();
            String lName = u.getLNAME();
            String uName = u.getUNAME();
            String pWord = u.getUPASSWORD();

            Users UserReport = new Users(uId, fName, lName, uName, pWord);

            uReport.add(UserReport);

        }
        session.getTransaction().commit();
        session.close();
        return uReport;
    }

    public List saveUserReport() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Configuration configuration = new Configuration().configure();

        configuration.addAnnotatedClass(bean.CategoryModel.class);

        List suReport = new ArrayList<>();

        String SQL_QUERY = "from Users users order by LNAME";
        Query query = (Query) session.createQuery(SQL_QUERY);

        Iterator it = query.iterate();

        while (it.hasNext()) {

            Users u = (Users) it.next();

            int uId = u.getUID();
            String fName = u.getFNAME();
            String lName = u.getLNAME();
            String uName = u.getUNAME();
            String pWord = u.getUPASSWORD();

            Users saveUserReport = new Users(uId, fName, lName, uName, pWord);

            suReport.add(saveUserReport);

        }

        File reportFile = new File("suReport.json");
        try {
            FileOutputStream fileStream = new FileOutputStream(reportFile);
            JSONOutputStream jsonOut = new JSONOutputStream(fileStream);
            jsonOut.writeObject((Serializable) suReport);
            jsonOut.close();
        } catch (Exception e) {
            System.out.println("Error Writing File Out");
        }
        session.getTransaction().commit();
        session.close();
        return suReport;
    }

   public  Map<String,OnlineStore> OnlineReport() throws Exception {
        
        
        
        Thread str = new Thread();
        str.start();
        
        String url = ("https://api.myjson.com/bins/13wk6k");

        URL obj = new URL(url);
        
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        
        JSONInputStream inFromServer = new JSONInputStream(con.getInputStream());
        HashMap<String, Object> iResult = 
                (HashMap<String, Object>) inFromServer.readObject();
        Map<String, OnlineStore> online = new HashMap<>();
        
        
        OnlineStore getInfo = new OnlineStore();
          
            getInfo.setStoreItemName((String) iResult.get("storeItemName"));
            getInfo.setStoreItemDesc((String) iResult.get("storeItemDesc"));
            getInfo.setStoreItemPrice((String) iResult.get("storeItemPrice"));
            getInfo.setStoreItemStock((String) iResult.get("storeItemStock"));
            
            OnlineStore getInfo2 = new OnlineStore();
          
            getInfo2.setStoreItemName((String) iResult.get("storeItemName1"));
            getInfo2.setStoreItemDesc((String) iResult.get("storeItemDesc1"));
            getInfo2.setStoreItemPrice((String) iResult.get("storeItemPrice1"));
            getInfo2.setStoreItemStock((String) iResult.get("storeItemStock1"));
            
            OnlineStore getInfo3 = new OnlineStore();
          
            getInfo3.setStoreItemName((String) iResult.get("storeItemName2"));
            getInfo3.setStoreItemDesc((String) iResult.get("storeItemDesc2"));
            getInfo3.setStoreItemPrice((String) iResult.get("storeItemPrice2"));
            getInfo3.setStoreItemStock((String) iResult.get("storeItemStock2"));
            
            OnlineStore getInfo4 = new OnlineStore();
          
            getInfo4.setStoreItemName((String) iResult.get("storeItemName3"));
            getInfo4.setStoreItemDesc((String) iResult.get("storeItemDesc3"));
            getInfo4.setStoreItemPrice((String) iResult.get("storeItemPrice3"));
            getInfo4.setStoreItemStock((String) iResult.get("storeItemStock3"));
            
            OnlineStore getInfo5 = new OnlineStore();
          
            getInfo5.setStoreItemName((String) iResult.get("storeItemName4"));
            getInfo5.setStoreItemDesc((String) iResult.get("storeItemDesc4"));
            getInfo5.setStoreItemPrice((String) iResult.get("storeItemPrice4"));
            getInfo5.setStoreItemStock((String) iResult.get("storeItemStock4"));
            
            online.put("1", getInfo);
            online.put("2", getInfo2);
            online.put("3", getInfo3);
            online.put("3", getInfo4);
            online.put("4", getInfo5);
            
            
            
        
        
//       

//
//        
//        StringBuffer response;
//        String inputLine;
//        try (//        int responseCode = con.getResponseCode();
//                BufferedReader in = new BufferedReader
//                (new InputStreamReader(con.getInputStream()))) {
//            
//             JSONInputStream inFromServer = new JSONInputStream(in);
//            
//            response = new StringBuffer();
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            }
//        }
        
//       JSONObject iResult = new JSONObject("inputLine");
        
        
//        JSONObject(response.toString());
                  
       
        
//        String iReport = new ArrayList<>()
        
//        iReport.add(strURL);
//        String iResult = null;
//        
//        try {
//            FileInputStream employeeIn = new FileInputStream(strURL);
//            JSONInputStream jsonIn = new JSONInputStream(employeeIn);
//            HashMap jsonMap = (HashMap) jsonIn.readObject();
//            jsonIn.close();
//
//            OnlineStore getInfo = new OnlineStore();
//            long price = (long) jsonMap.get("storeItemPrice");
//            long stock = (long) jsonMap.get("storeItemStock");
//            getInfo.setStoreItemPrice((int) price);
//            getInfo.setStoreItemStock((int) stock);
//            getInfo.setStoreItemName((String) jsonMap.get("storeItemName"));
//            getInfo.setStoreItemDesc((String) jsonMap.get("storeItemDesc"));
//
//           iResult = JSONUtilities.stringify(getInfo);
//            
//        } catch (Exception e) {
//            System.out.println("Error Reading File Input");
//
//        }

        

//        File reportFile = new File("suReport.json");
//        try {
//            FileOutputStream fileStream = new FileOutputStream(reportFile);
//            JSONOutputStream jsonOut = new JSONOutputStream(fileStream);
//            jsonOut.writeObject((Serializable) suReport);
//            jsonOut.close();
//        } catch (Exception e) {
//            System.out.println("Error Writing File Out");
//        }
        
        return online;
    }

    public InvModel delItem(InvModel inv) {
        
        int r = inv.getInvId();
        
       
        
        session = sessionFactory.openSession();                     
        session.beginTransaction();
        String delItem = "Delete from InvModel invModel where invId = :invId";
        Query query =session.createQuery(delItem);
        query.setInteger("invId", r);
        query.executeUpdate();
        inv.setValid(true);
        session.getTransaction().commit();
        session.close();
        return inv;
    }

    public Users delUser(Users inv) {
        int r = inv.getUID();
        
       
        
        session = sessionFactory.openSession();                     
        session.beginTransaction();
        String delUser = "Delete from Users users where UID = :UID";
        Query query =session.createQuery(delUser);
        query.setInteger("UID", r);
        query.executeUpdate();
        inv.setValid(true);
        session.getTransaction().commit();
        session.close();
        return inv;
    }
    }
        
    


