package isp.lab7.safehome;
import java.util.Objects;

public class AccessKey {
    private String pin;
    public AccessKey(String pin)
    {
        this.pin = pin;
    }

    public String getPin() {return pin;}
    public void setPin(String pin) {this.pin = pin;}

    public boolean equals(Object obj)
    {
        if(obj!=null && obj instanceof AccessKey)
        {
            AccessKey test=(AccessKey) obj;
            if(pin.equals(test.pin))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "AccessKey{" +
                "pin='" + pin + '\'' +
                '}';
    }
}
