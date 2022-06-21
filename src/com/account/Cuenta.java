
package com.account;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity (name = "cuentas") 
@Table(name = "cuenta")
public class Cuenta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cuentaID")
    private Integer CuentaID;

    @Column(name = "userName")
    private String UserName;
    
    @Column(name = "password")
    private String Password;
    
    @Column(name = "typeAccount")
    private String TypeAccount;
    
    @OneToOne(mappedBy = "cuenta")
    private Usuario usuario;
    
    @OneToOne(mappedBy = "cuenta")
    private Playlist playlist;
   
//    @OneToMany(mappedBy = "cuenta" )
//    private List<Playlist> playlist;
    
    public Integer getCuentaID() {
        return CuentaID;
    }

    public void setCuentaID(Integer CuentaID) {
        this.CuentaID = CuentaID;
    }

    public String getUserName(){
        return UserName;
    }
    
    public void setUserName(String UserName){
        this.UserName = UserName;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public String getTypeAccount(){
        return TypeAccount;
    }
    
    public void setTypeAccount(String TypeAccount){
        this.TypeAccount = TypeAccount;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
    
}
