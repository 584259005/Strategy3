
public abstract class Duck {
	Flybehavior flybehavior;//ตัวแปรคลาส Flybehavior
	Quackbehavior quackbehavior;//ตัวแปรคลาส Quackbehavior
	void performQuack(){
		quackbehavior.quack();
	}
	void performFly(){
		flybehavior.fly();
	}
	void setFlyBehavior(Flybehavior fb){
		flybehavior = fb;
	}
	void setQuackBehavior(Quackbehavior qb){
		quackbehavior = qb;
	}
	void swim(){
		System.out.println("I'm swimming");
	}
	abstract void display();
}
