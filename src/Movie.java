public class Movie extends Event{
    public Movie(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }

    @Override
    public void validate() {
        if(getTitle() == null || getTitle().isEmpty() || getAge() == 0 || getReleaseYear() == 0){
            throw new RuntimeException("Некорректно введены сведения о фильме: " + this);
        }
    }
}
