import java.util.Objects;

public class Book {
    private String nameBook;
    private Author Author;
    private int year;

    public Book(String nameBook, Author Author, int year) {
        this.nameBook = nameBook;
        this.Author = Author;
        this.year = year;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.Author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Название книги " + this.nameBook + " Автор " + this.Author.toString() + " Год выпуска " + this.year;
    }
    public boolean equals(Book other){
        if(this.getNameBook().equals(other.getNameBook())&&this.getAuthor().equals(other.getAuthor())&&this.getYear()== other.getYear()){
            return true;
        }else{
            return false;
        }
    }
    public int hashCode(){
        return Objects.hash(nameBook, Author, year);
    }
}




