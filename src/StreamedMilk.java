
public class StreamedMilk extends CondimentDecorator {

	Beverage beverage;
	
	public StreamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Streamed Milk";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
