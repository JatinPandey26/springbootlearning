package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Engineer implements Staff {

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public void profile() {
        System.out.println("I am a engineer");
    }


    private String name;

    void doWork(){
        System.out.println("Doing work");

    }

    public void setName(String name) {
        this.name = name;
    }
}
