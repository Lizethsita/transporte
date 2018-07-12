/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelos.Turno;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 
/**
 *
 * @author Liz
 */

@Service
public class TurnoService {
    @PersistenceContext
    private EntityManager em;

    @Transactional(rollbackFor={ServiceException.class})
    public void create(Turno turno)throws ServiceException{
    em.persist(turno);
    }
    
    
    @Transactional(rollbackFor={ServiceException.class})
    public Turno retrieve(int id)throws ServiceException{
    return em.find(Turno.class,id);
    }
    
    
    @Transactional(rollbackFor={ServiceException.class})
    public void update(Turno turno)throws ServiceException{
    em.merge(turno);
    }
    
    
    @Transactional(rollbackFor={ServiceException.class})
    public void delete(int id)throws ServiceException{
    em.remove(this.retrieve(id));
    }
    
    //_______________________________________________________
    
    @Transactional(rollbackFor={ServiceException.class})
    public List<Turno> list() throws ServiceException{
    return em.createNamedQuery("Turno.findAll").getResultList();
    }
}
