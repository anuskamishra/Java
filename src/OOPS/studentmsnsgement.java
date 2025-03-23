package OOPS;

class Studentmsnsgement {
    private String email;
    private String password;
    private String name;
    private int age;
    private String gender;
    private String branch;

    // Constructor
    public Studentmsnsgement(String email, String password, String name, int age, String gender, String branch) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.branch = branch;
    }

    // Getters (Encapsulation)
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBranch() {
        return branch;
    }

    // Setters (Encapsulation)
    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // Display student details
    public void displayStudentInfo() {
        System.out.println("Student Details:");
        System.out.println("Email: " + email);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Branch: " + branch);
    }
}

