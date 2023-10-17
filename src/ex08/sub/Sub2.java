package ex08.sub;

public class Sub2 implements SubListener {

    @Override // 부모의 메서드 재정의
    public void update(String msg) {
        System.out.println("sub가 받은 알림 : " + msg);
    }

}
