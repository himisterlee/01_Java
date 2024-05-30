package com.ohgiraffers.api.object.car;

public class Car {
    private String carName;
    private String carColor;
    private int engineCC;

    public Car() {
    }

    public Car(String sonata, String black, int i) {
        this.carName = sonata;
        this.carColor = black;
        this.engineCC = i;

    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    @Override
    public int hashCode() {
    int result = 1;

    final int PRIME = 31;

    result = PRIME * result + this.carName.hashCode();
    result = PRIME * result + this.carColor.hashCode();
    result = PRIME * result + this.engineCC;

    return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;

        return this.carName.equals(car.carName) &&
                this.carColor.equals(car.carColor) &&
                this.engineCC == car.engineCC;
    }
}
