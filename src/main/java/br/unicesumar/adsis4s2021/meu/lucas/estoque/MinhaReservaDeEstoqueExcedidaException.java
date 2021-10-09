package br.unicesumar.adsis4s2021.meu.lucas.estoque;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class MinhaReservaDeEstoqueExcedidaException extends RuntimeException {

	public MinhaReservaDeEstoqueExcedidaException(String message) {
		super(message);
	}

}
