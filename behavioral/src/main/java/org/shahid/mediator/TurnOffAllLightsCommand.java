package org.shahid.mediator;

//concrete command
public class TurnOffAllLightsCommand implements Command {

    private final Mediator med;

    public TurnOffAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}