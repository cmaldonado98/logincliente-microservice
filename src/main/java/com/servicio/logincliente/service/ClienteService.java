package com.servicio.logincliente.service;


import com.servicio.logincliente.entity.Cliente;
import com.servicio.logincliente.repository.ClienteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente findClienteByCedula(String cedula, String passwordCliente) {
        log.info("Inside saveCliente of ClienteService");
        return clienteRepository.findByClienteCedula(cedula, passwordCliente);
    }
}