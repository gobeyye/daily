import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
class Student {
    //私有属性name
    private String name = "gobeyye";
    //公有属性age
    public int age = 18;
    //不带参数的构造方法
    public Student(){
        System.out.println("Student()");
    }
    private Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String,name)");
    }
    private void eat(){
        System.out.println("i am eat");
    }
    public void sleep(){
        System.out.println("i am pig");
    }
    private void function(String str) {

        System.out.println(str);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Main {
    public static void reflectPrivateMethod(){
        try{
            Class<?> classStudent = Class.forName("Student");
            Method methodStudent = classStudent.getDeclaredMethod("function", String.class);
            methodStudent.setAccessible(true);
            Object objectStudent = classStudent.newInstance();
            Student student = (Student)objectStudent;
            methodStudent.invoke(student,"hehehehe");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        reflectPrivateMethod();
    }
    public static void reflectPrivateConstructor(){
        try{
            Class<?> classStudent = Class.forName("Student");
            Constructor<?> declaredConstructorStudent = classStudent.getDeclaredConstructor(String.class,int.class);
            declaredConstructorStudent.setAccessible(true);
            Object objectStudent = declaredConstructorStudent.newInstance("go",20);
            Student student = (Student)objectStudent;
            System.out.println(student);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }






    public static void reflectNewInstance(){
        try{
            Class<?> studentClass = Class.forName("Student");
            Object objectStudent = studentClass.newInstance();
            Student student = (Student)objectStudent;
            System.out.println(student);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }


}











class B{
    public static void main2(String[] args) {
        Student s1 = new Student();
        //第一种
        Class c1= s1.getClass();
        //第二种
        Class c2 = Student.class;
        //第三种
        Class c3 = null;
        try{
            c3 = Class.forName("Student");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);
    }
}