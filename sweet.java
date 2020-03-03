package epam.Newyear;

public class sweet extends Yummysweets {
		@Override
		void setWeight(double weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
		}
		double calcWeight (int numOfSweets) {
		return numOfSweets * weight;
}
}