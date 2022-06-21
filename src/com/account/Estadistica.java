
package com.account;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Estadistica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estadisticaID")
    private Integer EstadisticaId;
    
    @Column(name = "visitas")
    private Integer visitas;
    
    @Column(name = "valoracion")
    private float valoracion;
    
    @OneToOne(mappedBy = "estadistica")
    private Playlist playlist;

    public Integer getEstadisticaId() {
        return EstadisticaId;
    }

    public void setEstadisticaId(Integer EstadisticaId) {
        this.EstadisticaId = EstadisticaId;
    }

    public Integer getVisitas(){
        return visitas;
    }
    
    public void setVisitas(Integer visitas){
        this.visitas = visitas;
    }
    
    public float getValoracion(){
        return valoracion;
    }
    
    public void setValoracion(float valoracion){
        this.valoracion = valoracion;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
    
    
}
