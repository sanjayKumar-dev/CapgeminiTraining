import java.util.Date;

public class Question4 {
	public static void main(String[] args) {
        pair<String, String> object = new pair<String, String>("1","Hello");
        System.out.println(object.getObj1()+" = "+object.getObj2());
        
        Date objc=new Date();
        pair<String, java.util.Date> object1 = new pair<String,java.util.Date> ("1",objc);
        System.out.println(object1.getObj1()+" = "+object1.getObj2());

    }
}
class pair<K,V>{
    private K obj1;
    private V obj2;

    public pair(K obj1,V obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    public K getObj1() {
        return obj1;
    }
    public V getObj2() {
        return obj2;
    }

}