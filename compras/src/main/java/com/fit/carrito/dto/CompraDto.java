package com.fit.carrito.dto;

import java.util.Date;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Validated
@Builder
@Getter
@Setter
public class CompraDto {

	@JsonProperty("compraId")
	private Integer compraId;
	
	@JsonProperty("dni")
	private Integer dni;

	@JsonProperty("fecha")
	private Date fecha;
	
	@JsonProperty("monto")
	private Double monto;
}