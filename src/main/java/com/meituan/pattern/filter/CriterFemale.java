package com.meituan.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriterFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> female = new ArrayList<>();
        for(Person person: persons){
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                female.add(person);
            }
        }
        return female;
    }
}
