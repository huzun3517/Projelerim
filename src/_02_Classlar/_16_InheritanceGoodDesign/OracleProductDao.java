package _02_Classlar._16_InheritanceGoodDesign;

public class OracleProductDao extends BaseProductDao {

    public OracleProductDao(String connectionString) {
        super(connectionString);
    }

    @Override
    public void add(Product product) {
        System.out.println("Oracle Database: " + product.getName() + " eklendi");
    }
}
