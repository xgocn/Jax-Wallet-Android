package com.alphawallet.app.entity;

import com.alphawallet.app.C;
import com.alphawallet.app.entity.tokens.Token;
import com.alphawallet.app.entity.tokens.TokenCardMeta;
import com.alphawallet.app.entity.tokens.TokenInfo;
import com.alphawallet.ethereum.EthereumNetworkBase;

import java.util.Arrays;
import java.util.List;

import static com.alphawallet.ethereum.EthereumNetworkBase.MAINNET_ID;

public class CustomViewSettings
{
    private static final long primaryChain = MAINNET_ID;
    private static final String primaryChainName = C.ETHEREUM_NETWORK_NAME;

    //You can use the settings in this file to customise the wallet appearance

    //Ensures certain tokens are always visible, even if zero balance (see also 'showZeroBalance()' below).
    //See also lockedChains. You can also lock the chains that are displayed on.
    //If you leave the locked chains empty, the token will appear if the chain is selected
    private static final List<TokenInfo> lockedTokens = Arrays.asList(
            // new TokenInfo(String TokenAddress, String TokenName, String TokenSymbol, int TokenDecimals, boolean isEnabled, long ChainId)
            //new TokenInfo("0xa0b86991c6218b36c1d19d4a2e9eb0ce3606eb48", "USD Coin", "USDC", 6, true, EthereumNetworkBase.MAINNET_ID),
            //new TokenInfo("0x6C8c6b02E7b2BE14d4fA6022Dfd6d75921D90E4E", "Compound BAT", "CBAT", 8, true, EthereumNetworkBase.MAINNET_ID)
            new TokenInfo("0xca1262e77fb25c0a4112cfc9bad3ff54f617f2e6", "Wrapped JAXNET", "WJXN", 0, true, EthereumNetworkBase.BINANCE_MAIN_ID),
            new TokenInfo("0xe37987197309da313f733130bcd6cb750c43fb83", "Binance USD", "BUSD", 18, true, EthereumNetworkBase.BINANCE_TEST_ID),
            new TokenInfo("0x01215d5b86219532B10480875F7384fb37ee9b29", "Wrapped Jaxnet", "WJXN", 0, true, EthereumNetworkBase.BINANCE_TEST_ID),
            new TokenInfo("0xBCA789602aDD7d7eeb749CC507e00F3bA3FCBCc9", "Wrapped JAX", "WJAX", 0, true, EthereumNetworkBase.BINANCE_TEST_ID),
            new TokenInfo("0x5a27eb16B36B6b60CC406f96F9983de94313CCc7", "JAX Rupee", "JINR", 0, true, EthereumNetworkBase.BINANCE_TEST_ID),
            new TokenInfo("0xffDaE29C05E41EEf9F633054A5bdD2f616dC3BC4", "JAX Dollar", "JUSD", 0, true, EthereumNetworkBase.BINANCE_TEST_ID)
//            new TokenInfo("0x1badca0c7b0687a8d20035df371756c3f1d2471e", "Binance USD", "BUSD", 18, true, EthereumNetworkBase.BINANCE_TEST_ID),
//            new TokenInfo("0xc43860f43daa9448c483c103af5c851ec5b6ad3e", "Wrapped Jaxnet", "WJXN", 0, true, EthereumNetworkBase.BINANCE_TEST_ID),
//            new TokenInfo("0x25f2efe24d627fc3ddaf07f9a47310286f172f07", "Wrapped JAX", "WJAX", 0, true, EthereumNetworkBase.BINANCE_TEST_ID),
//            new TokenInfo("0xb04357981b2edb608723fc105fef0b6a7096de80", "JAX Rupee", "JINR", 0, true, EthereumNetworkBase.BINANCE_TEST_ID),
//            new TokenInfo("0xc9df73ad8342be29f2155d0b0edd3afa3b303b32", "JAX Dollar", "JUSD", 0, true, EthereumNetworkBase.BINANCE_TEST_ID)
    );

    //List of chains that wallet can show
    //If blank, enable the user filter select dialog, if there are any entries here, the select network dialog is disabled
    //Note: you should always enable the chainId corresponding to the chainIDs in the lockedTokens.
    private static final List<Long> lockedChains = Arrays.asList(
//            EthereumNetworkBase.MAINNET_ID, //EG only show Main, xdai, classic and two testnets. Don't allow user to select any others
            //EthereumNetworkBase.XDAI_ID,
            //EthereumNetworkBase.RINKEBY_ID, //You can mix testnets and mainnets, but probably shouldn't as it may result in people getting scammed
            //EthereumNetworkBase.GOERLI_ID,
//            EthereumNetworkBase.BINANCE_MAIN_ID,
//            EthereumNetworkBase.AVALANCHE_ID
    );

    //TODO: Wallet can only show the above tokens
    private static final boolean onlyShowTheseTokens = true;

    public static List<TokenInfo> getLockedTokens()
    {
        return lockedTokens;
    }

    public static List<Long> getLockedChains()
    {
        return lockedChains;
    }

    //TODO: Not yet implemented; code will probably live in TokensService & TokenRealmSource
    public static boolean onlyShowLockedTokens()
    {
        return onlyShowTheseTokens;
    }

    //Does main wallet page show tokens with zero balance? NB: any 'Locked' tokens above will always be shown
    public static boolean showZeroBalance() { return false; }

    public static boolean tokenCanBeDisplayed(TokenCardMeta token)
    {

        return token.type == ContractType.ETHEREUM || token.isEnabled || isLockedToken(token.getChain(), token.getAddress());
    }

    public static boolean isLockedToken(long chainId, String contractAddress)
    {
        for (TokenInfo tInfo : lockedTokens)
        {
            if (tInfo.chainId == chainId && tInfo.address.equalsIgnoreCase(contractAddress)) return true;
        }

        return false;
    }

    public static ContractType checkKnownTokens(TokenInfo tokenInfo)
    {
        return ContractType.OTHER;
    }

    public static boolean showContractAddress(Token token)
    {
        return true;
    }

    public static long startupDelay()
    {
        return 0;
    }

    public static int getImageOverride()
    {
        return 0;
    }

    //Switch off dapp browser
    public static boolean hideDappBrowser()
    {
        return false;
    }

    //Hides the filter tab bar at the top of the wallet screen (ALL/CURRENCY/COLLECTIBLES)
    public static boolean hideTabBar()
    {
        return false;
    }

    //Use to switch off direct transfer, only use magiclink transfer
    public static boolean hasDirectTransfer()
    {
        return true;
    }

    //Allow multiple wallets (true) or single wallet mode (false)
    public static boolean canChangeWallets()
    {
        return true;
    }

    //Hide EIP681 generation (Payment request, generates a QR code another wallet user can scan to have all payment fields filled in)
    public static boolean hideEIP681() { return false; }

    //In main wallet menu, if wallet allows adding new tokens
    public static boolean canAddTokens() { return true; }

    //Implement minimal dappbrowser with no URL bar. You may want this if you want your browser to point to a specific website and only
    // allow navigation within that website
    // use this setting in conjunction with changing DEFAULT_HOMEPAGE in class EthereumNetworkBase
    public static boolean minimiseBrowserURLBar() { return false; }

    //Allow showing token management view
    public static boolean showManageTokens() { return true; }

    //Show all networks in Select Network screen. Set to `true` to show only filtered networks.
    public static boolean showAllNetworks() { return false; }

    public static String getDecimalFormat() { return "0.####E0"; }

    public static int getDecimalPlaces() { return 5; }

    //set if the Input Amount defaults to Fiat or Crypto
    public static boolean inputAmountFiatDefault()
    {
        return false;
    }
}
