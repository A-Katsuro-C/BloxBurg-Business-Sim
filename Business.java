class Business{
    private String name;
    private String owner;
    private double funds;
    private static int totalBusinesses = 0;
    public static final double TAX_RATE = 0.1;
 
    Business(String busName, String busOwner, double busFunds) {
        this.name = busName;
        this.owner = busOwner;
        this.funds = busFunds;
        totalBusinesses++;
    }
    
    Business(String busName, double busFunds){
        this(busName, "", busFunds);
    }
    
    Business(String busName){
        this(busName, "", 0.0);
    }
 
    public void setTaxes() {
        funds -= funds * TAX_RATE;
    }
    
    public double getTaxes() {
        
        return funds;
    }
    
    public String getBusName(){
        return name;
    }
    public String getOwnerName(){
        return owner;
    }
    
    public double currentFunds(){
        return funds;
    }
    
    public int getTotalBus(){
        return totalBusinesses;
    }
 
    class Employee {
        private String name;
        private String role;
        private double salary;
 
        Employee(String name, String role, double salary) {
            this.name = name;
            this.role = role;
            this.salary = salary;
        }
        
        Employee(String name){
            this(name, "", 0.0);
        }
        
        public String getEmpName(){
            return name;
        }
        
        public String getRole(){
            return role;
        }
        
        public double getSalary(){
            return salary;
        }
    }
}