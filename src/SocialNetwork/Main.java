package SocialNetwork;

import SocialNetwork.DB.SocialRepository;
import SocialNetwork.Videos.UserData;
import SocialNetwork.Videos.VideoData;

public class Main {
    public static void main(String[] args) {
        SocialRepository db = SocialRepository.getInstance();
        VideoData videoData=new VideoData("Waterfall","Nature");
        db.addVideo(new UserData("usmonov_one","Diyorbek Usmonov"),new VideoData("Waterfall","Nature"));
    }

}
