public class Theatre extends Event{
    public Theatre(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }
    public void validate() {
        if(getTitle() == null || getTitle().isEmpty() || getAge() == 0 || getReleaseYear() == 0){
            throw new RuntimeException("Некорректно введены сведения о спектакле: " + this);
        }
    }
}
