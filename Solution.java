import java.util.*;

class Vehicle{
    // Member variables
    int range;
    String color;
    int num_of_wheels;
    int mpg;

    // Member function
    void getRange(){
        System.out.println(range);
    }
    void setRange(int newRange){
        range = newRange;
    }

}
class Solution{
    Vehicle mustang = new Vehicle();

    public static void main(String[] args){
        Solution latest = new Solution();
        latest.mustang.setRange(1000);
        latest.mustang.getRange();
    }
}
