package com.lhfioravanso.assemblyvoting.dto;

public class AgendaRequestDto {
    private String name;

    public AgendaRequestDto(){

    }

    public AgendaRequestDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
