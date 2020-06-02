import java.util.ArrayList;

public class Team<T extends Players> implements Comparable <Team<T>> {
    private String teamName;
    int played = 0;
    int win = 0;
    int loss = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " has been added to team");
            return true;
        }
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if (theirScore > ourScore) {
            win++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            loss++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getTeamName() + message + opponent.getTeamName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (win * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }else{
            return 0;
        }

    }
}
