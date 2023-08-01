package com.eblj.sistema_evento.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id ;
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant inicio;
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant fim;

  @ManyToOne
  @JoinColumn(name = "atividade_id")
  private Atividade atividade ;

  public Bloco(){}

  public Bloco(Integer id, Instant inicio, Instant fim) {
    this.id = id;
    this.inicio = inicio;
    this.fim = fim;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Instant getInicio() {
    return inicio;
  }

  public void setInicio(Instant inicio) {
    this.inicio = inicio;
  }

  public Instant getFim() {
    return fim;
  }

  public void setFim(Instant fim) {
    this.fim = fim;
  }

  public Atividade getAtividade() {
    return atividade;
  }

  public void setAtividade(Atividade atividade) {
    this.atividade = atividade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Bloco categoria = (Bloco) o;

    return id.equals(categoria.id);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }
}
