public class Animal {
	
  private String sound = "Animal Sound";
  
  public Animal(){
  }

  Animal(String _sound){
    this.sound = _sound;
  }

  public String makeSound(){
    return sound;
  }
}
