package modelos;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelos.Chofer;
import modelos.Turno;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-09T11:01:12")
@StaticMetamodel(Bus.class)
public class Bus_ { 

    public static volatile SingularAttribute<Bus, Integer> busid;
    public static volatile SingularAttribute<Bus, Boolean> estado;
    public static volatile SingularAttribute<Bus, Chofer> choferid;
    public static volatile ListAttribute<Bus, Turno> turnoList;
    public static volatile SingularAttribute<Bus, String> modelo;

}