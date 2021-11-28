package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {
    public void getMarried(Woman woman, Man man) {
        if(woman == null || man == null){
            throw new IllegalArgumentException("Bride or groom is missing.");
        }
        setRegisterDate(woman, man);
        setMarriedName(woman, man);
    }

    private void setRegisterDate(Woman woman, Man man){
        RegisterDate marriage = new RegisterDate("házasságkötés ideje", LocalDate.now());
        woman.addRegisterDate(marriage);
        man.addRegisterDate(marriage);
    }

    private void setMarriedName(Woman woman, Man man) {
        String prefix = man.getName().split(" ")[0] + "né";
        woman.setName(prefix + woman.getName().substring(woman.getName().indexOf(" ")));
    }
}
