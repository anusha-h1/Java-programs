class car {
    int cost;              
    String modelName;      
    String type = "Petrol"; 
    public static void main(String args[]) {
        car c1 = new car();
        c1.cost = 800000;
        c1.modelName = "Suzuki Swift";
        System.out.println("car Model: " + c1.modelName);
        System.out.println("car Cost: " + c1.cost);
        System.out.println("car Type: " + c1.type);
    }
}