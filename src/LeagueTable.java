import java.util.ArrayList;

public class LeagueTable <T extends Team> {


    public LeagueTable() {
    }

    private ArrayList<T> sportsTeams = new ArrayList<>();

    public boolean addTeam(T team){
        if(sportsTeams.contains(team)){
            return false;
        }else{
            sportsTeams.add(team);
            return true;
        }
    }

    public void printList(){
//        Collections.sort(sportsTeams);
        for(T team : sportsTeams){
            System.out.println(team.getTeamName());
        }
    }


}
