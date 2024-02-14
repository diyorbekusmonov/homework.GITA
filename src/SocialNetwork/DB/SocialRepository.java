package SocialNetwork.DB;

import SocialNetwork.ShowData.ShowInfoInterface;
import SocialNetwork.ShowData.ShowMessageinterface;
import SocialNetwork.Videos.UserData;
import SocialNetwork.Videos.VideoData;


import java.util.LinkedList;
import java.util.List;

public class SocialRepository {
    private ShowMessageinterface showMessageinterface = null;
    private ShowInfoInterface showInfoInterface = null;
    private List<VideoData> videoDB = new LinkedList<>();
    private static SocialRepository instance = null;

    public static SocialRepository getInstance() {
        if (instance == null) {
            instance = new SocialRepository();
        }
        return instance;
    }


    public void setShowInfoInterface(ShowInfoInterface showListener) {
        if (showInfoInterface == null) {
            this.showInfoInterface = showListener;
        }
    }

    public void setShowMessageInterface(ShowMessageinterface messageListener) {
        if (showMessageinterface == null) {
            this.showMessageinterface = messageListener;
        }
    }

    @Override
    public String toString() {
        return "SocialRepository{videoDB=" + videoDB +
                '}';
    }

    public void addVideo(UserData user, VideoData videoData) {
        // if (!(videoDB.equals(user))) {
        videoDB.add(videoData);
        showMessageinterface.showMessage("Video muvaffaqiyatli joylandi");
        //showMessageinterface.showMessage("Bu video mavjud");
        showMessageinterface = null;

    }
}

