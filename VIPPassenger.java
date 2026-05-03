class VIPPassenger extends Passenger {

    VIPPassenger(String name) {
        super(name);
    }

    void checkIn() {
        System.out.println(name + " is checking in through VIP fast track");
    }
}