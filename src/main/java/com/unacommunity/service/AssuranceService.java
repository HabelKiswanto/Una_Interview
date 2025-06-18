package com.unacommunity.service;

import com.unacommunity.entity.Assurance;
import com.unacommunity.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssuranceService {

    @Autowired
    private Repo repo;

    public Assurance saveAssurance(Assurance entity) {
        return repo.save(entity);
    }

    public Assurance updateAssurance(Long id, Assurance updatedEntity) {
        Optional<Assurance> optionalEntity = repo.findById(id);
        if (optionalEntity.isPresent()) {
            Assurance existing = optionalEntity.get();
            existing.setName(updatedEntity.getName());
            existing.setAge(updatedEntity.getAge());
            existing.setAssuranceType(updatedEntity.getAssuranceType());
            return repo.save(existing);
        } else {
            throw new RuntimeException("Entity not found: " + id);
        }
    }

    public List<Assurance> getAllAssurances() {
        return repo.findAll();
    }

    public Optional<Assurance> getAssuranceById(Long id) {
        return repo.findById(id);
    }

    public void deleteAssurance(Long id) {
    repo.deleteById(id);
    }
}
