package structuraldesignpattern;

import structuraldesignpattern.ChickenPizzaDecorator.VegPizzaDecorator;

interface Pizza{
	void makePizza();
	
}
class PlainPizza implements Pizza{

	@Override
	public void makePizza() {
		// TODO Auto-generated method stub
		System.out.println("plain pizza");
	}
	
}
class PizzaDecorator implements Pizza{

	Pizza pizza;
	PizzaDecorator(	Pizza pizza){
		System.out.println("pizza decorator");
		
	}
	

	@Override
	public void makePizza() {
		// TODO Auto-generated method stub
		
	}
	
}
 
class ChickenPizzaDecorator extends PizzaDecorator{

	ChickenPizzaDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	void AddChicken(){
System.out.println("chicken pizza");
	
}
	class VegPizzaDecorator extends PizzaDecorator{

		VegPizzaDecorator(Pizza pizza) {
			super(pizza);
			// TODO Auto-generated constructor stub
		}
		void AddVegetables() {
			System.out.println(" veg pizza");
		}
			
		}
	}


public class DesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza ob=new PlainPizza();
		ob.makePizza();
	//VegPizzaDecorator vg=new VegPizzaDecorator
		

		

	}	

}
