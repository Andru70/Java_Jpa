
package com.account;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity (name = "playlists")
@Table(name = "playlist") 
public class Playlist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playlistID")
    private Integer PlaylistID;
    
    @Column(name = "nombre")
    private String Nombre;
   
    @OneToOne
    @JoinColumn(name = "CuentaId", referencedColumnName = "cuentaID")
    private Cuenta CuentaId;

    @OneToOne
    @JoinColumn(name = "EstadisticasId", referencedColumnName = "EstadisticaId")
    private Estadistica EstadisticasId;
    
    @OneToMany(mappedBy = "playlist")
    private List<Cancion> Canciones;
    
    public Integer getPlaylistID() {
        return PlaylistID;
    }

    public void setId(Integer PlaylistID) {
        this.PlaylistID = PlaylistID;
    }

    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    } 

    public Cuenta getCuentaId() {
        return CuentaId;
    }

    public void setCuentaId(Cuenta CuentaId) {
        this.CuentaId = CuentaId;
    }

    
 
    
}
