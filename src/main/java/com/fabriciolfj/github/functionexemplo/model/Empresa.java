package com.fabriciolfj.github.functionexemplo.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Empresa {

    private String id;
    private String name;
    private LocalDate date;
}
