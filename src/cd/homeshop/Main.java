package cd.homeshop;

public class Main {
    public static void main(String[] args){
        Product machineCafe = new Product("Philips","Philipps Senseo,Noir-1 ou 2 tasses",79.99);
        Television tv = new Television("TV Samsung","TV Led Ecran incurvé",179.99,49,"LED");
        Fridge fridge = new Fridge("BENQ TSE","Refrégirateur Benq 130L",182,130,false);
        Customer customer = new Customer("Christian Di Iorio","Rue darreire");
    }
}
