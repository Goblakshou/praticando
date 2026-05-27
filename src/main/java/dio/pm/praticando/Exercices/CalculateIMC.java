package dio.pm.praticando.Exercices;

public class CalculateIMC {
    
    public void calculateIMC(Double height, Double weight){

        validateValue(height, weight);

        var imc = weight / (height * height);

        System.out.println(imc);

        if(imc < 18.5){
            System.out.println("Underweight");
        }
        if(imc < 24.9 && imc > 18.6){
            System.out.println("Healthy weight");
        }
        if(imc < 29.9 && imc > 25){
            System.out.println("Overwight");
        }
        if(imc < 34.9 && imc > 30){
            System.out.println("Obesity Class I");
        }
        if(imc < 39.9 && imc > 35){
            System.out.println("Obesity Class II (Severe)");
        }
        if(imc >= 40){
            System.out.println("Obesity Class III (Morbid)");
        }
    
    }

    private void validateValue(Double height, Double weight){
        
        if(height <= 0 || !(height instanceof Double)){
            throw new IllegalArgumentException("The number need to be a Double and positive.");
        }
        if(weight <= 0 || !(weight instanceof  Double)){
            throw new IllegalArgumentException("The number need to be a Double and positive.");
        }

    }

}
