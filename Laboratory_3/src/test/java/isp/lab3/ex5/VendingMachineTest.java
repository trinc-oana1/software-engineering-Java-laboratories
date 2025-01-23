package isp.lab3.ex5;
import isp.lab3.exercise5.VendingMachine;
import org.junit.Test;

public class VendingMachineTest {
    VendingMachine vm = new VendingMachine();

    @Test
    public void testDisplayProducts()
    {
        System.out.println("Displaying Products:");
        vm.displayProducts();
    }
    @Test
    public void testInsertCoin()
    {
        System.out.println("\nInserting Coins:");
        vm.insertCoin(25);
        vm.insertCoin(10);
        vm.displayCredit();
    }
    @Test
    public void testSelectProduct()
    {
        System.out.println("\nSelecting Product:");
        vm.selectProduct(2);

    }

}



