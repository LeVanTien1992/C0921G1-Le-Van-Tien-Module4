package vn.codegym.repository.ipml;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Customer;
import vn.codegym.repository.ConnectionUtil;
import vn.codegym.repository.CustomerRepository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class CustomerRepositoryIpml implements CustomerRepository {
    List<Customer> customerList;
    @Override
    public List<Customer> findAll() {
//       Session session = null;
//       List<Customer> customerList = null;
//       try {
//           session = ConnectionUtil.sessionFactory.openSession();
//           customerList = session.createQuery("FROM Customer ").getResultList();
//       }finally {
//           if(session != null){
//               session.close();
//           }
//       }
//       return customerList;

        TypedQuery<Customer> query = ConnectionUtil.entityManager.createQuery("select c from Customer c",Customer.class);
        return query.getResultList();
    }


    @Override
    public void save(Customer customer) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            Customer customer1 = findById(customer.getId());
            customer1.setFirstName(customer.getFirstName());
            customer1.setLastName(customer.getLastName());
            session.saveOrUpdate(customer);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            if(session != null){
                session.close();
            }
        }
    }

    @Override
    public Customer findById(long id) {

        TypedQuery<Customer> query = ConnectionUtil.entityManager.createQuery("select c from Customer c where c.id = :id",Customer.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void remove(long id) {
        Transaction transaction = null;
        Session session = null;

        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.createNativeQuery("delete from Custtomer where id = ?").setParameter(1, id).executeUpdate();
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            if(session != null){
                session.close();
            }
        }
    }
}
