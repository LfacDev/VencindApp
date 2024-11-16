package com.vecindapp.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "servicios")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servicio_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", length = 500)
    private String descripcion;

    @OneToMany(mappedBy = "servicio")
    private Set<Calificacion> calificacions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "servicio")
    private Set<Chat> chats = new LinkedHashSet<>();

    @OneToMany(mappedBy = "servicio")
    private Set<Favorito> favoritos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "servicio")
    private Set<Reserva> reservas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "servicio")
    private Set<UsuariosServicio> usuariosServicios = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Calificacion> getCalificacions() {
        return calificacions;
    }

    public void setCalificacions(Set<Calificacion> calificacions) {
        this.calificacions = calificacions;
    }

    public Set<Chat> getChats() {
        return chats;
    }

    public void setChats(Set<Chat> chats) {
        this.chats = chats;
    }

    public Set<Favorito> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Set<Favorito> favoritos) {
        this.favoritos = favoritos;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Set<UsuariosServicio> getUsuariosServicios() {
        return usuariosServicios;
    }

    public void setUsuariosServicios(Set<UsuariosServicio> usuariosServicios) {
        this.usuariosServicios = usuariosServicios;
    }

}