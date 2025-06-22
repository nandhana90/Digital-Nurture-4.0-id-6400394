package BuilderPattern;



	public class ComputerBuilder {
	    private String cpu;
	    private String ram;
	    private String storage;
	    private ComputerType type;

	    public ComputerBuilder setCPU(String cpu) {
	        this.cpu = cpu;
	        return this;
	    }

	    public ComputerBuilder setRAM(String ram) {
	        this.ram = ram;
	        return this;
	    }

	    public ComputerBuilder setStorage(String storage) {
	        this.storage = storage;
	        return this;
	    }

	    public ComputerBuilder setType(ComputerType type) {
	        this.type = type;
	        return this;
	    }

	    public Computer build() {
	        return new Computer(cpu, ram, storage, type);
	    }
	}


