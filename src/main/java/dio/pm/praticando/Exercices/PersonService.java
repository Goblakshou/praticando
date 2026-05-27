package dio.pm.praticando.Exercices;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    public void validator(Double sideA, Double sideB){
        
        if(sideA <= 0 || sideB <= 0){
            throw new IllegalArgumentException("Only positive values are accepted");
        }

    }

    public Double calculateArea(Double sideA, Double sideB){
        
        return sideA * sideB;

    }

}
