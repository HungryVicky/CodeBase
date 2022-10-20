public class copyObject {

  public static void main(String[] args){

    cars c1 = new cars("vicky","chocolate",18);
    //cars c2 = new cars("vignesh","5 star",20);
    cars c2 = new cars(c1);
    //c2.copy(c1);

    System.out.println(c1.getName());
    System.out.println(c1.getFood());
    System.out.println(c1.getAge());

    System.out.println(c2.getName());
    System.out.println(c2.getFood());
    System.out.println(c2.getAge());
  }
}
  private String name;
  private String food;
  private int age;

  cars(String name,String food,int age){
    this.setName(name);
    this.setFood(food);
    this.setAge(age);
  }

  cars(cars x){
    this.copy(x);
  }
  public void setName(String name){
    this.name = name;
  }
  public void setFood(String food){
    this.food = food;
  }

  public void setAge(int age){
    this.age = age;
  }
  public String getName(){
    return name;
  }
  public String getFood(){
    return food;
  }
  public  int getAge(){
    return  age;
  }
  public void copy(cars x){
    this.setName(x.getName());
    this.setFood(x.getFood());
    this.setAge(x.getAge());
  }

}