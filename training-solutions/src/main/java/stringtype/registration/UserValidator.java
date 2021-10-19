package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername(String username){
        return username.length()>0;
    }

    public boolean isValidPassword(String password1, String password2){
        return (password1.length()>=8) && password1.equals(password2);
    }

    public boolean isValidEmail(String email){
        int atPos = email.indexOf("@");
        int dotPos = email.substring(atPos+1).indexOf(".");
        return (atPos>0) && (dotPos>0) && (atPos+dotPos+2<email.length());
    }
}
