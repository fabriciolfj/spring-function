package com.fabriciolfj.github.functionexemplo.functions;

import com.fabriciolfj.github.functionexemplo.dto.EmpresaRequestDTO;
import com.fabriciolfj.github.functionexemplo.service.EmpresaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component(value = "empresaConsumer")
@AllArgsConstructor
@Slf4j
public class EmpresaConsumer implements Consumer<EmpresaRequestDTO> {

    private EmpresaService empresaService;

    @Override
    public void accept(EmpresaRequestDTO dto) {
        log.info("Informação da empresa {}", empresaService.create(dto));
    }
}
