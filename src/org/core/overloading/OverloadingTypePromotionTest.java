package org.core.overloading;




public class OverloadingTypePromotionTest {
    public  void m1(int x){
        System.out.println("int arg");
    }
    public  void m1(float f){
        System.out.println("float -arg");
    }

    public static void main(String[] args) {
        OverloadingTypePromotionTest test=new OverloadingTypePromotionTest();
       //  fundamental.m1(10.00);
//        fundamental.m1(10.02f);
       // fundamental.m1('v');
    }
}
