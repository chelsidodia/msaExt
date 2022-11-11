/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import entity.Students;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DataModel 
{
    @PersistenceContext(unitName = "com.springcore_ProducerDB_war_1.0-SNAPSHOTPU")
    EntityManager em;
    
    public Collection<Students> getStudents()
    {
        return em.createNamedQuery("Students.findAll").getResultList();
    }
}
