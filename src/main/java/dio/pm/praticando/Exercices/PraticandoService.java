package dio.pm.praticando.Exercices;

public class PraticandoService {
    
    public Boolean calculateNumber(Integer numberA, Integer numberB){

        if(numberB / numberA != 0 && numberB > numberA){
            return true;
        }

        System.out.println("Insert a valid number (bigger than the first number and a Integer positive).");
        return false;

    }

}
