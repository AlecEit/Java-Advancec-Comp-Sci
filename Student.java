public class Student{
    private String name;
    private String id;
    private int grade;
    public Student(String newName){
    this.name = newName;
    this.grade = 10;
    this.id = generateId();
    }
    public Student(String newName, int newGrade){
    
    this.name = newName;
    this.grade = newGrade;
    this.id = generateId();

    }
    public String getName(){
    return this.name;
    }
    public void setName(String newName){
    
    this.name = newName;

    }
    public String getId(){
    return this.id;
    }
    public void setId(String newId){
    this.id = newId;
    }
    public int getGrade(){
    return this.grade;
    }
    public void setGrade(int newGrade){
    this.grade = newGrade;
    }
    public String toString(){
    String thestring = "Name: " + name + "Grade: " + grade + "Id: " + id;
    }
    public boolean equals(Student other){
        if(name == other.name && id == other.id && grade == other.grade){
            boolean isequals = true;
        }
        else{
            isequals = false;
        }
    }
    public String generateId(){
        double firstthree = (Math.random() * 900);
        double lastfour = (Math.random() * 10000);
        
    }
}