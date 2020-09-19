package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dspesquisa.entities.Record;

public interface RecordReposity extends JpaRepository<Record, Long> {

}
