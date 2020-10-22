package com.fabriciolfj.github.functionexemplo.service.impl;

import com.fabriciolfj.github.functionexemplo.dto.EmpresaRequestDTO;
import com.fabriciolfj.github.functionexemplo.model.Empresa;
import com.fabriciolfj.github.functionexemplo.service.EmpresaService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Override
    public Empresa create(EmpresaRequestDTO dto) {
        final String id = generateId();
        final String name = getNomeEmpresa(dto.getName());

        return Empresa.builder()
                .date(LocalDate.now())
                .name(name)
                .id(id)
                .build();
    }

    private String getNomeEmpresa(final String name) {
        return name.toUpperCase();
    }

    private String generateId() {
        return UUID.randomUUID().toString();
    }
}

