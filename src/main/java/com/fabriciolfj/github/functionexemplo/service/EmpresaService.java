package com.fabriciolfj.github.functionexemplo.service;

import com.fabriciolfj.github.functionexemplo.dto.EmpresaRequestDTO;
import com.fabriciolfj.github.functionexemplo.model.Empresa;

public interface EmpresaService {

    Empresa create(final EmpresaRequestDTO dto);
}
