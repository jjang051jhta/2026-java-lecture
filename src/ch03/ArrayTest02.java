package ch03;

public class ArrayTest02 {
    static void main() {
        String [] names = new String[3];
        names[0] = "전지현";
        names[1] = "송혜교";
        names[2] = "김태희";

        String [] actors = {"장동건","이병헌","송강호"}; //배열 선언과 동시에 할당
        int [] nums = {10,30,27,98,102,121,21212,2121,121,212,2,12,1,214,3,424324,32,4343554,3543};
        int max = nums[0];
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("제일 큰 숫자는 "+max);
        //enhanced for  for each
        for(String actor:actors) {
            System.out.println(actor);
        }
        enum Week {월,화,수,목,금,토,일};  //   enum  열거형
        //Week.values = [월,화,수,목,금,토,일]
        //System.out.println(Week.values()[0]);
        for(Week day:Week.values()) {
            System.out.println(day);
        }
    }
}
