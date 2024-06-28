import java.util.Random;

public class Password {
    private int length;
    private String password;

    public Password(){
        this.length=8;
        this.password=generatePassword();
    }

    public Password (int length){
        this.length=length;
        this.password=generatePassword();
    }

    public String generatePassword() {
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String generatedPassword = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            generatedPassword += characters.charAt(index);
        }
        return generatedPassword;
    }


    public Boolean itsStrong(){
        int upper=0;
        int lower=0;
        int number=0;

        for (char c : password.toCharArray()){
            if (Character.isUpperCase(c)){
                upper+=1;
            } else if (Character.isLowerCase(c)) {
                lower+=1;
            } else if (Character.isDigit(c)) {
                number+=1;
            }
        }
        return upper>2 && lower>1 && number>5;

    }

    public int getLength() {
        return length;
    }

    public String getPassword() {
        return password;
    }

    public void setLength(int length) {
        this.length = length;
        this.password=generatePassword();
    }
}
