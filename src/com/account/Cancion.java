
package com.account;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cancion", catalog = "javadb", schema = "")
public class Cancion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CancionId")
    private Integer CancionId;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "artista")
    private String artista;
    
    @Column(name = "genero")
    private String genero;
    
    @Column(name = "compositor")
    private String compositor;
    
    @Column(name = "album")
    private String album;
    
    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "PlaylistID")
    private Playlist playlist;
    
    public Cancion() {
    }
    
    public Cancion(Integer CancionId) {
        this.CancionId = CancionId;
    }

    public Cancion(Integer CancionId, String nombre, String artista, String genero, String compositor, String album, Date date) {
        this.CancionId = CancionId;
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.compositor = compositor;
        this.album = album;
        this.date = date;
    }

    public Integer getCancionId() {
        return CancionId;
    }

    public void setCancionId(Integer CancionId) {
        this.CancionId = CancionId;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
}
