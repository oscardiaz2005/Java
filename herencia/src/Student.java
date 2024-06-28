public class Student extends Person {
    private int codeStudent;
    private float finalNote;

    public Student(String name,String lastName,int age,int codeStudent,float finalNote){
        super(name,lastName,age);
        this.codeStudent=codeStudent;
        this.finalNote=finalNote;
    }
    public void showData(){
        System.out.println("name = " + getName());
        System.out.println("last name = " + getLastName());
        System.out.println("age  = " + getAge());
        System.out.println("code of the student = " + codeStudent);
        System.out.println("final note = " + finalNote);
    }






}


