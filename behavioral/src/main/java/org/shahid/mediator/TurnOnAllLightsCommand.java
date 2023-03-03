package org.shahid.mediator;

//concrete command
public class TurnOnAllLightsCommand implements Command {

    private final Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}