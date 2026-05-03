class StaffPassenger extends Passenger {

    StaffPassenger(String name) {
        super(name);
    }

    void checkIn() {
        System.out.println(name + " is checking in through staff priority gate");
    }
}