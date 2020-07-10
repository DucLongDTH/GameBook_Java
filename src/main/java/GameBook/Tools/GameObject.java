/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameBook.Tools;

/**
 *
 * @author Admin
 */
public class GameObject {

    private int GameID;
    private String GameTitle;
    private String ReleaseDate;
    private String Version;
    private String Price;

    public GameObject() {
        GameID = 0;
        GameTitle = ReleaseDate = Version = Price = "";
    }

    public GameObject(int gameID, String gameTitle, String releaseDate, String version, String price) {
        GameID = gameID;
        GameTitle = gameTitle;
        ReleaseDate = releaseDate;
        Version = version;
        Price = price;
    }

    public int getGameID() {
        return GameID;
    }

    public void setGameID(int GameID) {
        this.GameID = GameID;
    }

    public String getGameTitle() {
        return GameTitle;
    }

    public void setGameTitle(String GameTitle) {
        this.GameTitle = GameTitle;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
    
}
