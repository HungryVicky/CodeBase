//interface
public class interface {

  public static void main(String[] args)
  {
    hawk h = new hawk();
    h.hunt();
    rabbit r = new rabbit();
    r.flee();
    fish f = new fish();
    f.hunt();
    f.flee();
    
    
  }
}
public class fish implements prey,predator {
  @Override
  public void flee(){
    System.out.println("small fish flee");
  }
  @Override
  public void hunt(){
    System.out.println("big fish is hunting");
  }

}
public class hawk implements predator{
  @Override
  public void hunt() {
    System.out.println("*Hawk is hunting*");
  }
}
public class rabbit implements prey{

  @Override
  public void flee() {
    System.out.println("rabbit is flee");
  }
}
public interface prey {

  void flee();
}
public interface predator {

  void hunt();
}

