/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelos.Destino;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 
/**
 *
 * @author Liz
 */
@Service
public class DestinoService {
    @PersistenceContext
    private EntityManager em;

    @Transactional(rollbackFor={ServiceException.class})
    public void create(Destino destino)throws ServiceException{
    em.persist(destino);
    }
    
    
    @Transactional(rollbackFor={ServiceException.class})
    public Destino retrieve(int id)throws ServiceException{
    return em.find(Destino.class,id);
    }
    
    
    @Transactional(rollbackFor={ServiceException.class})
    public void update(Destino destino)throws ServiceException{
    em.merge(destino);
    }
    
    
    @Transactional(rollbackFor={ServiceException.class})
    public void delete(int id)throws ServiceException{
    em.remove(this.retrieve(id));
    }
    
    //_______________________________________________________
    
    @Transactional(rollbackFor={ServiceException.class})
    public List<Destino> list() throws ServiceException{
    return em.createNamedQuery("Destino.findAll").getResultList();
    }
}
