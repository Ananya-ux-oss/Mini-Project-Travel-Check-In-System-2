class RegularPassenger extends Passenger {

    RegularPassenger(String name) {
        super(name);
    }

    void checkIn() {
        System.out.println(name + " is checking in through normal queue");
    }
}