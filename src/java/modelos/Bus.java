/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Liz
 */
@Entity
@Table(name = "bus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bus.findAll", query = "SELECT b FROM Bus b")
    , @NamedQuery(name = "Bus.findByBusid", query = "SELECT b FROM Bus b WHERE b.busid = :busid")
    , @NamedQuery(name = "Bus.findByModelo", query = "SELECT b FROM Bus b WHERE b.modelo = :modelo")
    , @NamedQuery(name = "Bus.findByEstado", query = "SELECT b FROM Bus b WHERE b.estado = :estado")})
public class Bus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "busid")
    private Integer busid;
    @Size(max = 15)
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "estado")
    private Boolean estado;
    @JoinColumn(name = "choferid", referencedColumnName = "choferid")
    @ManyToOne
    private Chofer choferid;
    @OneToMany(mappedBy = "busid")
    private List<Turno> turnoList;

    public Bus() {
    }

    public Bus(Integer busid) {
        this.busid = busid;
    }

    public Integer getBusid() {
        return busid;
    }

    public void setBusid(Integer busid) {
        this.busid = busid;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Chofer getChoferid() {
        return choferid;
    }

    public void setChoferid(Chofer choferid) {
        this.choferid = choferid;
    }

    @XmlTransient
    public List<Turno> getTurnoList() {
        return turnoList;
    }

    public void setTurnoList(List<Turno> turnoList) {
        this.turnoList = turnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (busid != null ? busid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bus)) {
            return false;
        }
        Bus other = (Bus) object;
        if ((this.busid == null && other.busid != null) || (this.busid != null && !this.busid.equals(other.busid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.Bus[ busid=" + busid + " ]";
    }
    
}
