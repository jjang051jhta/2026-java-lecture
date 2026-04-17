package review.access;

//접근제어자 access modifier
public class Speaker {
    //private < default < protected < public
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }
    void volumnUp() {
        if(volume>=100) {
            System.out.println("볼륨을 더 이상 높일 수 없습니다.");
        } else {
            volume+=10;
            System.out.println("볼륨을 10 증가합니다.");
        }
    }
    void volumnDown() {
        volume-=10;
        System.out.println("volumnDown 호출");
    }
    void showVolumn() {
        System.out.println("현재 볼륨 : "+volume);
    }
}
