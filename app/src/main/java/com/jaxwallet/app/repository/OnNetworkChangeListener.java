package com.jaxwallet.app.repository;

import com.jaxwallet.app.entity.NetworkInfo;

public interface OnNetworkChangeListener {
	void onNetworkChanged(NetworkInfo networkInfo);
}
