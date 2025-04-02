
public class Main {

    public static void main(String[] args) {
        Author tolstoy=new Author("Lev","Tolstoy");
        Book warAndPeace = new Book("warAndPeace",tolstoy,2001);
        Author tolstoy1=new Author("Lev","Tolstoy");
        Book warAndPeace1=new Book("warAndPeace",tolstoy1,2001);
        Author pushkin=new Author("Aleksandr","Pushkin");
        Book skazkaOCareSaltane=new Book("SkazkaOCareSaltane",pushkin,1985);
        System.out.println(tolstoy);
        System.out.println(warAndPeace);
        System.out.println(warAndPeace.equals(warAndPeace));
        System.out.println(warAndPeace.hashCode()==warAndPeace1.hashCode());
    }

}