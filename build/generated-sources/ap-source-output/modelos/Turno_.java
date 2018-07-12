package modelos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelos.Bus;
import modelos.Chofer;
import modelos.Destino;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-09T11:01:12")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, Bus> busid;
    public static volatile SingularAttribute<Turno, Date> fecha;
    public static volatile SingularAttribute<Turno, String> lugarorigen;
    public static volatile SingularAttribute<Turno, Chofer> choferid;
    public static volatile SingularAttribute<Turno, Integer> turnoid;
    public static volatile SingularAttribute<Turno, Destino> destinoid;

}