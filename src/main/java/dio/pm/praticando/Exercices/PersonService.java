package dio.pm.praticando.Exercices;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public Integer treatData(Person personA, Person personB){

        validateValue(personA, personB);
        
        return calculateAge(personA.getAge(), personB.getAge());

    }

    private void validateValue(Person personA, Person personB){
        
        if(personA.getAge() <= 0 || personB.getAge() <= 0){
            throw new IllegalArgumentException("Only positive values are accepted on age");
        }
        if(personA.getName() == null || personA.getName().trim() == ""){
            throw new IllegalArgumentException("Name cannot be null or empty");            
        }
        if(personB.getName() == null || personB.getName().trim() == ""){
            throw new IllegalArgumentException("Name cannot be null or empty");                        
        }        

    }

    private Integer calculateAge(Integer ageA, Integer ageB){
        
        if(ageA > ageB){
            return ageA - ageB;
        }

        return ageB - ageA;

    }

}
