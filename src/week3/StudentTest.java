package week3;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Olja";
        student1.age = 25;
        student1.phone = "0935550855";
        student1.sex = "Female";
        student1.weight = 50;

        Student student2 = new Student();
        student2.name = "Kolja";
        student2.age = 35;
        student2.phone = "0675550855";
        student2.sex = "Male";
        student2.weight = 80;

//        Student[] group


    Student[] group = new Student[2];
        group[0] = student1;
        group[1] = student2;

        for (int i = 0; i < group.length; i++){
            group[i].sayInfo();
        }
    }
}
