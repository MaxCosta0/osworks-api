package com.maxcompany.osworks.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxcompany.osworks.domain.exception.NegocioException;
import com.maxcompany.osworks.domain.model.Cliente;
import com.maxcompany.osworks.domain.repository.ClienteRepository;

@Service
public class CadastroClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente){
		Cliente verificaCliente = clienteRepository.findByEmail(cliente.getEmail());
		
		if(verificaCliente != null && !verificaCliente.equals(cliente)) {
			throw new NegocioException("Ja existe um cliente cadastrado com esse email!");
		}
		
		return clienteRepository.save(cliente);
	}
	
	public void excluir(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}
}
