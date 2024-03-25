package demo88;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-25
 * Time: 17:16
 */
class PC{
    CPU cpu;
    HardDisk HD;
    void setCPU(CPU c){
        this.cpu = c;
    }
    void setHardDisk(HardDisk h){
        this.HD = h;
    }
    void show(){
        System.out.println("CPU的速度：" + cpu.getSpeed());
        System.out.println("硬盘的容量：" + HD.getAmount());
    }


}
class CPU{
    int speed;
    void setSpeed(int m){
        this.speed = m;
    }
    int getSpeed(){
        return speed;
    }

}
class HardDisk{
    int amount;
    void setAmount(int m){
        this.amount = m;
    }
    int getAmount(){
        return amount;
    }

}
public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2200);
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}
