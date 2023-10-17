package ex08.sub;

public class Sub1 implements SubListener {

    @Override // 부모의 메소드 재정의
    public void update(String msg) {
        System.out.println("sub1이 받은 알림 : " + msg);
    }

}
