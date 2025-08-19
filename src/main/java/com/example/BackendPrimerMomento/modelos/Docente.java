package com.example.BackendPrimerMomento.modelos;

import com.example.BackendPrimerMomento.ayudas.Especialidades;

public class Docente {
    private Integer id;
    private Especialidades especialidad;

    public Docente() {
    }

    public Docente(Integer id, Especialidades especialidad) {
        this.id = id;
        this.especialidad = especialidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Especialidades getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidades especialidad) {
        this.especialidad = especialidad;
    }
}
