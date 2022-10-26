public class Word {

    String hebrew;
    String english;

    public Word(String hebrew, String english) {
        this.hebrew = hebrew;
        this.english = english;
    }

    public String getHebrew() {
        return hebrew;
    }

    public void setHebrew(String hebrew) {
        this.hebrew = hebrew;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return english + " : " + hebrew;
    }
}
