package demohibernate;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class DemoHibernate
{
    public static void main(String[] args) 
    {
        Configuration cfg=new Configuration();
        cfg.configure("demohibernate/DemoHibernate.cfg.xml");
        System.out.println("Loaded Configuration .........");
        
        SessionFactory sf=cfg.buildSessionFactory();
        System.out.println("Loaded SessionFactory ..........");
        
        Session s=sf.openSession();
        System.out.println("Loaded Session ..........");
        
        EmpClass e=new EmpClass();
        e.setEno(101);
        e.setEname("Harsh");
        e.setEsal(50000);
        
        s.save(e);
        
        Transaction t=s.beginTransaction();
        t.commit();
        
        System.out.println("Loaded Transaction .........");
        
        s.close();
        sf.close();
    }
    
}
