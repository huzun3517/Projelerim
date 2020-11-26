package _02_Classlar._16_InheritanceGoodDesign;

public class Test {

    public static void main(String[] args) {

       ProductManager productManager = new ProductManager(new MySqlProductDao("MySql String"));

       productManager.add(new Product(2,"Çikolota",5));

       







    }
}
