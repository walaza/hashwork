/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashwork.repository.people.Impl;

import hashwork.domain.people.PersonHiringDecision;
import hashwork.repository.people.PersonHiringDecisionRepository;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author BONGANI
 */
public class PersonHiringDecisionRepositoryImpl implements PersonHiringDecisionRepository {
     Map<String, PersonHiringDecision> lists = new HashMap<>();

   public PersonHiringDecisionRepositoryImpl() {

    }
    @Override
    public PersonHiringDecision findById(String s) {
        return lists.get(s);
    }

    @Override
    public PersonHiringDecision save(PersonHiringDecision entity) {
          return lists.put(entity.getId(), entity);
    }

    @Override
    public PersonHiringDecision update(PersonHiringDecision entity) {
         return lists.put(entity.getId(), entity);
    }

    @Override
    public void delete(PersonHiringDecision entity) {
       lists.remove(entity.getId());
    }

    @Override
    public Set<PersonHiringDecision> findAll() {
       Set<PersonHiringDecision> set = new HashSet<>();
        for (Map.Entry<String, PersonHiringDecision> entry : lists.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
    }
    
}
