package system;

public class Desktop extends Computer {
	
    public void desktopSize() {
		System.out.println("10-15");
	}
    
    public static void main(String[] args) {
		Desktop specs=new Desktop();
		specs.computerModel();
		specs.desktopSize();
	}
}

