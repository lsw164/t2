package animol;

public class Cat extends Animol{
String c="猫",k;
Cat(String g){
    k=g;
}
    @Override
    public void bark() {
        System.out.println(c+"的叫声："+k);
    }
}
