/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author kruti
 */
@Entity
@Table(name = "doctor_appointment")
@NamedQueries({
    @NamedQuery(name = "DoctorAppointment.findAllBySpecialization", query = "SELECT d FROM DoctorAppointment d WHERE d.specialization=:specialization"),
    @NamedQuery(name = "DoctorAppointment.findByDocId", query = "SELECT d FROM DoctorAppointment d WHERE d.docId = :docId"),
    @NamedQuery(name = "DoctorAppointment.findByDocName", query = "SELECT d FROM DoctorAppointment d WHERE d.docName = :docName"),
    @NamedQuery(name = "DoctorAppointment.findBySpecialization", query = "SELECT d FROM DoctorAppointment d WHERE d.specialization = :specialization"),
    @NamedQuery(name = "DoctorAppointment.findByFromTime", query = "SELECT d FROM DoctorAppointment d WHERE d.fromTime = :fromTime"),
    @NamedQuery(name = "DoctorAppointment.findByToTime", query = "SELECT d FROM DoctorAppointment d WHERE d.toTime = :toTime")})
public class DoctorAppointment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "doc_id")
    private Integer docId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "doc_name")
    private String docName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "specialization")
    private String specialization;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Column(name = "from_time")
    @Temporal(TemporalType.TIME)
    private Date fromTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "to_time")
    @Temporal(TemporalType.TIME)
    private Date toTime;

    public DoctorAppointment() {
    }

    public DoctorAppointment(Integer docId) {
        this.docId = docId;
    }

    public DoctorAppointment(Integer docId, String docName, String specialization, String address, Date fromTime, Date toTime) {
        this.docId = docId;
        this.docName = docName;
        this.specialization = specialization;
        this.address = address;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getFromTime() {
        return fromTime;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public Date getToTime() {
        return toTime;
    }

    public void setToTime(Date toTime) {
        this.toTime = toTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (docId != null ? docId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DoctorAppointment)) {
            return false;
        }
        DoctorAppointment other = (DoctorAppointment) object;
        if ((this.docId == null && other.docId != null) || (this.docId != null && !this.docId.equals(other.docId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.docavailabilityapp.config.DoctorAppointment[ docId=" + docId + " ]";
    }
    
}
