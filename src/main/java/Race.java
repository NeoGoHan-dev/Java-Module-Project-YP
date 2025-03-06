public class Race {
    private String leaderName = "";
    private int leaderDistance = 0;

    public void updateLeader(Automobile car) {
        int distance = 24 * car.getSpeed();

        if (distance > leaderDistance) {
            leaderDistance = distance;
            leaderName = car.getName();
        }
    }

    public String getLeaderName() {
        return leaderName;
    }
}

