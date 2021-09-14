package com.servicio.logincliente.controller;

import com.servicio.logincliente.entity.Cliente;
import com.servicio.logincliente.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/clientes")
@Slf4j

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/login2/{cedula}/{passwordCliente}")
    public Cliente findClienteByCedulas(@PathVariable("cedula") String cedula, @PathVariable("passwordCliente") String passwordCliente){
        log.info("Inside findClienteByCedula method of ClienteController");
        return clienteService.findClienteByCedula(cedula, passwordCliente);
    }
}
