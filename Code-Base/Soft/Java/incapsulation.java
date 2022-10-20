public class incapsulation {

  public static void main(String[] args){

    cars c = new cars("vicky","chocolate",18);

    c.setName("vignesh");
    System.out.println(c.getName().toUpperCase());
    System.out.println(c.getFood());
    System.out.println(c.getAge());
  }
}

public class cars {

  private String name;
  private String food;
  private int age;

  cars(String name,String food,int age){
    this.setName(name);
    this.setFood(food);
    this.setAge(age);
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

}
