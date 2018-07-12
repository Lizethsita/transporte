package modelos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelos.Turno;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-09T11:01:12")
@StaticMetamodel(Destino.class)
public class Destino_ { 

    public static volatile SingularAttribute<Destino, String> lugar;
    public static volatile ListAttribute<Destino, Turno> turnoList;
    public static volatile SingularAttribute<Destino, Integer> destinoid;

}