package isp.lab7.safehome;

public class TenantNotFoundException extends Exception{
    public TenantNotFoundException()
    {
        super("Tenant not found exception!");
    }
}
