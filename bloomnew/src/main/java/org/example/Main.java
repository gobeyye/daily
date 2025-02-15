package org.example;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    private static int size = 1000000;//预计要插入多少数据

    private static double fpp = 0.01;//期望的误判率

    private static Object Funnels;
    private static BloomFilter<Integer> bloomFilter;

    static {
        bloomFilter = BloomFilter.create(Funnels.integerFunnel(), size, fpp);
    }

    public static void main(String[] args) {
        //插入数据
        for (int i = 0; i < 1000000; i++) {
            bloomFilter.put(i);
        }
        int count = 0;
        for (int i = 1000000; i < 2000000; i++) {
            if (bloomFilter.mightContain(i)) {
                count++;
                System.out.println(i + "误判了");
            }
        }
        System.out.println("总共的误判数:" + count);
    }

}