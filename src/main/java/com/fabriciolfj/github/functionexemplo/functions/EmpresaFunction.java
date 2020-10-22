package com.fabriciolfj.github.functionexemplo.functions;

import com.fabriciolfj.github.functionexemplo.dto.EmpresaRequestDTO;
import com.fabriciolfj.github.functionexemplo.model.Empresa;
import com.fabriciolfj.github.functionexemplo.service.EmpresaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component(value = "empresa")
@AllArgsConstructor
public class EmpresaFunction implements Function<EmpresaRequestDTO, Empresa> {

    private EmpresaService empresaService;

    @Override
    public Empresa apply(final EmpresaRequestDTO dto) {
        return empresaService.create(dto);
    }
}
