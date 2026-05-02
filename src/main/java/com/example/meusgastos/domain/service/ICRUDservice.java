package com.example.meusgastos.domain.service;

import java.util.List;

public interface ICRUDservice<Req, Res> {
    List<Res> getAll();

    Res getById(String id);

    Res create(Req dto);

    Res update(String id, Req dto);

    void update(String id);
}
