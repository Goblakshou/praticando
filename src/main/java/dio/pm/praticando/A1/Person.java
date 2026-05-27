
package dio.pm.praticando.A1;

class Person {

    private final String name;

    private final int age;

    private Person(String name, int age){

        this.name = name;
        this.age = age;

    }

    static Person create(String name, int age){
        return new Person(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}