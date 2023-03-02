public class Main_T1V1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Mouse", "Mickey");

        student1.setFirstName("Donald");
        student1.setLastName("Duck");
        student1.setId(330);
        student1.setBachelorCredits(55);
        student1.setMasterCredits(14);
        student1.setTitleOfBachelorThesis("Bachelor thesis title");
        student1.setStartYear(2020);
        student1.setGraduationYear(2021);

        student2.setBachelorCredits(5);
        student2.setId(4);
        student2.setTitleOfBachelorThesis(null);

//        System.out.println(student1);
//        System.out.println(student2);

        student2.setBachelorCredits(293.0);
        student2.setMasterCredits(151.0);
        student2.setTitleOfMastersThesis( "Master's thesis title" );

        System.out.println(student2);
    }

}