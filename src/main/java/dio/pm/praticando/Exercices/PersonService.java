package dio.pm.praticando.Exercices;

import java.time.OffsetDateTime;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    public void validator(String name, Integer birth){
        
        if(name == null || name.trim() == ""){
            throw new IllegalArgumentException("Name cannot be void or blank");
        }
        if(!(name instanceof String)){
            throw new IllegalArgumentException("Name need to be an String");
        }
        if(birth <= 0){
            throw new IllegalArgumentException("Birth need to be an Integer bigget than zero");
        }
        if(!(birth instanceof Integer)){
            throw new IllegalArgumentException("Birth need to  be an Integer");
        }
    }

    public Integer calculateAge(Integer birth){
        var todayYear = OffsetDateTime.now().getYear();
    
        return todayYear - birth;
    }

}
