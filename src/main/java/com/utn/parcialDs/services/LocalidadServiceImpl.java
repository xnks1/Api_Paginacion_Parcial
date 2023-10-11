package com.utn.parcialDs.services;

import com.utn.parcialDs.entities.Base;
import com.utn.parcialDs.entities.Localidad;
import com.utn.parcialDs.repositories.BaseRepository;
import com.utn.parcialDs.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}
