
public class Main {

    public static void main(String[] args) {
        Author tolstoy=new Author("Lev","Tolstoy");
        Book warAndPeace = new Book("warAndPeace",tolstoy,2001);
        warAndPeace.setYear(2222);
        System.out.println("warAndPeace = " + warAndPeace.getYear());
        Author pushkin=new Author("Aleksandr","Pushkin");
        Book skazkaOCareSaltane=new Book("SkazkaOCareSaltane",pushkin,1985);
    }

}