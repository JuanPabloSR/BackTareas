package com.sofka.tareas.repo;

import com.sofka.tareas.model.Tarea;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TareaRepository extends MongoRepository<Tarea, String> {
}
