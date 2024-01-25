package SocialNetwork.Videos;

public class UserData {
    private final String userName;
    private final String nickName;

    public UserData(String userName, String nickName) {
        this.userName = userName;
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public String getNickName() {
        return nickName;
    }
}
