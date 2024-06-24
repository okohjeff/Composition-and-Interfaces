package Encapsulation;

public class Person {
    private String name;
    private String schoolName;
    private String password;
    private String matricNo;
    private int staffNo;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", password='" + password + '\'' +
                ", matricNo='" + matricNo + '\'' +
                ", staffNo=" + staffNo +
                '}';
    }

    public Person (String name, String schoolName, String password, String matricNo, int staffNo) {
        this.name = name;
        this.password = password;
        this.schoolName = schoolName;
        this.matricNo = matricNo;
        this.staffNo = staffNo;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
    public String setPassword(String password) {
        this.password = password;
        return "Password set successfully";
    }
}

