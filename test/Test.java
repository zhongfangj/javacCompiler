package cn.com.servyou.sbf.thirdparty.dj.dwJfmsRd;

public class Test {


    public static void main(String[] args) {
        Test test = new Test();
        test.test();

    }
    

    private  void test(){
        synchronized (this){
            int a = 3;
            int b = 5;
            int c = (a+b)*b;
        }
    }
}
