package modelos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelos.Bus;
import modelos.Turno;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-09T11:01:12")
@StaticMetamodel(Chofer.class)
public class Chofer_ { 

    public static volatile SingularAttribute<Chofer, Date> fechanacimiento;
    public static volatile SingularAttribute<Chofer, String> cedula;
    public static volatile SingularAttribute<Chofer, Integer> choferid;
    public static volatile ListAttribute<Chofer, Turno> turnoList;
    public static volatile SingularAttribute<Chofer, String> celular;
    public static volatile ListAttribute<Chofer, Bus> busList;
    public static volatile SingularAttribute<Chofer, String> nombre;

}