public class Operation {

  public static void main(String[] args) {
    //SymbolOr();
    SymbolAdd();

  }
  static void SymbolAdd() {
    int x,y=10;
    //逻辑运算符& 与
    if ((x=0)==0 && (y=20)==20) {
      System.out.println("现在y是"+y);
    }
    int a,b=10;
    //位运算或&
    if ((a=0)==0 & (b=20)==20) {
      System.out.println("现在b是"+b);
    }
    System.out.println("over!");
  }
//  static void SymbolOr(){
//    int x,y=10;
//    //逻辑运算符或|| 也称短路或 当@(x=0)==0 为true为真时
//    // 就不执行后面的条件
//    if ((x=0)==0 || (y=20)==20) {
//      System.out.println("现在y是"+y);
//    }
//    int a,b=10;
//    //位运算或| 就算前面为真也会继续执行
//    if ((a=0)==0 | (b=20)==20) {
//      System.out.println("现在b是"+b);
//    }
//    System.out.println("over!");
//
//  }

}
