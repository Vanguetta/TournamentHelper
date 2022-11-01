
import java.util.Date;

/**
 *
 * @author Khairil Ilmi
 */
public class Pertandingan {
    
    private Club teamHome;
    private Club teamAway;
    private int teamHomeScore;
    private int teamAwayScore;
    private Date date;
    
    
    public Club getteamHome() {
        return teamHome;
    }
    
    public Club getteamAway() {
        return teamAway;
    }
    
    public int getteamHomeScore(){
        return teamHomeScore;
    }
    
    public int getteamAwayScore(){
        return teamAwayScore;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setteamHome(Club teamHome) {
        this.teamHome = teamHome;
    }
    
    public void setteamAway(Club teamAway) {
        this.teamAway = teamAway;
    }
    
    public void setteamHomeScore(int teamHomeScore) {
        this.teamHomeScore = teamHomeScore;
    }
    
    public void setteamAwayScore(int teamAwayScore) {
        this.teamAwayScore = teamAwayScore;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
}
