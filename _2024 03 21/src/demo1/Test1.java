package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-21
 * Time: 22:42
 */
class Message<T>{
    private T message;
    public T getMessage(){
        return message;
    }
    public void setMessage(T message){
        this.message = message;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Message<String> message = new Message<>();
        Test1 in = new Test1();
        message.setMessage("afdlsfa");
        in.fun(message);
    }
    public static void fun(Message<? extends String> temp){
        System.out.println(temp.getMessage());
    }
}
