package SocialNetwork;

import SocialNetwork.DB.SocialRepository;
import SocialNetwork.ShowData.ShowMessageinterface;
import SocialNetwork.Videos.UserData;
import SocialNetwork.Videos.VideoData;

public class Main {
    public static void main(String[] args) {
        SocialRepository db = SocialRepository.getInstance();
        ShowMessageinterface messageinterface=new ShowMessageinterface() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);
            }
        };
        db.setShowMessageInterface(messageinterface);
        VideoData videoData=new VideoData("Waterfall","Nature");
        db.addVideo(new UserData("usmonov_one","Diyorbek Usmonov"),new VideoData("Waterfall","Nature"));
        System.out.println(db);
    }

}
