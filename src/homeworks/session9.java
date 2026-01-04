package homeworks;

public class session9 {

    //exercitiu 1 //
    // 1 student data //

    String studentFirstName;
    String studentLastName;
    int studentAge;
    String studentSex;
    String studentDateOfBirth;
    String studentCnp;
    String stundentAddress;

    // 2 profesro data //

    String professorFirstName;
    String prodessorLastName;
    String professorAge;
    String professorSex;
    String professorDateOfBirth;
    String professortCnp;
    String professorAddress;

    // 3 cours data //

    String courseNAme;
    String courseSchedule;
    String courseDuration;
    String courseDescription;

    // 4 constructor  //

    public session9(){

        studentFirstName = "Iosif";
        studentLastName = "Marcel";
        studentAge = 21;
        studentSex = "Male";
        studentDateOfBirth = "30.07.2004";
        studentCnp = "123447890";
        stundentAddress = "london";

        professorFirstName = "Alexandra";
        prodessorLastName = "Creanga";
        professorAge = "47";
        professorSex = "female";
        professorDateOfBirth = "12.01.1979";
        professortCnp = "98776556431";
        professorAddress = "Cluj";

        courseNAme = "It";
        courseSchedule = "Tuesday 18:00";
        courseDuration = "2";
        courseDescription = "Introduction in program";
    }

    public void showStudent(){
        System.out.println("Student: " + studentFirstName + " " + studentLastName);
        System.out.println("Age: " + studentAge);
        System.out.println("Sex: " + studentSex);
        System.out.println("Date Of Birth: " + studentDateOfBirth);
        System.out.println("Cnp: " + studentCnp);
        System.out.println("Addrress: " + stundentAddress);
    }

    public void showProfessor(){
        System.out.println("Professor; " + professorFirstName + " " + prodessorLastName);
        System.out.println("Age: " + professorAge);
        System.out.println("Sex: " + professorSex);
        System.out.println("Date Of Birth: " + professorDateOfBirth);
        System.out.println("Cnp: " + professortCnp);
        System.out.println("Address: " + professorAddress);
    }

    public void showCourse(){
        System.out.println("Course: " + courseNAme);
        System.out.println("Schedule: " + courseSchedule);
        System.out.println("Duration: " + courseDuration);
        System.out.println("Descrption: " + courseDescription);
        System.out.println("Profesor: " + professorFirstName + " " + prodessorLastName);
    }

    public static void main(String[] args){
        session9 sin = new session9();

        sin.showStudent();
        System.out.println("-----");
        sin.showProfessor();
        System.out.println("----");
        sin.showCourse();
        sin.showGradebook();
        System.out.println("-----");
        sin.deposit(500);
        sin.WithDraw(300);
        sin.checkBalance();
        sin.logWorkOut();
        sin.weeklySummary();
        sin.searchWorkoutByType("Running");

    }


    // exercitiul 2 //
    // school gradebook //


    String gradeStudentName = "iosif Marcel" ;
    int gradeStudentId = 101;

    int grade1 = 9 ;
    int grade2 = 7;
    int grade3 = 8;

    public double calculateAverage(){
        return (grade1 + grade2 + grade3) / 3.0;
    }

    public void showGradebook(){
        System.out.println("Student name: " + gradeStudentName);
        System.out.println("Student id: " + gradeStudentId);
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: + " + grade2);
        System.out.println("Grade 3: " + grade3);
    }

    // exercitiul 3 //
    // simple namking //

    String accountHolderName = "Ana Popescu";
    double balance = 1000;

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void WithDraw(double amount){

        if (amount <= balance ){
            balance -= amount;
            System.out.println("WithDrow: " + amount);
        } else {
            System.out.println("Insuficient founds");
        }
    }

    public void checkBalance(){
        System.out.println("Account holder: " + accountHolderName);
        System.out.println("Current balanve: " + balance);
    }

    // exercitiul 4 //
    // Fitenes Tracking //

    String workoutType = "Running" ;
    int durationMinute = 45;
    double distanceKm = 6.5;
    double weightliftedKg = 0;

    double weeklyGoalkm = 10;
    double totalKmThisWeek = 6.5;

    public void logWorkOut(){
        System.out.println("Weekly goal: " + weeklyGoalkm + " km");
        System.out.println("Duration: " + durationMinute + " minutes");

        if (workoutType.equals("Running")){
            System.out.println("Distance: " + distanceKm + " km");
        }
        if (workoutType.equals("WeightLifting")){
            System.out.println("Weighr lifted: " + weightliftedKg + "kg");
        }
    }

    public void weeklySummary(){
        System.out.println("Weekly goal: " + weeklyGoalkm + " km");
        System.out.println("Total this week: " + totalKmThisWeek + " km");
        if (totalKmThisWeek >= weeklyGoalkm){
            System.out.println("Goal achivment");
        } else {
            System.out.println("goal not achivment");
        }
    }

    public void searchWorkoutByType(String type){
        if (workoutType.equals(type)){
            System.out.println("Workout found: " + workoutType);
            logWorkOut();
        } else{
            System.out.println(" no work found for type: " + type);
        }
    }
 }
