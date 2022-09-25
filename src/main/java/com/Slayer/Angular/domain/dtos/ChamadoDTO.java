package com.Slayer.Angular.domain.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.Slayer.Angular.domain.Chamado;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ChamadoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private Integer id;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAbertura = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFechamento;
	@NotNull(message = "O campo prioridade é requerido")
	private Integer prioridade;
	@NotNull(message = "O campo status é requerido")
	private Integer status;
	@NotNull(message = "O campo titulo é requerido")
	private String titulo;
	@NotNull(message = "O campo observacoes é requerido")
	private String observacoes;
	@NotNull(message = "O campo tecnico é requerido")
	private Integer tecnico;
	@NotNull(message = "O campo cliente é requerido")
	private Integer cliente;
	private String NomeTecnico;
	private String NomeCliente;

	public ChamadoDTO() {
		super();

	}

	public ChamadoDTO(Chamado obj) {
		super();
		this.id = obj.getId();
		this.dataAbertura = obj.getDataAbertura();
		this.dataFechamento = obj.getDataFechamento();
		this.prioridade = obj.getPrioridade().getCodigo();
		this.status = obj.getStatus().getCodigo();
		this.titulo = obj.getTitulo();
		this.observacoes = obj.getObservacoes();
		this.tecnico = obj.getTecnico().getId();
		this.cliente = obj.getCliente().getId();
		this.NomeTecnico = obj.getTecnico().getNome();
		this.NomeCliente = obj.getCliente().getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Integer getTecnico() {
		return tecnico;
	}

	public void setTecnico(Integer tecnico) {
		this.tecnico = tecnico;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	public String getNomeTecnico() {
		return NomeTecnico;
	}

	public void setNomeTecnico(String nomeTecnico) {
		NomeTecnico = nomeTecnico;
	}

	public String getNomeCliente() {
		return NomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}