package com.fabriciolfj.github.functionexemplo.functions;

import com.fabriciolfj.github.functionexemplo.dto.EmpresaRequestDTO;
import com.fabriciolfj.github.functionexemplo.model.Empresa;
import com.fabriciolfj.github.functionexemplo.service.EmpresaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
@AllArgsConstructor
public class EmpresaSupplier implements Supplier<Empresa> {

    private EmpresaService empresaService;

    @Override
    public Empresa get() {

        return empresaService.create(EmpresaRequestDTO.builder()
                .name("Nestle")
                .build());
    }
}
