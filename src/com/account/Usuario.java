package com.account;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity (name = "usuarios") 
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usuarioId")
    private Integer UsuarioId;

    @OneToOne
    @JoinColumn(name = "CuentaId", referencedColumnName = "cuentaID")
    private Cuenta CuentaId;
    
    @Column(name = "fullname")
    private String Fullname;
    
    
    public Integer getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(Integer UsuarioId) {
        this.UsuarioId = UsuarioId;
    }

    public Cuenta getCuentaId() {
        return CuentaId;
    }

    public void setCuentaId(Cuenta CuentaId) {
        this.CuentaId = CuentaId;
    }
    
    public String getFullname(){
        return Fullname;
    }
    
    public void setFullname(String Fullname){
        this.Fullname = Fullname;
    }
    
}
