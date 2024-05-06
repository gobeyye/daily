/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-06
 * Time: 23:22
 */
interface DogState {
    public void showState();
}
class SoftlyState implements DogState {
//    【代码1】 //重写public void showState()

    @Override
    public void showState() {
        System.out.println("在主人面前，听主人的命令");
    }
}
class MeetEnemyState implements DogState {
//    【代码2】 //重写public void showState()

    @Override
    public void showState() {
        System.out.println("遇到敌人狂叫，并冲向去咬敌人");
    }
}
class MeetFriendState implements DogState {
//    【代码3】 //重写public void showState()

    @Override
    public void showState() {
        System.out.println("遇到朋友晃动尾巴，表示欢迎");
    }
}
class Dog {
    DogState  state;
    public void cry() {
        state.showState();
    }
    public void setState(DogState s) {
        state = s;
    }
}
public class E {
    public static void main(String args[]) {
        Dog yellowDog =new Dog();
        yellowDog.setState(new SoftlyState());
        yellowDog.cry();
        yellowDog.setState(new MeetEnemyState());
        yellowDog.cry();
        yellowDog.setState(new MeetFriendState());
        yellowDog.cry();
    }
}

