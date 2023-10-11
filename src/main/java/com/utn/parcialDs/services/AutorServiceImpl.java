package com.utn.parcialDs.services;

import com.utn.parcialDs.entities.Autor;
import com.utn.parcialDs.repositories.AutorRepository;
import com.utn.parcialDs.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
