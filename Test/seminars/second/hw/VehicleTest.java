package seminars.second.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void instanceOfClassCarisClassVehicle(){
        Car car = new Car("Мерседес","190SL",12);
        assertThat(car instanceof Vehicle);

    }

    @Test
    void carHasTwoWheels(){
        Car car = new Car("Мерседес","190SL",1995);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleHasTwoWheels(){
        Motorcycle motorcycle = new Motorcycle("Ij","350",1951);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carTestDriveSpeed(){
        Car car = new Car("Мерседес","190SL",1995);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void motorcycleTestDriveSpeed(){
        Motorcycle motorcycle = new Motorcycle("Ij","350",1951);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void carParkSpeed(){
        Car car = new Car("Мерседес","190SL",1995);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleParkSpeed(){
        Motorcycle motorcycle = new Motorcycle("Ij","350",1951);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }





}
