package dio.pm.praticando.Exercices;

public class CalculateTable {
    
    public void calculateTable(Integer number){

        validateValue(number);

        System.out.println("Calculation:");

        var multiplier = 1;

        do {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));

            multiplier++;
            
        } while (multiplier != 11);
    
    }

    private void validateValue(Integer number){
        
        if(number <= 0 || !(number instanceof Integer)){
            throw new IllegalArgumentException("The number need to be a Integer and positive.");
        }

    }

}
