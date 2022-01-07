package br.unicesumar.adsis4s2021.meu.lucas.estoque;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MinhaReservaDeEstoqueService {
	
	@Autowired
	private MinhaReservaDeEstoqueRepository repo;
	
	public String insert(MinhaReservaDeEstoque nova) {
		BigDecimal quantidadeTotalJáReservada = repo.recuperarQuantidadeTotalJáReservada(nova.getCliente().getId(), nova.getProduto().getId());
		if (quantidadeTotalJáReservada.compareTo( new BigDecimal("0.00") ) > 0) 
			throw new MinhaReservaDeEstoqueExcedidaException("Não é possível reservar mais estoque para este produto, reserva prévia encontrada.");
		return repo.save(nova).getId();
	}

}
