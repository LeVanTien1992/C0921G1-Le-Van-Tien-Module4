package vn.codegym.repository.ipml;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Music;
import vn.codegym.repository.ConnectionUtil;
import vn.codegym.repository.MusicRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
@Repository
public class MusicRepositoryIpml implements MusicRepository {

    @PersistenceContext
    private EntityManager manager;

    private List<Music> musicList;

    @Override
    public List<Music> findAll() {
        // cách 1: dùng hibernate thuần
//        Session session = null;
//        List<Music> musicList = null;
//        try {
//            session = ConnectionUtil.sessionFactory.openSession();
//            musicList = session.createQuery("select m from Music m", Music.class).getResultList();
//        }finally {
//            if(session != null){
//                session.close();
//            }
//        }
//        return musicList;
        // cách: 2 dùng TypeQuery

        TypedQuery<Music> query =
                ConnectionUtil.entityManager.createQuery("select m from Music m", Music.class);
        return query.getResultList();

    }

    @Override
    public void save(Music music) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            if(music.getId()== null){
                session.save(music);
            }else {
                Music music1 = findById(music.getId());
                music1.setSongName(music.getSongName());
                music1.setSinger(music.getSinger());
                music1.setMusicType(music.getMusicType());
                session.saveOrUpdate(music1);
            }

            transaction.commit();
        }catch (Exception e){
           if(transaction != null){
               transaction.rollback();
           }
        }finally {
            if(session != null){
                session.close();
            }
        }
    }

    @Override
    public Music findById(int id) {
        TypedQuery<Music> query = ConnectionUtil.entityManager.createQuery("select m from Music m where m.id= :id", Music.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void remove(int id) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.createNativeQuery("DELETE FROM Music WHERE id = ?").setParameter(1, id).executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
