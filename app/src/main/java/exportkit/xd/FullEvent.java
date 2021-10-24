package exportkit.xd;

public class FullEvent {
    public FullEvent(int index, Event event) {
        this.index = index;
        this.event = event;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    private int index;
    private Event event;

}
