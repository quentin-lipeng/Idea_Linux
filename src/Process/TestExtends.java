package Process;


public class TestExtends{

  public static void main(String[] args) {
    Student stu = new Student();
    stu.work();

    Person per = new Student("马",19);

    if(per instanceof  Student) {
      ((Student)per).toExam();
    }
  }
}

 class Person {
  protected String name;
  protected int age;
  protected String sex;
  public Person() {
    System.out.println("Person 无参构造方法");
  }

  public Person(String name, int age) {
    this();
    System.out.println("Person两个参数构造方法");
    this.name = name;
    this.age = age;
  }

  public void work() {
    System.out.println("我的工作是：码农");
  }

  class Student extends Person {
    public Student() {
      super();
    }

    public Student (String name, int age) {
      super(name,age);
      super.sex = null;
    }

    public void setName(String name) {
      super.name = name;
    }

    public String getName() {
      return super.name;
    }

    public void work() {
      System.out.println("我的工作是：学习");
    }

    public void toExam() {
      System.out.println("我是学生，我要考试");
    }


  }

}
class Student extends Person { //定义Student类继承 Person
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
