class Students {
    public void studentsGrades(){
        System.out.println("Grade A: 1st class");
    }
}
class Techs extends Students {
    public void studentsGrades() {
        super.studentsGrades();
        System.out.println("The Students said congratulations");
    }
}
public class SuperKeyWord {
    public static void main(String[]args) {
        Techs proTechs = new Techs();
        proTechs.studentsGrades();
    }
}
