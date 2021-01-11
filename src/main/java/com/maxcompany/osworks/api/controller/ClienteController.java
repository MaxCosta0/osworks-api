package com.maxcompany.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxcompany.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente(1L, "Maxley", "maxleysoares006@gmail.com", "34 98803-9861");
		Cliente cliente2 = new Cliente(2L, "kiki", "aquinoam24@gmail.com", "34 97777-1111");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
}
