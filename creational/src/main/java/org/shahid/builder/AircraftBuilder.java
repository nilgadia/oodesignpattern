package org.shahid.builder;

public interface AircraftBuilder {

    void buildEngine();

    void buildWings();

    void buildCockpit();

    void buildBathrooms();

    IAircraft getResult();
}