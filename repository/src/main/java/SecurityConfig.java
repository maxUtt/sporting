import java.util.*;

public class SecurityConfig {
    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_TEACHER = "TEACHER";
    public static final String ROLE_STUDENT = "STUDENT";

    private static final Map<String, List<String>> mapSecurityConfig = new HashMap<>();

    static {
        initUsers();
    }

    private static void initUsers() {
        List<String> urlAdmin = new ArrayList<>();
        urlAdmin.add("/userInfo");
        urlAdmin.add("/admin");
        mapSecurityConfig.put(ROLE_ADMIN, urlAdmin);
        List<String>urlTeacher = new ArrayList<>();
        urlTeacher.add("/userInfo");
        urlTeacher.add("/teacher");
        mapSecurityConfig.put(ROLE_TEACHER, urlTeacher);
        List<String>urlStudent = new ArrayList<>();
        urlStudent.add("/userInfo");
        urlStudent.add("/student");
        mapSecurityConfig.put(ROLE_STUDENT, urlStudent);
    }

    public static Set<String> getRoleUsers() {
        return mapSecurityConfig.keySet();
    }

    public static List<String> getUrlUserForRole(String urlUser){
        return mapSecurityConfig.get(urlUser);
    }
}
