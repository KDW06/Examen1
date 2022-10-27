
package com.example.ITicket.entity;
import com.example.ITicket.entity.Artista;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="concierto")
public class Concierto implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String costo;
    private String fecha;
    private String cant;
    private String lugar;
    
    @ManyToOne
    @JoinColumn(name="artistas_id")
    private Artista artista;

    public Concierto(String costo, String fecha, String cant, String lugar) {
        this.costo = costo;
        this.fecha = fecha;
        this.cant = cant;
        this.lugar = lugar;
    }

    public Concierto() {
    }
    
    
    public int getId() {
        return id;
    }

    public String getCosto() {
        return costo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCant() {
        return cant;
    }

    public String getLugar() {
        return lugar;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    
}
