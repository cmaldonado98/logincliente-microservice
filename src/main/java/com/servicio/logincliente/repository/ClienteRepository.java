package com.servicio.logincliente.repository;

import com.servicio.logincliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    @Query(value = "SELECT * FROM cliente WHERE cedula = :cedula and password_cliente = :passwordCliente", nativeQuery = true)
    Cliente findByClienteCedula(String cedula, String passwordCliente);
}
