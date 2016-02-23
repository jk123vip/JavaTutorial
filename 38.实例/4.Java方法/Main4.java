/**
 * enum和switch语句使用
 */

enum Car {
    lamborghini, tata, audi, fiat, honda
}

public class Main4 {

    public static void main(String[] args) {
        Car c;
        c = Car.tata;
        switch (c) {
            case lamborghini:
                System.out.println("It's lamborghini");
                break;
            case tata:
                System.out.println("It's tata");
                break;
            case audi:
                System.out.println("It's audi");
                break;
            case fiat:
                System.out.println("It's fiat");
                break;
            case honda:
                System.out.println("It's honda");
                break;
            default:
                System.out.println("It's not here");
                break;
        }
    }

}
