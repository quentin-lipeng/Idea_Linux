class Person{
  protected  String name  ;  //定义文本类型属性 name
  protected int age;
  protected String sex;
  public Person()   {     //问题显示的定义无参数构造函数
    System.out.println("Person无参构造函数。");
  }

  public Person(String name, int age)   {//定义重载构造函数，传入两个参数name和 age初始化成员变量；
    this();      //调用无参构造函数
    System.out.println("Person两个参数构造函数");
    this.name = name;
    this.age = age;
  }

  public void work() {
    System.out.println("我的工作是：码农");
  }
}

/**
 * 定义学生类
 * @author Administrator
 *
 */
class Student extends Person    { //定义Student类继承 Person
  public Student(){
    super() ; //显示调用父类无参构造函数
  }

  public Student(String name, int age)	{
    super(name, age);//显示调用父类带参数构造函数
    super.sex = null ;//初始化属性 sex 为 null
  }

  public void setName(String name) {
    super.name = name  ;//设置name属性
  }

  public String getName(){
    return super.name;//返回成员属性 name
  }

  public void work()  	{//重写父类中work函数
    System.out.println("我的工作是：学习");
  }

  public void toExam() {
    System.out.println("我是学生，我要考试。");
  }
}
/**
 * 定义测试类，测试 Student类
 * @author Administrator
 *
 */
public class TestExtend {
  public static void main(String[] args) {
    Student stu = new Student();//创建Student实例
    stu.work();//调用实例对象的work行为

    Person per =  new Student("马云",18);//补充创建Studnet实例,name:马云，age：18，使Person引用指向Studnet实例
    if(per instanceof  Student) { //补充完成使判断是否是 Student 实例
      ( (Student)per).toExam();   //补充括号中内容，使可以调用toExam函数
    }
  }

}