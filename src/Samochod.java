public class Samochod {
	  
  public void marka(String marka) {
    System.out.println("Marka to: " +marka);
  }

  
  public void model(String model ) {
    System.out.println("Model to: " +model);
  }

  public void rokProdukcji(int rokProdukcji) {
	  System.out.println("Rok produkcji to:" +rokProdukcji);
  }

  public static void main(String[] args) {

    Samochod Ford = new Samochod();    
	Ford.marka("Ford");
	Ford.model("Focus");
	Ford.rokProdukcji(1999);

    Samochod Toyota = new Samochod();
    	Toyota.marka("Toyota");
	Toyota.model("Corolla");
	Toyota.rokProdukcji(1986);

  }

}
