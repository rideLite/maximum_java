package HomeWorks.hw_6;

public final class Car extends Motortransport {
    private String brand;
    private String model;

    private Car(int wheelCount, int maxSpeed, String engineType, Builder builder) {
        super(wheelCount, maxSpeed, engineType);
        this.brand = builder.brand;
        this.model = builder.model;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public void blockTheDoors() {
        System.out.println("Двери автомобиля заблокированы");
    }

    @Override
    public void service() {
        carCheck();
        super.service();
    }
    private void carCheck(){
        System.out.println("Была произведена ревизия автомобиля марки " + brand + " модели " + model);
    }

    //---- БИЛДЕР КЛАСС------------------------------------------------------------------
    public static class Builder  {
        private String engineType;
        private int wheelCount;
        private int maxSpeed;
        private String brand;
        private String model;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }
        public Builder wheelCount(int wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }
        public Builder maxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Car build() {
            return new Car(this.wheelCount, this.maxSpeed, this.engineType,  this);
        }
    }
}

