package com.example.ericpc.youtubeintegration.feature;

public class PlaylistDetail {
    String VideoName;
    String VideoDesc;
    String URL;
    String VideoId;     //PlaylistId


    public void setVideoName(String VideoName){
        this.VideoName=VideoName;
    }
    public String getVideoName(){
        return VideoName;
    }

//    public void setVideoDesc(String VideoDesc){
//        this.VideoDesc=VideoDesc;
//    }
//
//    public String getVideoDesc(){
//        return VideoDesc;
//    }

    public void setURL(String URL){
        this.URL=URL;
    }
    public String getURL(){
        return URL;
    }

    public void setVideoId(String VideoId){
        this.VideoId=VideoId;
    }
    public String getVideoId(){
        return VideoId;
    }
}
