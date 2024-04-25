public class Main {
    public static void main(String[] args) {
        try {
            for (Event event : getMovies()) {
                validEvent(event);
            }
            for (Event event : getTheatres()) {
                validEvent(event);
            }
            System.out.println("Все события корректны");
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static Movie[] getMovies(){
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Дюна",0,13 )
        };
    }
    public static Theatre[] getTheatres(){
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre(" ", 1999, 0)
        };
    }
    public static void validEvent(Event event){
        event.validate();
    }

}
