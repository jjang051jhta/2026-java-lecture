package ch03;

import java.util.Scanner;

public class ArrayTest {
    static void main() {
        //  array  배열  번호 메기기
        //int num=10;
        //10,20,30,40,50
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 50;
        nums[3] = 45;
        nums[4] = 27;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        //배열은 레퍼런스(참조)
        String[] names = {"장동건", "전지현", "송혜교"};
        String [] actors = names; //sharrow copy
        actors[0] = "하지원";
        names[1] = "김숙";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"==="+actors[i]);
        }
        int a = 10;
        int b = a;
        a = 30; //값을 복사
        System.out.println(a + "===" + b);
    }
}
