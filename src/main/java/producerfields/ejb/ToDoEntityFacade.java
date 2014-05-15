/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package producerfields.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import producerfields.db.UserDatabase;
import producerfields.entity.ToDoEntity;

/**
 *
 * @author ulidder
 */
@Stateless
public class ToDoEntityFacade extends AbstractFacade<ToDoEntity> {
    
    @Inject
    @UserDatabase
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ToDoEntityFacade() {
        super(ToDoEntity.class);
    }
    
}
