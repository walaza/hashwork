/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashwork.services.people.Impl;

import hashwork.domain.people.PersonPosition;
import hashwork.domain.people.PersonRole;
import hashwork.repository.people.Impl.PersonPositionRepositoryImpl;
import hashwork.repository.people.PersonPositionRepository;
import hashwork.services.people.PersonPositionService;
import hashwork.services.people.PersonRoleService;

import java.util.Set;

/**
 * @author BONGANI
 */
public class PersonPositionServiceImpl implements PersonPositionService {
    private final PersonPositionRepository repo = new PersonPositionRepositoryImpl();

    @Override
    public PersonPosition findById(String s) {
        return repo.findById(s);
    }

    @Override
    public PersonPosition save(PersonPosition entity) {
        return repo.save(entity);
    }

    @Override
    public PersonPosition update(PersonPosition entity) {
        return repo.save(entity);
    }

    @Override
    public void delete(PersonPosition entity) {
        repo.delete(entity);
    }

    @Override
    public Set<PersonPosition> findAll() {
        return repo.findAll();
    }

}
