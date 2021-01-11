package animol;

public class Dog extends Animol{
    String d="狗",h;
    Dog(String b){
        h=b;
    }
    @Override
    public void bark() {
        System.out.println(d+"叫声："+h);
    }
}
