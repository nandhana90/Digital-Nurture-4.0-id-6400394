package BuilderPattern;


	public class Main {
	    public static void main(String[] args) {
	        Computer gamingPC = new ComputerBuilder()
	                .setCPU("Intel i9")
	                .setRAM("32GB")
	                .setStorage("1TB SSD")
	                .setType(ComputerType.GAMING)
	                .build();

	        System.out.println("=== Gaming PC ===");
	        System.out.println("CPU: " + gamingPC.getCPU());
	        System.out.println("RAM: " + gamingPC.getRAM());
	        System.out.println("Storage: " + gamingPC.getSTORAGE());
	        System.out.println("Type: " + gamingPC.getType());

	        Computer officePC = new ComputerBuilder()
	                .setCPU("Intel i5")
	                .setRAM("16GB")
	                .setStorage("512GB SSD")
	                .setType(ComputerType.PERSONAL)
	                .build();

	        System.out.println("\n=== Office PC ===");
	        System.out.println("CPU: " + officePC.getCPU());
	        System.out.println("RAM: " + officePC.getRAM());
	        System.out.println("Storage: " + officePC.getSTORAGE());
	        System.out.println("Type: " + officePC.getType());
	    }
	}


