/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelos.Bus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class BusService {
     @PersistenceContext
    private EntityManager em;

    @Transactional(rollbackFor={ServiceException.class})
    public void create(Bus bus)throws ServiceException{
    em.persist(bus);
    }
    
    
    @Transactional(rollbackFor={ServiceException.class})
    public Bus retrieve(int id)throws ServiceException{
    return em.find(Bus.class,id);
    }
    
    
    @Transactional(rollbackFor={ServiceException.class})
    public void update(Bus bus)throws ServiceException{
    em.merge(bus);
    }
    
    
    @Transactional(rollbackFor={ServiceException.class})
    public void delete(int id)throws ServiceException{
    em.remove(this.retrieve(id));
    }
    
    //_______________________________________________________
    
    @Transactional(rollbackFor={ServiceException.class})
    public List<Bus> list() throws ServiceException{
    return em.createNamedQuery("Bus.findAll").getResultList();
    }
}
