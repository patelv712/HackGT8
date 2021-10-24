package exportkit.xd;

public class Event {
    /* Each data field related to one event. */
    private String eventName;
    private String dateString;
    private int timeStart;
    private int timeEnd;
    private String location;

    private String affiliation;
    private String notifCategory;
    private String type;
    private String description;
    private int maxCapacity;
    private boolean hasWaitlist;
    private int waitlistCapacity;
    private boolean hasRSVP;
    private double priceOfAdmission;

    public Event(String eventName, String dateString, int timeStart, int timeEnd, String location, String affiliation, String notifCategory, String type, String description, int maxCapacity, boolean hasWaitlist, int waitlistCapacity, boolean hasRSVP, double priceOfAdmission) {
        this.eventName = eventName;
        this.dateString = dateString;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.location = location;
        this.affiliation = affiliation;
        this.notifCategory = notifCategory;
        this.type = type;
        this.description = description;
        this.maxCapacity = maxCapacity;
        this.hasWaitlist = hasWaitlist;
        this.waitlistCapacity = waitlistCapacity;
        this.hasRSVP = hasRSVP;
        this.priceOfAdmission = priceOfAdmission;
    }

    /* From here to the end of the file contains just setters and getters if necessary. The setters include
    condition checks to make sure that the value makes sense. */

    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public int getTimeStart() {
        return timeStart;
    }
    public void setTimeStart(int timeStart) {
        if (timeStart >= 0000 && timeStart <= 2400) {
            this.timeStart = timeStart;
        }
    }

    public int getTimeEnd() {
        return timeEnd;
    }
    public void setTimeEnd(int timeEnd) {
        if (timeEnd >= 0000 && timeEnd <= 2400) {
            this.timeEnd = timeEnd;
        }
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getAffiliation() {
        return affiliation;
    }
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getNotifCategory() {
        return notifCategory;
    }
    public void setNotifCategory(String notifCategory) {
        this.notifCategory = notifCategory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        if (description.length() <= 750) {
            this.description = description;
        }
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        if (maxCapacity > 0) {
            this.maxCapacity = maxCapacity;
        }
    }

    public boolean getHasWaitlist() {
        return hasWaitlist;
    }
    public void setHasWaitlist(boolean hasWaitlist) {
        this.hasWaitlist = hasWaitlist;
        if (this.hasWaitlist && waitlistCapacity == 0) {
            this.waitlistCapacity = 1;
        }
    }

    public int getWaitlistCapacity() {
        return waitlistCapacity;
    }
    public void setWaitlistCapacity(int waitlistCapacity) {
        if (waitlistCapacity >= 0) {
            this.waitlistCapacity = waitlistCapacity;
        }
        if (this.waitlistCapacity == 0) {
            this.hasWaitlist = false;
        } else if (this.waitlistCapacity > 0) {
            this.hasWaitlist = true;
        }
    }

    public boolean getHasRSVP() {
        return hasRSVP;
    }
    public void setHasRSVP(boolean hasRSVP) {
        this.hasRSVP = hasRSVP;
    }

    public double getPriceOfAdmission() {
        return priceOfAdmission;
    }
    public void setPriceOfAdmission(double priceOfAdmission) {
        if (priceOfAdmission >= 0) {
            this.priceOfAdmission = priceOfAdmission;
        }
    }

}

