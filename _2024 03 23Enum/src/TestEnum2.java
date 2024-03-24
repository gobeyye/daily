/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-23
 * Time: 20:38
 */
public enum TestEnum2 {
    //枚举对象
    RED(1,"RED"),
    BLACK(2,"BLACK"),
    GREEN(3,"GREEN");


    public String color;
    public int ordinal;

    TestEnum2(int ordinal,String color) {
        this.color = color;
        this.ordinal = ordinal;
    }


    /*public static void main2(String[] args) {

        TestEnum[] testEnums = TestEnum.values();
        for (int i = 0; i < testEnums.length; i++) {
            System.out.println(testEnums[i]
                    +" " + testEnums[i].ordinal());
        }
        System.out.println("====");
        TestEnum testEnum = TestEnum.valueOf("GREEN");
        System.out.println(testEnum);
        System.out.println("====");
        System.out.println(RED.compareTo(GREEN));
    }

    public static void main1(String[] args) {
        TestEnum testEnum = TestEnum.RED;
       *//* switch (testEnum) {
            case BLACK :
                System.out.println("BLACK");
                break;
            case RED:
                System.out.println("RED");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;
            default:
        }*//*

    }*/
}
