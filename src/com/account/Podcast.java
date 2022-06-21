
package com.account;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity (name = "podcasts") 
@Table(name = "podcast")
public class Podcast implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "podcastID")
    private Integer PodcastID;

    @Column(name = "nombre")
    private String Nombre;
    
    @Column(name = "autor")
    private String Autor;
    
    @Column(name = "episodios")
    private Integer Episodios;
    
    @OneToOne(mappedBy = "podcast")
    private Cuenta cuenta;
    
    public Podcast(){
       
    }
    
    
    public Integer getPodcastID() {
        return PodcastID;
    }

    public void setPodcastID(Integer PodcastID) {
        this.PodcastID = PodcastID;
    }

    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getAutor(){
        return Autor;
    }
    
    public void setAutor(String Autor){
        this.Autor = Autor;
    }
    
    public Integer getEpisodios() {
        return Episodios;
    }

    public void setEpisodios(Integer Episodios) {
        this.Episodios = Episodios;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

}
