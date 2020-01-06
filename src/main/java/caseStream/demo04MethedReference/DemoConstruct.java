package caseStream.demo04MethedReference;

import caseStream.dto.PersonDto;

public class DemoConstruct {

    public static void testConstruct(String name,ConstructDemoInterface construct){

        PersonDto construct1 = construct.construct(name);
        System.out.println(construct1.getName());
    }

    public static void main(String[] args) {
        testConstruct("123",(name)->{
            return new PersonDto(name);
        });
        testConstruct("123",PersonDto::new);
    }
}
