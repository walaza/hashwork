/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashwork.repository.people.Impl;

import hashwork.domain.people.PersonDemographics;
import hashwork.repository.people.PersonDemographicsRepository;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author BONGANI
 */
public class PersonDemographicsRepositoryImpl implements PersonDemographicsRepository  {
     Map<String, PersonDemographics> lists = new HashMap<>();

   public PersonDemographicsRepositoryImpl() {

    }
    @Override
    public PersonDemographics findById(String s) {
        return lists.get(s);
    }

    @Override
    public PersonDemographics save(PersonDemographics entity) {
       return lists.put(entity.getId(), entity);
    }

    @Override
    public PersonDemographics update(PersonDemographics entity) {
        return lists.put(entity.getId(), entity);
    }

    @Override
    public void delete(PersonDemographics entity) {
      lists.remove(entity.getId());
    }

    @Override
    public Set<PersonDemographics> findAll() {
       
        Set<PersonDemographics> set = new HashSet<>();
        for (Map.Entry<String, PersonDemographics> entry : lists.entrySet()) {
            set.add(entry.getValue());
        }
        return set;
        
    }
   
        
}
