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
@Table(name = "destino")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Destino.findAll", query = "SELECT d FROM Destino d")
    , @NamedQuery(name = "Destino.findByDestinoid", query = "SELECT d FROM Destino d WHERE d.destinoid = :destinoid")
    , @NamedQuery(name = "Destino.findByLugar", query = "SELECT d FROM Destino d WHERE d.lugar = :lugar")})
public class Destino implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "destinoid")
    private Integer destinoid;
    @Size(max = 50)
    @Column(name = "lugar")
    private String lugar;
    @OneToMany(mappedBy = "destinoid")
    private List<Turno> turnoList;

    public Destino() {
    }

    public Destino(Integer destinoid) {
        this.destinoid = destinoid;
    }

    public Integer getDestinoid() {
        return destinoid;
    }

    public void setDestinoid(Integer destinoid) {
        this.destinoid = destinoid;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
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
        hash += (destinoid != null ? destinoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Destino)) {
            return false;
        }
        Destino other = (Destino) object;
        if ((this.destinoid == null && other.destinoid != null) || (this.destinoid != null && !this.destinoid.equals(other.destinoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.Destino[ destinoid=" + destinoid + " ]";
    }
    
}
