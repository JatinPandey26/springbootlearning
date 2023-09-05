package demo;

public class Tester implements Staff {

    @Override
    public void profile() {
        System.out.println("I am a tester");
    }

    void checkWork(){
        System.out.println("Bugs found!!!");
    }
}
