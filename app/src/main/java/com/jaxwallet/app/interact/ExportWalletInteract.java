package com.jaxwallet.app.interact;

import android.util.Log;

import com.jaxwallet.app.BuildConfig;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.entity.Wallet;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class ExportWalletInteract {

    private final WalletRepositoryType walletRepository;

    public ExportWalletInteract(WalletRepositoryType walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Single<String> export(Wallet wallet, String keystorePassword, String backupPassword) {
        if (BuildConfig.DEBUG) Log.d("RealmDebug", "export + " + wallet.address);
        return walletRepository
                    .exportWallet(wallet, keystorePassword, backupPassword)
                .observeOn(AndroidSchedulers.mainThread());
    }
}
