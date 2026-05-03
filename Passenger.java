class Passenger {
    String name;

    Passenger(String name) {
        this.name = name;
    }

    void checkIn() {
        System.out.println(name + " is checking in (Normal process)");
    }
}