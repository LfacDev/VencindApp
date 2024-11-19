package com.vecindapp.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String name;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "fecha_registro")
    private Instant fechaRegistro;

    @ColumnDefault("'activo'")
    @Lob
    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "user")
    private Set<Agenda> agenda = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Calificacion> calificacions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Chat> chats = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Documento> documentos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cliente")
    private Set<Favorito> favoritoC = new LinkedHashSet<>();

    @OneToMany(mappedBy = "trabajador")
    private Set<Favorito> favoritoT = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Mensaje> mensajes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Notificacion> notificaciones = new LinkedHashSet<>();

    @OneToMany(mappedBy = "usuario")
    private Set<Reporte> reportes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Reserva> reservas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Respuesta> respuestas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<UsuariosRole> usuariosRoles = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<UsuariosServicio> usuariosServicios = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Instant getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Instant fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Set<Agenda> getAgenda() {
        return agenda;
    }

    public void setAgenda(Set<Agenda> agenda) {
        this.agenda = agenda;
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

    public Set<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Set<Documento> documentos) {
        this.documentos = documentos;
    }

    public Set<Favorito> getFavoritoC() {
        return favoritoC;
    }

    public void setFavoritoC(Set<Favorito> favoritoC) {
        this.favoritoC = favoritoC;
    }

    public Set<Favorito> getFavoritoT() {
        return favoritoT;
    }

    public void setFavoritoT(Set<Favorito> favoritoT) {
        this.favoritoT = favoritoT;
    }

    public Set<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(Set<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Set<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(Set<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public Set<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(Set<Reporte> reportes) {
        this.reportes = reportes;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Set<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public Set<UsuariosRole> getUsuariosRoles() {
        return usuariosRoles;
    }

    public void setUsuariosRoles(Set<UsuariosRole> usuariosRoles) {
        this.usuariosRoles = usuariosRoles;
    }

    public Set<UsuariosServicio> getUsuariosServicios() {
        return usuariosServicios;
    }

    public void setUsuariosServicios(Set<UsuariosServicio> usuariosServicios) {
        this.usuariosServicios = usuariosServicios;
    }

}