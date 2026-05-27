package dio.pm.praticando.A1;

import java.time.OffsetDateTime;

public class PraticandoService {

    public Person consultPerson(String name, Integer birth){
        
        validateValues(name, birth);
        int age = calculateAge(birth);

        Person person = Person.create(name, age);

        return person;

    }

    private void validateValues(String name, Integer birth){
        if(name == null || name.trim() == ""){
            throw new IllegalArgumentException("Variable Name cannot be empty");
        }
        if(birth == null || birth <= 0){
            throw new IllegalArgumentException("Variable birth cannot be zero ou negative");
        }     
    }

    private Integer calculateAge(int birth){

        int todayYear = OffsetDateTime.now().getYear();

        return  todayYear - birth;
    }

}
