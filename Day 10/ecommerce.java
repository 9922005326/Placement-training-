// Smart home --> interface{double readvalue();String getSensorType()}
// cloud storage providers interface{void uploadfiles(String filename, int size)}
// NotificationSystem --> interface{void SendNotification(String recipient, String message)}

interface SmartHome{
    boolean temperature(double readvalue);
    String getSensorType(String sensortype);
}

class AC implements SmartHome{
    public boolean temperature(double readvalue){
        System.out.println("Temperature: "+readvalue+"*c");
        return true;
    }
    public String getSensorType(String sensortype){
        System.out.println("Sensor type: "+sensortype);
        return sensortype;
    }
}

public class ecommerce {
    public static void main(String[] args) {
        AC a = new AC();
        a.temperature(35.3);
        a.getSensorType("Temperature Sensor, Motion Sensor");
    }
}
