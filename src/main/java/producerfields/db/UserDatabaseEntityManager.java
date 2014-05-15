/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package producerfields.db;

import javax.ejb.Singleton;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ulidder
 */
@Singleton
public class UserDatabaseEntityManager {
    
    @Produces
    @UserDatabase
    @PersistenceContext(unitName = "producerfieldsPU")
    private static EntityManager em;
}
