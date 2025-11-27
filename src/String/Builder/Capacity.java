package String.Builder;

public class Capacity {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("kdavhlhredvbhjksDMSSSSSSNvmcmvc");
        System.out.println(s1.capacity());

        //if we want suddenly icrease capacity
        s1.ensureCapacity(200);
        System.out.println(s1.capacity());
    }
}
