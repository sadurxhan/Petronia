import java.util.ArrayList;

class RoboPet{
    private String name;
    private String model_number;
    private int battery_level;
	private int competitionCount;
	private int completedActivities;

    //No-argument constructor(Default)
    public RoboPet(){
        name = "test name";
        model_number = "test model";
        battery_level = 100;
		completedActivities = 0;
		System.out.println("This is RoboPet's default constructor");
    }

    //Parameterized constructor
    public RoboPet(String pname, String pmodel_number, int pbattery_level){
		// Validate name
		if(pname == null || pname.trim().isEmpty()){
			this.name = "test name";
			System.out.println("Invalid name. Using default name.");
		}
		else{
			this.name = pname;
		}
		
		//// Validate battery level
		if(pbattery_level < 0 || pbattery_level > 100){
			this.battery_level = 0;
			System.out.println("Invalid battery level. Setting battery to 0.");
		}
		else{
			this.battery_level = pbattery_level;
		}
		
		// Validate model number
		if(pmodel_number == null || pmodel_number.trim().isEmpty()){
            this.model_number = "Test Model";
			System.out.println("Invalid model number. Using default model.");
        }else{
            this.model_number = pmodel_number;
        }
		System.out.println("This is RoboPet constructor with 3 parameter"); 
    }

    // Overloaded constructor. name + model only, battery defaults to 100
    public RoboPet(String pname, String pmodel_number){
        this(pname, pmodel_number, 100);
		System.out.println("This is RoboPet constructor with 2 parameters"); 
    }

    public void setName(String pname){
		if(pname == null || pname.trim().isEmpty()){
            System.out.println("Invalid name. Name was not changed.");
        }
		else{
            this.name = pname;
		}
    }
    
    public String getName(){
        return this.name;
    }

    public void setModelNumber(String pmodel_number){
        if(pmodel_number == null || pmodel_number.trim().isEmpty()){
            System.out.println("Invalid model number. Model number was not changed.");
        }
        else{
            this.model_number = pmodel_number;
        }
    }

    public String getModelNumber(){
        return this.model_number;
    }

    public void setBatteryLevel(int pbattery_level){
        if(pbattery_level >= 0 && pbattery_level <= 100){
            this.battery_level = pbattery_level;
        }
		else{
            System.out.println("Invalid battery level. Battery was not changed.");
        }
    }

    public int getBatteryLevel(){
        return this.battery_level;
    }
	
	public void display(){
		System.out.println("Name: " + getName());
        System.out.println("Model number: " + getModelNumber());
        System.out.println("Battery Level: " + getBatteryLevel());
    }
	
	public void recharge(){
		this.battery_level = 100;
        System.out.println("Battery level is recharged to 100%");
	}
	
	public int getCompetitionCount(){
		return this.competitionCount;
	}
	
	public void increaseCompetitionCount(){
        this.competitionCount++;
    }
	
	public void performActivity(){
		System.out.println("RoboPet is performing an activity.");
    }
	
	public void report(){
    System.out.println("Type: RoboPet | Name: " + getName() + " | Model: " + getModelNumber()
            + " | Battery: " + getBatteryLevel() + " | Completed Activities: " + getCompletedActivities()
			+ " | Competitions: " + getCompetitionCount());
    }
	
	public int getCompletedActivities(){
        return completedActivities;
    }

    public void increaseCompletedActivities(){
        completedActivities++;
    }
}

class RoboDog extends RoboPet{
    private int guardLevel;

    public RoboDog(){
        super(); //Parent class default constructor should execute first
        guardLevel = 0;
		System.out.println("This is RoboDog default constructor");
    }

    public RoboDog(int pguardLevel, String pname, String pmodel_number, int pbattery_level){
        super(pname, pmodel_number, pbattery_level);
        this.guardLevel = pguardLevel;
		System.out.println("This is RoboDog constructor with 4 parameters");
    }
    
	@Override
    public void display(){
		super.display();
        System.out.println("Guard Level: "+ guardLevel);
    }
	
	public void guard(){
		System.out.println("Initial Battery Level: " + getBatteryLevel());
		if(getBatteryLevel() >= 1){
			System.out.println("The Dog: " + getName() + " is currently guarding");
			setBatteryLevel(getBatteryLevel() - 1);
			increaseCompletedActivities();
			System.out.println("Final Battery Level: " + getBatteryLevel());
		}
		else{
			System.out.println("Battery level is low");
	    }
    }
    
    public void compete(){
        if(getBatteryLevel() >= 20){
            setBatteryLevel(getBatteryLevel() - 20);
            increaseCompetitionCount();
            System.out.println("Current Battery Level: " + getBatteryLevel());
        }
        else{
            System.out.println("Battery level is low. Cannot compete");
            
        }
    }
	
	@Override
	public void performActivity(){
		guard();
	}
	
	@Override
    public void report() {
        System.out.println("Type: RoboDog | Name: " + getName() + " | Model: " + getModelNumber()
                + " | Battery: " + getBatteryLevel() + " | Completed Activities: " + getCompletedActivities()
				+ " | Competitions: " + getCompetitionCount());
    }
}

class RoboCat extends RoboPet{
    private double climbHeight;

    public RoboCat(){
        super(); //Parent class default constructor should execute first
        climbHeight = 0;
		System.out.println("This is RoboCat default constructor");
    }

    public RoboCat(double pclimbHeight, String pname, String pmodel_number, int pbattery_level){
        super(pname, pmodel_number, pbattery_level);
        this.climbHeight = pclimbHeight;
		System.out.println("This is RoboCat constructor with 4 para");
    }
    
	@Override
    public void display(){
        super.display();
        System.out.println("Climb Height: "+climbHeight);
    }
	
	public void climb(){
		System.out.println("Initial Battery Level: " + getBatteryLevel());
		if(getBatteryLevel() >= 2){
			System.out.println("The Cat: " + getName() + " is currently climbing");
			setBatteryLevel(getBatteryLevel() - 2);
			increaseCompletedActivities();
			System.out.println("Final Battery Level: " + getBatteryLevel());
		}
		else{
			System.out.println("Battery level is low");
	    }
    }

    public void compete(){
        if(getBatteryLevel() >= 15){
            setBatteryLevel(getBatteryLevel() - 15);
            increaseCompetitionCount();
            System.out.println("Current Battery Level: " + getBatteryLevel());
        }
        else{
            System.out.println("Battery level is low. Cannot compete");
            
        }
    }
	
	@Override
	public void performActivity(){
		climb();
	}
	
	@Override
    public void report() {
        System.out.println("Type: RoboCat | Name: " + getName() + " | Model: " + getModelNumber()
                + " | Battery: " + getBatteryLevel() + " | Completed Activities: " + getCompletedActivities()
				+ " | Competitions: " + getCompetitionCount());
    }
}

class RoboBird extends RoboPet{
    private double flightRange;

    public RoboBird(){
        super(); //Parent class default constructor should execute first
        flightRange = 0;
		System.out.println("This is RoboBird default constructor");
    }

    public RoboBird(double pflightRange, String pname, String pmodel_number, int pbattery_level){
        super(pname, pmodel_number, pbattery_level);
        this.flightRange = pflightRange;
		System.out.println("This is RoboBird constructor with 4 para");
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Flight Range: "+flightRange);
    }
	
	public void fly(){
        if(getBatteryLevel() >= 5){
			setBatteryLevel(getBatteryLevel() - 5);
			increaseCompletedActivities();
            System.out.println("The Bird: " + getName() + " is currently flying");
            System.out.println("Final Battery Level: " + getBatteryLevel());
	    }
        else{
            System.out.println("Battery level is low");
        }
    }

    public void compete(){
        if(getBatteryLevel() >= 25){
            setBatteryLevel(getBatteryLevel() - 25);
            increaseCompetitionCount();
            System.out.println("Current Battery Level: " + getBatteryLevel());
        }
        else{
            System.out.println("Battery level is low. Cannot compete");
            
        }
    }
	
	@Override
	public void performActivity(){
		fly();
	}
	
	@Override
    public void report() {
        System.out.println("Type: RoboBird | Name: " + getName() + " | Model: " + getModelNumber()
                + " | Battery: " + getBatteryLevel() + " | Completed Activities: " + getCompletedActivities()
				+ " | Competitions: " + getCompetitionCount());
    }
}

class PetOwner {
    private String ownerName;
    private ArrayList<RoboPet> pets;
	
    // No-argument constructor
	public PetOwner() {
        this("Test Owner");
    }
	
    public PetOwner(String ownerName){
        this.ownerName = ownerName;
        this.pets = new ArrayList<>();
    }

    public void addPet(RoboPet pet){
        if(pet != null){
            pets.add(pet);
            System.out.println("Pet added successfully for owner " + ownerName);
        }
        else{
            System.out.println("Cannot add a null pet.");
        }
    }

    public void displayPets(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Pets Info:");

        for(RoboPet pet : pets){
            pet.display();
        }
    }
}
 
class RoboFish extends RoboPet{
    private double swimDepth;
 
    public RoboFish(){
        super();
        swimDepth = 0;
        System.out.println("This is RoboFish default constructor");
    }
 
    public RoboFish(double pswimDepth, String pname, String pmodel_number, int pbattery_level){
        super(pname, pmodel_number, pbattery_level);
        this.swimDepth = pswimDepth;
        System.out.println("This is RoboFish constructor with 4 parameters");
    }
 
    public void swim(){
        System.out.println("Initial Battery Level: " + getBatteryLevel());
        if(getBatteryLevel() >= 3){
            System.out.println("The Fish: " + getName() + " is currently swimming");
            setBatteryLevel(getBatteryLevel() - 3);
			increaseCompletedActivities();
            System.out.println("Final Battery Level: " + getBatteryLevel());
        }else{
            System.out.println("Battery level is low");
        }
    }
 
    public void compete(){
        if (getBatteryLevel() >= 18) {
            setBatteryLevel(getBatteryLevel() - 18);
            increaseCompetitionCount();
            System.out.println("Current Battery Level: " + getBatteryLevel());
        } 
		else{
            System.out.println("Battery level is low. Cannot compete");
        }
    }
 
    @Override
    public void performActivity(){
        swim();
    }
 
    @Override
    public void report(){
        System.out.println("Type: RoboFish | Name: " + getName() + " | Model: " + getModelNumber()
                + " | Battery: " + getBatteryLevel() + " | Completed Activities: " + getCompletedActivities() 
				+ " | Competitions: " + getCompetitionCount());
    }
	
	@Override
    public void display(){
        super.display();
		System.out.println("Swim Depth: " + swimDepth);
    }
}
 
class RoboSpider extends RoboPet{
    private int legCount;
 
    public RoboSpider(){
        super();
        legCount = 8;
        System.out.println("This is RoboSpider default constructor");
    }
 
    public RoboSpider(int plegCount, String pname, String pmodel_number, int pbattery_level){
        super(pname, pmodel_number, pbattery_level);
        this.legCount = plegCount;
        System.out.println("This is RoboSpider constructor with 4 parameters");
    }
 
    public void crawl(){
        System.out.println("Initial Battery Level: " + getBatteryLevel());
        if (getBatteryLevel() >= 1){
            System.out.println("The Spider: " + getName() + " is currently crawling");
            setBatteryLevel(getBatteryLevel() - 1);
			increaseCompletedActivities();
            System.out.println("Final Battery Level: " + getBatteryLevel());
        }
		else{
            System.out.println("Battery level is low");
        }
    }
 
    public void compete(){
        if(getBatteryLevel() >= 10) {
            setBatteryLevel(getBatteryLevel() - 10);
            increaseCompetitionCount();
            System.out.println("Current Battery Level: " + getBatteryLevel());
        } 
		else{
            System.out.println("Battery level is low. Cannot compete");
        }
    }
 
    @Override
    public void performActivity(){
        crawl();
    }
 
    @Override
    public void report(){
        System.out.println("Type: RoboSpider | Name: " + getName() + " | Model: " + getModelNumber()
                + " | Battery: " + getBatteryLevel() + " | Completed Activities: " + getCompletedActivities()
				+ " | Competitions: " + getCompetitionCount());
    }
	
	@Override
    public void display(){
        super.display();
		System.out.println("Leg Count: " + legCount);
    }
}
 










