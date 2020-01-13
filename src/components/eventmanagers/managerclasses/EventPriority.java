package components.eventmanagers.managerclasses;

public enum EventPriority {
	LOWEST(0),
    LOW(1),
    NORMAL(2),
    HIGH(3),
    HIGHEST(4);
    
    private final int priority;

    private EventPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
