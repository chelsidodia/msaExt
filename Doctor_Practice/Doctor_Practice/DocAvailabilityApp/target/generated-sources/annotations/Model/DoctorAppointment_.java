package Model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-09-16T13:01:02")
@StaticMetamodel(DoctorAppointment.class)
public class DoctorAppointment_ { 

    public static volatile SingularAttribute<DoctorAppointment, String> docName;
    public static volatile SingularAttribute<DoctorAppointment, String> address;
    public static volatile SingularAttribute<DoctorAppointment, Integer> docId;
    public static volatile SingularAttribute<DoctorAppointment, Date> fromTime;
    public static volatile SingularAttribute<DoctorAppointment, String> specialization;
    public static volatile SingularAttribute<DoctorAppointment, Date> toTime;

}