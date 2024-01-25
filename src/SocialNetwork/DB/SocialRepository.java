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

    private boolean hasShowListener() {
        return showInfoInterface != null;
    }

    private boolean hasMessageListener() {
        return showMessageinterface != null;
    }

    public void setShowInfoInterface(ShowInfoInterface showListener) {
        if (!hasShowListener()) {
            this.showInfoInterface = showListener;
        }
    }

    public void setShowMessageInterface(ShowMessageinterface messageListener) {
        if (!hasMessageListener()) {
            this.showMessageinterface = messageListener;
        }
    }

    public void addVideo(UserData user, VideoData videoData) {
        if (!videoData.equals(videoDB)){
            videoDB.add(videoData);
            setShowMessageInterface(showMessageinterface.showMessage("Video muvaffaqiyatli joylandi"));
        }else setShowMessageInterface(showMessageinterface.showMessage("Bu video mavjud"));
    }
}
