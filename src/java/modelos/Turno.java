/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Liz
 */
@Entity
@Table(name = "turno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turno.findAll", query = "SELECT t FROM Turno t")
    , @NamedQuery(name = "Turno.findByTurnoid", query = "SELECT t FROM Turno t WHERE t.turnoid = :turnoid")
    , @NamedQuery(name = "Turno.findByLugarorigen", query = "SELECT t FROM Turno t WHERE t.lugarorigen = :lugarorigen")
    , @NamedQuery(name = "Turno.findByFecha", query = "SELECT t FROM Turno t WHERE t.fecha = :fecha")})
public class Turno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "turnoid")
    private Integer turnoid;
    @Size(max = 50)
    @Column(name = "lugarorigen")
    private String lugarorigen;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "busid", referencedColumnName = "busid")
    @ManyToOne
    private Bus busid;
    @JoinColumn(name = "choferid", referencedColumnName = "choferid")
    @ManyToOne
    private Chofer choferid;
    @JoinColumn(name = "destinoid", referencedColumnName = "destinoid")
    @ManyToOne
    private Destino destinoid;

    public Turno() {
    }

    public Turno(Integer turnoid) {
        this.turnoid = turnoid;
    }

    public Integer getTurnoid() {
        return turnoid;
    }

    public void setTurnoid(Integer turnoid) {
        this.turnoid = turnoid;
    }

    public String getLugarorigen() {
        return lugarorigen;
    }

    public void setLugarorigen(String lugarorigen) {
        this.lugarorigen = lugarorigen;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Bus getBusid() {
        return busid;
    }

    public void setBusid(Bus busid) {
        this.busid = busid;
    }

    public Chofer getChoferid() {
        return choferid;
    }

    public void setChoferid(Chofer choferid) {
        this.choferid = choferid;
    }

    public Destino getDestinoid() {
        return destinoid;
    }

    public void setDestinoid(Destino destinoid) {
        this.destinoid = destinoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (turnoid != null ? turnoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turno)) {
            return false;
        }
        Turno other = (Turno) object;
        if ((this.turnoid == null && other.turnoid != null) || (this.turnoid != null && !this.turnoid.equals(other.turnoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.Turno[ turnoid=" + turnoid + " ]";
    }
    
}
