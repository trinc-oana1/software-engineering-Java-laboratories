package isp.lab5.exercise4;

public class Organizer {
    private String name;
    private String role;
    private String organizerId;
    private String phone;

    public Organizer(String organizerId, String name, String role, String phone)
    {
        this.organizerId = organizerId;
        this.name = name;
        this.role = role;
        this.phone = phone;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setOrganizerId(String organiserId)
    {
        this.organizerId = organizerId;
    }

    public String getOrganizerId()
    {
        return organizerId;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setRole(String role)
    {
        this.role = role;
    }
    public String getRole()
    {
        return role;
    }
}
