package com.unacommunity.controller;

import com.unacommunity.entity.Assurance;
import com.unacommunity.service.AssuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class AssuranceController {

    @Autowired
    private AssuranceService service;

    @MutationMapping
    public Assurance createAssurance(@Argument String name, @Argument int age, @Argument String assuranceType) {
        Assurance assurance = new Assurance();
        assurance.setName(name);
        assurance.setAge(age);
        assurance.setAssuranceType(assuranceType);
        return service.saveAssurance(assurance);
    }

    @MutationMapping
    public Assurance updateAssurance(@Argument Long id, @Argument String name, @Argument int age, @Argument String assuranceType) {
        Assurance updated = new Assurance();
        updated.setName(name);
        updated.setAge(age);
        updated.setAssuranceType(assuranceType);
        return service.updateAssurance(id, updated);
    }

    @QueryMapping
    public List<Assurance> getAllAssurances() {
        return service.getAllAssurances();
    }

    @QueryMapping
    public Optional<Assurance> getAssuranceById(@Argument Long id) {
        return service.getAssuranceById(id);
    }

    @MutationMapping
    public Boolean deleteAssurance(@Argument Long id) {
        service.deleteAssurance(id);
        return true;
    }
}
