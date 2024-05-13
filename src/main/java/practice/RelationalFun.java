package practice;

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;

        System.out.println("my bool is: "+ myBool);
        System.out.println("your bool is: " + yourBool);

        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > bobsAge;

        System.out.println("yourAge > bobsAge?: " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge?: " + ageComparison);
    }
}
