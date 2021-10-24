import java.util.HashMap;
import java.util.Map;

public class DataDao {
    private static final Map<String, AbstractUser> mapUser = new HashMap<>();

    static {
        initMapUsers();
    }

    private static void initMapUsers() {
        AbstractUser admin = new Admin(1, "admin", "222", "Alex", 25, SecurityConfig.ROLE_ADMIN);
        AbstractUser teacher_01 = new Teacher(2, "teacherMath", "111", "Vladimir", 45, SecurityConfig.ROLE_TEACHER, 800);
        AbstractUser teacher_02 = new Teacher(3, "teacherBio", "111", "Olga", 42, SecurityConfig.ROLE_TEACHER, 800);
        AbstractUser student_01 = new Student(4, "student1", "111", "Marvel", 15, SecurityConfig.ROLE_STUDENT, 88);
        AbstractUser student_02 = new Student(5, "student2", "111", "Sam", 15, SecurityConfig.ROLE_STUDENT, 88);
        AbstractUser student_03 = new Student(6, "student3", "111", "Tom", 15, SecurityConfig.ROLE_STUDENT, 88);
        AbstractUser student_04 = new Student(7, "student4", "111", "Fill", 15, SecurityConfig.ROLE_STUDENT, 88);

        mapUser.put(admin.getLogin(), admin);
        mapUser.put(teacher_01.getLogin(), teacher_01);
        mapUser.put(teacher_02.getLogin(), teacher_02);
        mapUser.put(student_01.getLogin(), student_01);
        mapUser.put(student_02.getLogin(), student_02);
        mapUser.put(student_03.getLogin(), student_03);
        mapUser.put(student_04.getLogin(), student_04);
    }

    public static AbstractUser finsUser(String login, String password) {
        AbstractUser user = mapUser.get(login);
        if (user != null && user.getPassword().equals(password))
            return user;
        else
            return null;
    }
}
