package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {
    public static void main(String[] args) {
        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
        System.out.println(new Message().decode(codedMessage));

//        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "1O1", "110", "101", "116", "46");
//        0 helyett O szerepel az egyik helyen, így a parseInt NumberFormatException kivételt dob
      List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "101", "110", "101", "116", "46");
        System.out.println(new Message().decode(anotherCodedMessage));
    }

    private String decode(List<String> codedMessage) {
        StringBuilder message = new StringBuilder();
        for(String s : codedMessage){
            message.append((char)Integer.parseInt(s));
        }
        return message.toString();
    }
}
