package isp.lab6.exercise2;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestExercise2 {
    VehicleRegistrySystem registry = new VehicleRegistrySystem();
    Vehicle vehicle = new Vehicle("1HGBH41JXMN109186", "1", "Tesla", "3", 2023);
    @Test
    public void testAddVehicle() {
        registry.addVehicle(vehicle);
        assertTrue(registry.containsVehicle("1HGBH41JXMN109186"));
    }

    @Test
    public void testRemoveVehicle() {
        registry.addVehicle(vehicle);
        registry.removeVehicle("1HGBH41JXMN109186");
        assertFalse(registry.containsVehicle("1"));
    }
}
