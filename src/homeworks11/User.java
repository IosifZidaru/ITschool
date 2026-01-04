package homeworks11;

import java.util.ArrayList;
import java.util.List;
// user //
public abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getName(){
        return name;
    }
}

// Admin //

class Admin extends User{
    public Admin(String name, String email){
        super(name, email);
    }
    public void mpdifyAppliction(){
        System.out.println("Admin modifies de application");
    }
}

// Manager //

class Manager extends User {

    public Manager(String name, String email){
        super(name, email);
    }
    public void viewEmployees(List<Employee> employees) {
        for (Employee e: employees) {
            System.out.println(e.getName() + " - " + e.getPosition());
        }
    }
    public void promoteEmployee(Employee employee){
        employee.setPosition("Team leadaer");
    }
}

// employee //

class Employee{
    private String name;
    private String position;

    public Employee(String name, String position){
        this.name = name;
        this.position = position;
    }
    public String getPosition(){
        return position;
    }


    public String getName(){
        return name;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void getPosition(String teamLeader) {

    }

    public void add(Employee employee) {

    }
}

// Team //

class Team{
    private String teamName;
    private Employee teamLeader;
    private List<Employee> members = new ArrayList<>();

    public Team(String teamName, Employee teamLeader){
        this.teamName = teamName;
        this.teamLeader = teamLeader;
    }

    public void addMember(Employee employee){
        members.add(employee);
    }

   public void changeTeamLeader(Employee newLeader){
        this.teamLeader = newLeader;
        newLeader.getPosition("Team Leader");
   }

    public void showTeamStructure(){
        System.out.println("Team: " + teamName);
        System.out.println("Leader: " + teamLeader.getName());
        System.out.println("Members: ");
        for (Employee e : members) {
            System.out.println("- " + e.getName());
        }

    }
}
 // resource //

class Resource {
    private String name;
    private int quantity;

    public Resource(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
}

// email //
interface  EmailService {
    void sendEmail(String email, String massage);
}

// implementarea //

class CompanyEmailService implements EmailService {

    @Override
    public void sendEmail( String email, String massage) {
        System.out.println("Email sent to " + email + ": " + massage);
    }
}

// company //

class Company{
    private List<Employee> employees = new ArrayList<>();
    private List<Team> teams = new ArrayList<>();

    public void addEmployee(Employee employee){
        employee.add(employee);
    }
    public void addTeam(Team team){
        teams.add(team);
    }
    public List<Employee> getEmployees() {
        return employees;
    }
}
class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee("iosif", "TEAM_MEMBER");
        Employee e2 = new Employee("Ale", "TEAM_MEMBER");

        Team team = new Team("Construction Team", e1);
        team.addMember(e2);

        Manager manager = new Manager("Ade", "ade@gmail.com");
        manager.promoteEmployee(e2);

        team.showTeamStructure();

        EmailService emailService = new CompanyEmailService();
        emailService.sendEmail("employess@company.com", "Company meeting tomorow at 9 AM");

    }
}


