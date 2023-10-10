package com.example.wallpaperapp;

import androidx.leanback.widget.AbstractDetailsDescriptionPresenter;

public class DetailsDescriptionPresenter extends AbstractDetailsDescriptionPresenter {

    @Override
    protected void onBindDescription(ViewHolder viewHolder, Object item) {
        Wallpaper wallpaper = (Wallpaper) item;

        if (wallpaper != null) {
            viewHolder.getTitle().setText(wallpaper.getTitle());
            viewHolder.getSubtitle().setText(wallpaper.getStudio());
            viewHolder.getBody().setText(wallpaper.getDescription());
        }
    }
}