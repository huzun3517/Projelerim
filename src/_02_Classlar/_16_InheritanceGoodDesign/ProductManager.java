package _02_Classlar._16_InheritanceGoodDesign;

public class ProductManager {

    private BaseProductDao baseProductDao;

    public ProductManager(BaseProductDao baseProductDao) {
        this.baseProductDao = baseProductDao;
    }

    public void add(Product product) {

        baseProductDao.add(product);

        System.out.println("Ürün İş katmanı işlemleri");
        System.out.println("Ürün İsmi: " + product.getName());

    }
}
