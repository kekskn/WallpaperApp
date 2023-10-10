package com.example.wallpaperapp;

import android.net.Uri;
import android.os.Bundle;

import androidx.leanback.app.VideoSupportFragment;
import androidx.leanback.app.VideoSupportFragmentGlueHost;
import androidx.leanback.media.MediaPlayerAdapter;
import androidx.leanback.media.PlaybackTransportControlGlue;
import androidx.leanback.widget.PlaybackControlsRow;

/**
 * Handles video playback with media controls.
 */
public class PlaybackVideoFragment extends VideoSupportFragment {

    private PlaybackTransportControlGlue<MediaPlayerAdapter> mTransportControlGlue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Wallpaper wallpaper =
                (Wallpaper) getActivity().getIntent().getSerializableExtra(DetailsActivity.WALLPAPER);

        //VideoSupportFragmentGlueHost glueHost =
                //new VideoSupportFragmentGlueHost(PlaybackVideoFragment.this);

        MediaPlayerAdapter playerAdapter = new MediaPlayerAdapter(getActivity());
        playerAdapter.setRepeatAction(PlaybackControlsRow.RepeatAction.INDEX_NONE);

        mTransportControlGlue = new PlaybackTransportControlGlue<>(getActivity(), playerAdapter);
        //mTransportControlGlue.setHost(glueHost);
        mTransportControlGlue.setTitle(wallpaper.getTitle());
        //mTransportControlGlue.setSubtitle(wallpaper.getDescription());
        mTransportControlGlue.playWhenPrepared();
       // playerAdapter.setDataSource(Uri.parse(wallpaper.getVideoUrl()));
    }

    //@Override
   /* public void onPause() {
        super.onPause();
        if (mTransportControlGlue != null) {
            mTransportControlGlue.pause();
        }
    }*/
}