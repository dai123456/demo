package caseStream.dto;


import lombok.Data;

@Data
public class PersonDto {
    private String name;


    public PersonDto(String name){
        this.name = name;
    }




}
