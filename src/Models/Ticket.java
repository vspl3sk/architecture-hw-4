package Models;

import java.util.Date;

/**
 * Модель билета
 */
public class Ticket{
    private long id;
    private Date date;
    private int routeNumber;
    private int zoneStart;
    private int zonaStop;
    private int price;
    private Date timeStart;
    private Date timeStop;
    private boolean isValid;
    private boolean isUsed;
    private int place;


    public Ticket(int routeNumber, int place, int price, Date date, boolean isValid) {
        this.routeNumber = routeNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
    }

    public Date getDate() {
        return date;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public int getPrice() {
        return price;
    }

    public boolean getValid() {
        return isValid;
    }

    public int getPlace() {
        return place;
    }

    public void setZoneStart(int zoneStart) {
        this.zoneStart = zoneStart;
    }

    public void setZoneStop(int zonaStop) {
        this.zonaStop = zonaStop;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    @Override
    public String toString() {
        return "Ticket" +
                " Route Number " + routeNumber +
                ", Place " + place +
                ", Price " + price + " rub." +
                ", Date " + date +
                ", " + (isValid ? "Free" : "Busy");
    }


    public String toPrint() {
        return "Ticket" +
                "\nRoute Number " + routeNumber +
                "\nPlace " + place +
                "\nPrice " + price + "rub." +
                "\nDate " + date;
    }

    @Override
    public int hashCode() {
        return date.hashCode() ^ (routeNumber + place + price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.equals((Ticket) obj);
    }


    public boolean equals(Ticket ticket) {
        boolean isIt = ticket != null
                && ticket.getRouteNumber() == this.routeNumber
                && ticket.getPlace() == this.place
                && ticket.getPrice() == this.price
                && ticket.getDate() == this.date
                && ticket.hashCode() == this.hashCode();

        if (isIt) {
            return true;
        }
        return false;
    }
}
