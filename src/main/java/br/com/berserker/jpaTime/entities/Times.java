package br.com.berserker.jpaTime.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity

public class Times {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private LocalDate nascimento;

    private LocalDateTime registroHora;

    private LocalTime intervalo;

    public Integer getId() {
        return id;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public LocalDateTime getRegistroHora() {
        return registroHora;
    }

    public void setRegistroHora(LocalDateTime registroHora) {
        this.registroHora = registroHora;
    }

    public LocalTime getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(LocalTime intervalo) {
        this.intervalo = intervalo;
    }

    @Override
    public String toString() {
        return "Times{" +
                "id=" + id +
                ", nascimento=" + nascimento +
                ", registroHora=" + registroHora +
                ", intervalo=" + intervalo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Times)) return false;

        Times times = (Times) o;

        if (id != null ? !id.equals(times.id) : times.id != null) return false;
        if (nascimento != null ? !nascimento.equals(times.nascimento) : times.nascimento != null) return false;
        if (registroHora != null ? !registroHora.equals(times.registroHora) : times.registroHora != null) return false;
        return intervalo != null ? intervalo.equals(times.intervalo) : times.intervalo == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nascimento != null ? nascimento.hashCode() : 0);
        result = 31 * result + (registroHora != null ? registroHora.hashCode() : 0);
        result = 31 * result + (intervalo != null ? intervalo.hashCode() : 0);
        return result;
    }
}
