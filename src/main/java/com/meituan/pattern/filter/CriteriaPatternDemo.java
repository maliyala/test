package com.meituan.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        //设定人群。
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        //人群划分类型
        Criteria male = new CriteriaMale();
        Criteria female =new CriterFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single,male);
        Criteria singleFemale = new AndCriteria(single,female);
        Criteria singleOrFemale = new OrCriteria(single,female);
        System.out.println(" Males:");
        printCriteria(male.meetCriteria(persons));

        System.out.println("\n Females:");
        printCriteria(female.meetCriteria(persons));

        System.out.println("\n Single Males:");
        printCriteria(singleMale.meetCriteria(persons));

        System.out.println("\n Single Females:");
        printCriteria(singleFemale.meetCriteria(persons));

        System.out.println("\n Single Or Females:");
        printCriteria(singleOrFemale.meetCriteria(persons));
    }

    private static void printCriteria(List<Person> people) {
        for(Person person:people){
            System.out.println("Person:[ Name: "+person.getName()
                    +",Gender:" +person.getGender()
                    +",Mrital Status:" +person.getMaritalStatus()
                    +"]");
        }
    }
}
