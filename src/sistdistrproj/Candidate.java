package sistdistrproj;

public class Candidate {

    private String email;
    private String password;
    private String name;

    public Candidate(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public Candidate() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}