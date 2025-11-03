public class PoolTester {

    public static void main(String[] args) {
        Pool pool1 = new Pool();
        Pool pool2 = new Pool("Pool 11", "Julia Waller", 2 ); 
        Pool pool3 = new Pool();
        System.out.println(pool2.toString());
        System.out.println(pool1.equals(pool3));
        PoolUtils.cleanPool(pool3);
        System.out.println(pool3.getCleanlinessLevel());
    }
}
