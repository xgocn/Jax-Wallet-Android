package com.jaxwallet.app.di;

import com.jaxwallet.app.ui.ActivityFragment;
import com.jaxwallet.app.ui.AddCustomRPCNetworkActivity;
import com.jaxwallet.app.ui.AddTokenActivity;
import com.jaxwallet.app.ui.AdvancedSettingsActivity;
import com.jaxwallet.app.ui.AssetDisplayActivity;
import com.jaxwallet.app.ui.BackupKeyActivity;
import com.jaxwallet.app.ui.DappBrowserFragment;
import com.jaxwallet.app.ui.Erc1155Activity;
import com.jaxwallet.app.ui.Erc1155AssetDetailActivity;
import com.jaxwallet.app.ui.Erc1155AssetListActivity;
import com.jaxwallet.app.ui.Erc1155AssetSelectActivity;
import com.jaxwallet.app.ui.Erc1155AssetsFragment;
import com.jaxwallet.app.ui.Erc1155InfoFragment;
import com.jaxwallet.app.ui.Erc20DetailActivity;
import com.jaxwallet.app.ui.FunctionActivity;
import com.jaxwallet.app.ui.GasSettingsActivity;
import com.jaxwallet.app.ui.HelpActivity;
import com.jaxwallet.app.ui.HomeActivity;
import com.jaxwallet.app.ui.ImportTokenActivity;
import com.jaxwallet.app.ui.ImportWalletActivity;
import com.jaxwallet.app.ui.MyAddressActivity;
import com.jaxwallet.app.ui.NameThisWalletActivity;
import com.jaxwallet.app.ui.NewSettingsFragment;
import com.jaxwallet.app.ui.RedeemAssetSelectActivity;
import com.jaxwallet.app.ui.RedeemSignatureDisplayActivity;
import com.jaxwallet.app.ui.SelectNetworkActivity;
import com.jaxwallet.app.ui.SelectNetworkFilterActivity;
import com.jaxwallet.app.ui.SellDetailActivity;
import com.jaxwallet.app.ui.SendActivity;
import com.jaxwallet.app.ui.SplashActivity;
import com.jaxwallet.app.ui.TokenActivity;
import com.jaxwallet.app.ui.TokenActivityFragment;
import com.jaxwallet.app.ui.TokenDetailActivity;
import com.jaxwallet.app.ui.TokenFunctionActivity;
import com.jaxwallet.app.ui.TokenManagementActivity;
import com.jaxwallet.app.ui.TokenScriptManagementActivity;
import com.jaxwallet.app.ui.TransactionDetailActivity;
import com.jaxwallet.app.ui.TransactionSuccessActivity;
import com.jaxwallet.app.ui.TransferNFTActivity;
import com.jaxwallet.app.ui.TransferTicketDetailActivity;
import com.jaxwallet.app.ui.WalletActionsActivity;
import com.jaxwallet.app.ui.WalletConnectActivity;
import com.jaxwallet.app.ui.WalletConnectSessionActivity;
import com.jaxwallet.app.ui.WalletFragment;
import com.jaxwallet.app.ui.WalletsActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModule {
	@ActivityScope
	@ContributesAndroidInjector(modules = SplashModule.class)
	abstract SplashActivity bindSplashModule();

	@ActivityScope
	@ContributesAndroidInjector(modules = AccountsManageModule.class)
	abstract WalletsActivity bindManageWalletsModule();

	@ActivityScope
	@ContributesAndroidInjector(modules = ImportModule.class)
	abstract ImportWalletActivity bindImportWalletModule();

	@ActivityScope
	@ContributesAndroidInjector(modules = TransactionDetailModule.class)
	abstract TransactionDetailActivity bindTransactionDetailModule();

	@ActivityScope
	@ContributesAndroidInjector(modules = SendModule.class)
	abstract SendActivity bindSendModule();

	@ActivityScope
	@ContributesAndroidInjector(modules = TransactionSuccessModule.class)
	abstract TransactionSuccessActivity bindTransactionSuccessModule();

	@ActivityScope
	@ContributesAndroidInjector(modules = GasSettingsModule.class)
	abstract GasSettingsActivity bindGasSettingsModule();

	@ActivityScope
	@ContributesAndroidInjector(modules = AddTokenModule.class)
	abstract AddTokenActivity bindAddTokenActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = RedeemSignatureDisplayModule.class)
	abstract RedeemSignatureDisplayActivity bindSignatureDisplayActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = TokenFunctionModule.class)
	abstract AssetDisplayActivity bindAssetDisplayActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = SellDetailModule.class)
	abstract SellDetailActivity bindSellDetailsActivity();

	@FragmentScope
	@ContributesAndroidInjector(modules = NewSettingsModule.class)
	abstract NewSettingsFragment bindNewSettingsFragment();

	@FragmentScope
	@ContributesAndroidInjector(modules = ActivityModule.class)
	abstract ActivityFragment bindActivityFragment();

	@ActivityScope
	@ContributesAndroidInjector(modules = RedeemAssetSelectModule.class)
	abstract RedeemAssetSelectActivity bindRedeemTokenSelectActivity();

	@FragmentScope
	@ContributesAndroidInjector(modules = WalletModule.class)
	abstract WalletFragment bindWalletFragment();

	@ActivityScope
	@ContributesAndroidInjector(modules = HomeModule.class)
	abstract HomeActivity bindHomeActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = ImportTokenModule.class)
	abstract ImportTokenActivity bindImportTokenActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = TransferTicketDetailModule.class)
	abstract TransferTicketDetailActivity bindTransferTicketDetailActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = HelpModule.class)
	abstract HelpActivity bindHelpActivity();

	@FragmentScope
	@ContributesAndroidInjector(modules = DappBrowserModule.class)
	abstract DappBrowserFragment bindDappBrowserFragment();

	@ActivityScope
	@ContributesAndroidInjector(modules = Erc20DetailModule.class)
	abstract Erc20DetailActivity bindErc20DetailActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = WalletActionsModule.class)
	abstract WalletActionsActivity bindWalletActionsActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = BackupKeyModule.class)
	abstract BackupKeyActivity bindBackupKeyActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = MyAddressModule.class)
	abstract MyAddressActivity bindMyAddressActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = TokenFunctionModule.class)
	abstract TokenFunctionActivity bindTokenFunctionActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = TokenFunctionModule.class)
	abstract FunctionActivity bindFunctionActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = TokenFunctionModule.class)
	abstract TokenDetailActivity bindTokenDetailActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = TokenFunctionModule.class)
	abstract TokenActivity bindTokenActivity();

	@ContributesAndroidInjector(modules = SelectNetworkModule.class)
	abstract SelectNetworkActivity bindSelectNetworkActivity();

	@ContributesAndroidInjector(modules = CustomNetworkModule.class)
	abstract AddCustomRPCNetworkActivity bindAddCustomRPCNetworkActivity();

	@ContributesAndroidInjector(modules = SelectNetworkFilterModule.class)
	abstract SelectNetworkFilterActivity bindSelectNetworkFilterActivity();

	@ContributesAndroidInjector(modules = TokenManagementModule.class)
	abstract TokenManagementActivity bindTokenManagementActivity();

	@ContributesAndroidInjector(modules = AdvancedSettingsModule.class)
	abstract AdvancedSettingsActivity bindAdvancedSettingsActivity();

    @ActivityScope
	@ContributesAndroidInjector(modules = TokenScriptManagementModule.class)
	abstract TokenScriptManagementActivity bindTokenScriptManagementActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = WalletConnectModule.class)
	abstract WalletConnectActivity bindWalletConnectActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = WalletConnectModule.class)
	abstract WalletConnectSessionActivity bindWalletConnectSessionActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = Erc1155Module.class)
    abstract Erc1155Activity bindErc1155Activity();

    @ActivityScope
    @ContributesAndroidInjector(modules = Erc1155AssetDetailModule.class)
    abstract Erc1155AssetDetailActivity bindErc1155AssetDetailActivity();

    @FragmentScope
    @ContributesAndroidInjector(modules = Erc1155InfoModule.class)
    abstract Erc1155InfoFragment bindErc1155InfoFragment();

    @FragmentScope
    @ContributesAndroidInjector(modules = Erc1155AssetsModule.class)
    abstract Erc1155AssetsFragment bindErc1155AssetsFragment();

    @FragmentScope
    @ContributesAndroidInjector(modules = Erc1155AssetSelectModule.class)
    abstract Erc1155AssetSelectActivity bindErc1155AssetSelectActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = Erc1155AssetListModule.class)
    abstract Erc1155AssetListActivity bindErc1155AssetListActivity();

    @FragmentScope
    @ContributesAndroidInjector(modules = TokenActivityModule.class)
    abstract TokenActivityFragment bindTokenActivityFragment();

	@FragmentScope
	@ContributesAndroidInjector(modules = TransferTicketDetailModule.class)
	abstract TransferNFTActivity bindTransferNFTActivity();

	@ActivityScope
	@ContributesAndroidInjector(modules = NameThisWalletModule.class)
	abstract NameThisWalletActivity bindNameThisWalletActivity();
}
