import java.util.ArrayList;
import java.util.List;

public class SafeCar {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Maria", "Papadopoulou", "2310264368", "maria.papadopoulou@gmail.com", "AO79432"));
        customers.add(new Customer("Evanthia", "Papagianni", "2310245368", "evanthia.papagianni@gmail.com", "AO77813"));
        customers.add(new Customer("Vasilis", "Karagiannis", "2310245668", "ioannis.karagiannis@gmail.com", "AO45698"));


        List<Vehicle> vehicles = new ArrayList<>();
    
        vehicles.add(new Vehicle("Mercedes", "GLC", "XKP8923", "2020", "7C3FR76A515072256"));
        vehicles.add(new Vehicle("Subaru", "Forester", "NII4269", "2018", "7C3FR76A555071465"));
        vehicles.add(new Vehicle("Ford", "Ranger", "KOH4681", "2022", "7C3FR76A55504645"));
    
        List<InsurancePolicy> InsurancePolicies = new ArrayList<>();
        InsurancePolicies.add(new InsurancePolicy("MI93", "Miktiasfalisi", "6"));
        InsurancePolicies.add(new InsurancePolicy("B56", "Basiki asfalisi", "6"));
        InsurancePolicies.add(new InsurancePolicy("O58", "Me odiki", "6"));
        
        List<InsuranceContract> InsuranceContracts = new ArrayList<>();
        InsuranceContracts.add(new InsuranceContract(Customer1, Vehicle1, InsurancePolicy2, 60.0));
        InsuranceContracts.add(new InsuranceContract(Customer2, Vehicle2, InsurancePolicy1, 120.0));
        InsuranceContracts.add(new InsuranceContract(Customer2, Vehicle3, InsurancePolicy3, 80.0));
        
        
        
}
}