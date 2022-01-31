package com.jaxwallet.app.ui.widget.entity;

/**
 * Created by James on 17/11/2018.
 * AJ TECHNOLOGIES LTD
 */
public interface ItemClickListener
{
    void onItemClick(String url);
    default void onItemLongClick(String url) { }  //only override this if extra handling is needed
}
