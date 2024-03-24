/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-23
 * Time: 20:33*/


public enum TestEnum1 {

    RED(1,"RED"),
    BLACK(2,"BLACK"),
    GREEN(3,"GREEN");


    public String color;
    public int key;


    TestEnum1(int key,String color) {
        this.color = color;
        this.key = key;
    }
    public static TestEnum1 getEnumKey(int key){
        for(TestEnum1 t:TestEnum1.values()){
            if(t.key == key){
                return t;
            }
        }
        return null;
    }
    Enum<>

    public static void main(String[] args) {
        System.out.println(getEnumKey(2));
    }


}
