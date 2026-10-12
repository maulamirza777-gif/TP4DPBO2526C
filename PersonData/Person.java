public class Person {
    private String id;
    private String name;
    private int year;
    private String email;
    private String category;
    public Person(){

    }
    public Person(String id, String name, int year, String email , String category){
        this.id = id;
        this.name = name;
        this.year = year;
        this.email = email;
        this.category = category;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public String getEmail(){
        return this.email;
    }
    public String getCategory(){
        return this.category;
    }
}
