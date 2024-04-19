package model.entities;

import java.time.LocalDateTime;

public class CarRental {
    private LocalDateTime start;
    private LocalDateTime fisish;
    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(){}

    public CarRental(LocalDateTime start, LocalDateTime fisish, Vehicle vehicle, Invoice invoice) {
        this.start = start;
        this.fisish = fisish;
        this.vehicle = vehicle;
        this.invoice = invoice;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFisish() {
        return fisish;
    }

    public void setFisish(LocalDateTime fisish) {
        this.fisish = fisish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
