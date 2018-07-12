package servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelos.Chofer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Liz
 */

@Service
public class ChoferService {
    @PersistenceContext
    private EntityManager em;
    @Transactional(rollbackFor={ServiceException.class})
    public void create(Chofer chofer) throws ServiceException
    {
        em.persist(chofer);
    }
    @Transactional(rollbackFor={ServiceException.class})
    public Chofer retrieve(int id) throws ServiceException
    {
        return em.find(Chofer.class,id);
    }
    
    @Transactional(rollbackFor={ServiceException.class})
    public void update(Chofer chofer) throws ServiceException
    {
        em.merge(chofer);
    }
    
    @Transactional(rollbackFor={ServiceException.class})
    public void remove(int id) throws ServiceException
    {
        em.remove(this.retrieve(id));
    }
    
    //.---------------
    @Transactional(rollbackFor={ServiceException.class})
    public List<Chofer> list() throws ServiceException
    {
       return em.createNamedQuery("Chofer.findAll").getResultList();
    }

    public void delete(Integer choferid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
