
public class Student {
   int id;
   String name,mobnum,email,course;

    public Student(int id, String name, String mobnum, String email, String course) {
        this.id = id;
        this.name = name;
        this.mobnum = mobnum;
        this.email = email;
        this.course = course;
    }

    public Student() {
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobnum() {
        return mobnum;
    }

    public void setMobnum(String mobnum) {
        this.mobnum = mobnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
   
   
}
