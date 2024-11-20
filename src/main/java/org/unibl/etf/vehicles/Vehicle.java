package org.unibl.etf.vehicles;

/**
 * Vehicle parent class
 * @author MarkoCerovac
 * @version 0.1.0
 */
public abstract class Vehicle {
    protected String id;
    protected String manufacturer;
    protected String model;

    protected double purchase_cost;

    protected int charge;
    protected OperatingState state;

    public String getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPurchaseCost() {
        return purchase_cost;
    }

    public int getCharge() {
        return charge;
    }

    public OperatingState getState() {
        return state;
    }
}
