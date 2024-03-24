/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-23
 * Time: 20:24
 */
public enum TestEnum {
    RED,BLACK,GREEN,WHITE;

    public static void main(String[] args) {
        TestEnum[] testEnum2 = TestEnum.values();
        for(int i = 0;i < testEnum2.length;i++){
            System.out.println(testEnum2[i] + " " + testEnum2[i].ordinal());
        }
        System.out.println("==================");
        System.out.println(TestEnum.valueOf("GREE"));
    }
    public static void main1(String[] args){
        TestEnum testEnum1 = TestEnum.BLACK;
        switch(testEnum1){
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case WHITE:
                System.out.println("white");
                break;
            case GREEN:
                System.out.println("green");
            default:
                break;
        }
    }
}
