package dio.pm.praticando.Exercices;

public class PraticandoService {
    
    public void calculateNumber(Integer minNum, Integer maxNum, String option){

        validateValues(minNum, maxNum);
        
        if(option.equals("2")){

            System.out.println("=============\nEven:");

        }

        System.out.println("=============\nOdd:");
        
            do {

                var result = minNum + (maxNum - minNum);

                if(option.equals("2") && result % 2 == 0){

                    System.out.println(result);

                }
                if(option.equals("1") && result % 2 != 0){

                    System.out.println(result);

                }
            
                maxNum --;

            } while (!(maxNum < minNum));
        
    }

    private void validateValues(Integer minNum, Integer maxNum){
        if(minNum <= 0 || !(minNum instanceof Integer)){
            throw new IllegalArgumentException("The values need to be Integer and positive");
        }
        if(maxNum <= 0 || !(maxNum instanceof Integer)){
            throw new IllegalArgumentException("The values need to be Integer and positive");
        }
        if(minNum > maxNum){
            throw new IllegalArgumentException("The second number need to be more than the first");            
        }
    }

}
