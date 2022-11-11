/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package Beans;

import Model.DoctorAppointment;
import java.util.Collection;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author kruti
 */
@Named
@ApplicationScoped
public class Doc {
    
    EntityManager em;
    Collection<DoctorAppointment> doctorAppointment;

    public Doc() {
        em = Persistence.createEntityManagerFactory("com.mycompany_DocAvailabilityApp_war_1.0-SNAPSHOTPU").createEntityManager();
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public Collection<DoctorAppointment> getDoctorAppointment() {
        return doctorAppointment;
    }

    public void setDoctorAppointment(Collection<DoctorAppointment> doctorAppointment) {
        this.doctorAppointment = doctorAppointment;
    }
    
    public Collection<DoctorAppointment> getDoctorAvailability(String Specialization){
        doctorAppointment=(Collection<DoctorAppointment>)em.createNamedQuery("DoctorAppointment.findAllBySpecialization").setParameter("specialization",Specialization ).getResultList();
        return doctorAppointment;
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
