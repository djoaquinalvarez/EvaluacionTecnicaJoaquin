package com.pil.moby.evaluacion_tecnica.modelo.pojo;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Candidato implements Comparable<Candidato>{

    private Long id;
    private String nombre;
    private String apellido;
    private Integer aniosExperiencia;
    private Double pretencionSalarial;
    private List<Tecnologia> tecnologias;


    public Candidato(Long id, String nombre, String apellido, Integer aniosExperiencia, Double pretencionSalarial, List<Tecnologia> tecnologias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.aniosExperiencia = aniosExperiencia;
        this.pretencionSalarial = pretencionSalarial;
        this.tecnologias = tecnologias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Double getPretencionSalarial() {
        return pretencionSalarial;
    }

    public void setPretencionSalarial(Double pretencionSalarial) {
        this.pretencionSalarial = pretencionSalarial;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(id, candidato.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "--------------Candidato: " + nombre + " " + apellido + "--------------" + '\n' +
                "Anios de Experiencia: " + aniosExperiencia + " anios" + '\n' +
                "Pretencion Salarial: $" + pretencionSalarial;
    }

    @Override
    public int compareTo(Candidato o) {
        return this.id.compareTo(o.id);
    }

    public List<Tecnologia> ordenarTecnologias() {
        Stream<Tecnologia> streamTecnologias = tecnologias.stream()
                .sorted(tecnologiaComparatorPorNombre());
        return streamTecnologias.toList();
    }

    public Comparator<Tecnologia> tecnologiaComparatorPorNombre() {
        return new Comparator<Tecnologia>() {
            @Override
            public int compare(Tecnologia o1, Tecnologia o2) {
                return Integer.compare(o1.getNombre().compareTo(o2.getNombre()), 0);
            }
        };
    }
}
