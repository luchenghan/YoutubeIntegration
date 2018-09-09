package com.example.ericpc.youtubeintegration.feature;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.ArrayList;

public class CustomPlaylistAdapter extends BaseAdapter {
    Activity activity;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();
    private LayoutInflater inflater;
    ArrayList<PlaylistDetail> playlistitemDetailArrayLis;

    public CustomPlaylistAdapter(Activity activity, ArrayList<PlaylistDetail> playlistitemDetailArrayList) {
        this.activity=activity;
        this.playlistitemDetailArrayLis=playlistitemDetailArrayList;
    }
    public int getCount() {
        return this.playlistitemDetailArrayLis.size();
    }

    public Object getItem(int i) {
        return this.playlistitemDetailArrayLis.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if (this.inflater == null) {
            this.inflater = (LayoutInflater) this.activity.getLayoutInflater();
            // getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = this.inflater.inflate(R.layout.playlist, null);
        }
        if (this.imageLoader == null) {
            this.imageLoader = AppController.getInstance().getImageLoader();
        }
        NetworkImageView networkImageView = (NetworkImageView) convertView.findViewById(R.id.playList_image);
        final TextView imgtitle = (TextView) convertView.findViewById(R.id.playList_title);
        // final TextView imgdesc = (TextView) convertView.findViewById(R.id.video_descriptio);
        final TextView tvURL=(TextView)convertView.findViewById(R.id.tv_url);
        //final  TextView tvVideoID=(TextView)convertView.findViewById(R.id.tv_videoId);



        PlaylistDetail singleton = (PlaylistDetail) this.playlistitemDetailArrayLis.get(i);
        networkImageView.setImageUrl(singleton.getURL(), this.imageLoader);
        // tvVideoID.setText(singleton.getVideoId());
        imgtitle.setText(singleton.getVideoName());
        // imgdesc.setText(singleton.getVideoDesc());
        return convertView;
    }
}
