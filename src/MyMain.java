public class MyMain {
    public static void main(String[] args){
       Author esenin = new Author("Sergey","Esenin");
       Book stihi=new Book("Stihi",esenin,1995);
       stihi.setYear(2005);
        System.out.println("stihi.getYear() = " + stihi.getYear());
    }
}
