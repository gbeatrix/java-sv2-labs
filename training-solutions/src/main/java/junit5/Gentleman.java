package junit5;

public class Gentleman {
    public String sayHello(String name){
        if(name == null){
            return sayHello("Anonymous");
        } else {
            return "Hello " + name;
        }
    }
}
