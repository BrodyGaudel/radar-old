package org.mounanga.radarservice.commands.command;

import lombok.Getter;

@Getter
public class CreateRadarCommand extends BaseCommand<String> {

    private final Double speedLimit;

    private final String address;

    private final Double longitude;

    private final Double latitude;

    public CreateRadarCommand(String id, Double speedLimit, String address, Double longitude, Double latitude) {
        super(id);
        this.speedLimit = speedLimit;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
