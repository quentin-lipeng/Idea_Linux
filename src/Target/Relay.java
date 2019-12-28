package Target;

public class Relay {

  public static void main(String[] args) {
    int a = 1;
    add(a);
    Koo koo =new Koo();
    add(koo);
    //基本类型的引用值(地址)传递
    System.out.println(a+ ","+ koo.a);
    //引用类型数据传递
    System.out.println(koo);
  }
  public static int add(int a){
    a++;
    return a;
  }
  public static int add(Koo koo){
    Koo k = koo;
    k.a++;
    return koo.a;
  }

}
class Koo {
  int a =1;

}
