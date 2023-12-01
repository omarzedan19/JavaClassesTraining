public class FootballTeam {
    String name;
    String country;
    String[] players;
    int teamRanking;
    public FootballTeam(String name, String country, String[] players, int teamRanking) {
        this.name = name;
        this.country = country;
        this.players = players;
        this.teamRanking = teamRanking;
    }

    public void ChangeRating(int NewRatting){
        this.teamRanking=NewRatting;
    }

    public void ReplacePlayer (String New , String Old){
        for (int i=0 ; i<=this.players.length ; i++){
            if ( players[i].equals(Old)){
                players[i] = New;
                break;
            }
        }
    }
}
