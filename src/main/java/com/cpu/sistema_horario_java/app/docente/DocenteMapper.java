package com.cpu.sistema_horario_java.app.docente;

import java.util.stream.Collectors;

import com.cpu.sistema_horario_java.app.asignatura.Asignatura;
import com.cpu.sistema_horario_java.app.asignatura.AsignaturaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DocenteMapper {

    @Autowired
    AsignaturaRepository ar;

    public Docente toModel(DocenteDTO dto) {
        Docente model = new Docente();

        model.setId(dto.getId());
        model.setNombre(dto.getNombre());
        model.setApellido(dto.getApellido());
        model.setCedula(dto.getCedula());
        model.setTelefono(dto.getTelefono());
        model.setCorreo(dto.getCorreo());
        model.setAsignaturas(ar.findAllById(dto.getAsignaturas()));
        model.setEstatus(dto.getEstatus());

        return model;
    }

    public Docente toModel(DocenteDTO dto, Docente model) {

        model.setNombre(dto.getNombre());
        model.setApellido(dto.getApellido());
        model.setCedula(dto.getCedula());
        model.setTelefono(dto.getTelefono());
        model.setCorreo(dto.getCorreo());
        model.setAsignaturas(ar.findAllById(dto.getAsignaturas()));
        model.setEstatus(dto.getEstatus());

        return model;
    }

    public DocenteDTO toDTO(Docente model) {
        DocenteDTO dto = new DocenteDTO();

        dto.setId(model.getId());
        dto.setNombre(model.getNombre());
        dto.setApellido(model.getApellido());
        dto.setCedula(model.getCedula());
        dto.setTelefono(model.getTelefono());
        dto.setCorreo(model.getCorreo());
        dto.setAsignaturas(model.getAsignaturas().stream().map(Asignatura::getId).collect(Collectors.toList()));
        dto.setEstatus(model.getEstatus());

        return dto;
    }

    public DocenteDTO toDTO(Docente model, DocenteDTO dto) {

        dto.setId(model.getId());
        dto.setNombre(model.getNombre());
        dto.setApellido(model.getApellido());
        dto.setCedula(model.getCedula());
        dto.setTelefono(model.getTelefono());
        dto.setCorreo(model.getCorreo());
        dto.setAsignaturas(model.getAsignaturas().stream().map(Asignatura::getId).collect(Collectors.toList()));
        dto.setEstatus(model.getEstatus());

        return dto;
    }
}