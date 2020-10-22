package com.fabriciolfj.github.functionexemplo.handler;

import com.fabriciolfj.github.functionexemplo.dto.EmpresaRequestDTO;
import com.fabriciolfj.github.functionexemplo.model.Empresa;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class EmpresaFunctionAWSHandler extends SpringBootRequestHandler<EmpresaRequestDTO, Empresa> {
}
