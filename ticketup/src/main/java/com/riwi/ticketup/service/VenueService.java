package com.riwi.ticketup.service;

import com.riwi.ticketup.dto.VenueDTO;
import com.riwi.ticketup.repository.VenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenueService {
    private final VenueRepository repository;

    public VenueService(VenueRepository repository) {
        this.repository = repository;
    }

    public List<VenueDTO> getAll() {
        return repository.findAll();
    }

    public Optional<VenueDTO> getById(Long id) {
        return repository.findById(id);
    }

    public VenueDTO create(VenueDTO venue) {
        return repository.save(venue);
    }

    public Optional<VenueDTO> update(Long id, VenueDTO updatedVenue) {
        Optional<VenueDTO> existingVenue = repository.findById(id);
        if (existingVenue.isPresent()) {
            VenueDTO v = existingVenue.get();
            v.setName(updatedVenue.getName());
            v.setCapacity(updatedVenue.getCapacity());
            v.setAddress(updatedVenue.getAddress());
            return Optional.of(v);
        }
        return Optional.empty();
    }

    public boolean delete(Long id) {
        return repository.delete(id);
    }
}
