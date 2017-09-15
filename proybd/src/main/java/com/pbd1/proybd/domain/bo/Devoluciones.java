package com.pbd1.proybd.domain.bo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by carloscubur on 8/09/17.
 */

@Entity
@Table(name = "Devoluciones")
public class Devoluciones implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Devolucion")
    protected long id;

    @Column(name = "Descripcion")
    private String descripcion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
