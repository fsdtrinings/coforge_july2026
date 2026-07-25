package p1;

public interface BusinessRequest {
	
	public void doTaskWithProduct(ElectronicProduct p);

}

class DevelopersCode implements BusinessRequest
{

	@Override
	public void doTaskWithProduct(ElectronicProduct p) {
		
		p.switchOn();
		
	}
	
}
