/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-25
 * Time: 16:51
 */
class Fish{
    int weight = 1;
}
class Lake{
    Fish fish;
    void setFish(Fish s){
        fish = s;
    }
    void foodFish(int m){
        fish.weight = fish.weight + m;
    }
}
public class E {
    public static void main(String[] args) {
        Fish redFish = new Fish();
        System.out.println(redFish.weight);
        Lake lake = new Lake();
        lake.setFish(redFish);
        lake.foodFish(120);
        System.out.println(redFish.weight);
        System.out.println(lake.fish.weight);
    }
}
