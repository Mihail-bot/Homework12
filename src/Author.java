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
    public String toString(){
        return "Имя "+this.name+" Фамилия "+this.family;
    }
    public boolean equals(Author other){
        if (this.getName().equals(other.getName())&&this.getFamily().equals(other.getFamily())) {
            return true;
        }else{
            return false;
        }
    }
    public int hashCode(){
        return Objects.hash(name,family);
    }
}

