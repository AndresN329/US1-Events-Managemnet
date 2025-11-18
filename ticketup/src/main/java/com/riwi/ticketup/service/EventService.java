package com.riwi.ticketup.service;

import com.riwi.ticketup.dto.EventDTO;
import com.riwi.ticketup.exception.ResourceNotFoundException;
import com.riwi.ticketup.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository repository;

    public List<EventDTO> getAll() {
        return repository.findAll();
    }

    public EventDTO getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("El evento con ID " + id + " no existe"));
    }

    public EventDTO create(EventDTO event) {
        return repository.save(event);
    }

    public void delete(Long id) {
        boolean deleted = repository.delete(id);

        if (!deleted) {
            throw new ResourceNotFoundException("No se pudo eliminar. El evento con ID " + id + " no existe");
        }
    }
}
