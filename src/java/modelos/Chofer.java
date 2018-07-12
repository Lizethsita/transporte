/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Liz
 */
@Entity
@Table(name = "chofer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chofer.findAll", query = "SELECT c FROM Chofer c")
    , @NamedQuery(name = "Chofer.findByChoferid", query = "SELECT c FROM Chofer c WHERE c.choferid = :choferid")
    , @NamedQuery(name = "Chofer.findByCedula", query = "SELECT c FROM Chofer c WHERE c.cedula = :cedula")
    , @NamedQuery(name = "Chofer.findByNombre", query = "SELECT c FROM Chofer c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Chofer.findByFechanacimiento", query = "SELECT c FROM Chofer c WHERE c.fechanacimiento = :fechanacimiento")
    , @NamedQuery(name = "Chofer.findByCelular", query = "SELECT c FROM Chofer c WHERE c.celular = :celular")})
public class Chofer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "choferid")
    private Integer choferid;
    @Size(max = 15)
    @Column(name = "cedula")
    private String cedula;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fechanacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Size(max = 15)
    @Column(name = "celular")
    private String celular;
    @OneToMany(mappedBy = "choferid")
    private List<Bus> busList;
    @OneToMany(mappedBy = "choferid")
    private List<Turno> turnoList;

    public Chofer() {
    }

    public Chofer(Integer choferid) {
        this.choferid = choferid;
    }

    public Integer getChoferid() {
        return choferid;
    }

    public void setChoferid(Integer choferid) {
        this.choferid = choferid;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @XmlTransient
    public List<Bus> getBusList() {
        return busList;
    }

    public void setBusList(List<Bus> busList) {
        this.busList = busList;
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
        hash += (choferid != null ? choferid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chofer)) {
            return false;
        }
        Chofer other = (Chofer) object;
        if ((this.choferid == null && other.choferid != null) || (this.choferid != null && !this.choferid.equals(other.choferid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.Chofer[ choferid=" + choferid + " ]";
    }
    
}
