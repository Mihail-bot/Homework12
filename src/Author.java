import java.util.Objects;

public class Author {
    private String name;
    private String family;
    public Author(String name, String family){
        this.name=name;
        this.family=family;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }
    @Override
    public String toString(){
        return "Имя "+this.name+" Фамилия "+this.family;
    }
    @Override
    public boolean equals(Object other){
        if (this==other) {
            return true;
        }if(other==null||getClass() != other.getClass()){
            return false;
        }
        Author author = (Author) other;
        return Objects.equals(name, author.name) && Objects.equals(family, author.family);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,family);
    }
}

