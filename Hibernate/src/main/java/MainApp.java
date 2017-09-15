import jrout.tutorial.hibernate.domain.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MainApp {
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    public static SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("/mysql.hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }

    public static void main(String[] args) {
        sessionFactory = createSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

//        Person person = new Person();
//        person.setPersonID(31);
//        person.setFirstName("John");
//        person.setLastName("Stanley");
//        person.setCity("Nashua");
//        person.setAddresss("Goka Land");
//
//
//        session.save(person);
//        session.getTransaction().commit();

        Person obj = (Person)session.get(Person.class,30);
        System.out.println(obj);
        //System.out.println("Saved to DB");
    }
}
