package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-05
 * Time: 23:39
 */
class RedCowFarm{
    static class RedCow{
        void speak(){
            System.out.println("我是红牛");
        }
    }
}
class BlackCowFarm{
    public static void main(String[] args) {
        RedCowFarm.RedCow red = new RedCowFarm.RedCow();
        red.speak();
    }
}