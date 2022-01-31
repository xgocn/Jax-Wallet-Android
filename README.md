[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/AlphaWallet/alpha-wallet-android)

# JAX Wallet - Advanced, Open Source Ethereum Mobile Wallet & dApp Browser for Android

[![Build Status](https://api.travis-ci.com/AlphaWallet/alpha-wallet-android.svg?branch=master)](https://api.travis-ci.com/AlphaWallet/alpha-wallet-android.svg?branch=master)
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg )](https://github.com/AlphaWallet/alpha-wallet-android/graphs/commit-activity)
![GitHub contributors](https://img.shields.io/github/contributors/AlphaWallet/alpha-wallet-android.svg)
[![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/AlphaWallet/alpha-wallet-android/blob/master/LICENSE)
[![codecov](https://codecov.io/gh/AlphaWallet/alpha-wallet-android/branch/master/graph/badge.svg)](https://codecov.io/gh/AlphaWallet/alpha-wallet-android)

JAX Wallet is an open source programmable blockchain apps platform.

JAX Wallet has been used by JAX.

⭐ Star us on GitHub — it helps!

<a href='https://play.google.com/store/apps/details?id=io.stormbird.wallet&hl=en&utm_source=github-readme&pcampaignid=pcampaignidMKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1'><img alt='Get AlphaWallet Open Source Wallet on Google Play' src='https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png' height="100"/></a>

## About JAX Wallet - Features

Easy to use and secure open source Ethereum wallet for Android and iOS, with native ERC20, ERC721 and ERC875 support. JAX Wallet supports networks: Ethereum, BSC, Avalanche, Polygon.

- Beginner Friendly
- Secure Enclave Security
- Web3 dApp Browser
- No hidden fees or tech background needed

### JAX Wallet Is A Token Wallet

JAX Wallet's focus is to provide an interface to interact with Ethereum Tokens in an intuitive, simple and full featured manner. This is what sets us aside from other open source ethereum wallets.

### Philosophy

JAX Wallet is founded by blockchain geeks, business professionals who believe blockchain technology will have a massive impact on the future and change the landscape of technology in general.

We are committed to connecting businesses and consumers with the new digital economic infrastructure through tokenisation. Tokenised rights can be traded on the market and integrated across systems, forming a Frictionless Market and allowing limitless integration with the web.

We want to give businesses the whitelabel tools they need to develop their ethereum wallets, and join the tokenised economy.

# Getting Started

1. [Download](https://developer.android.com/studio/) Android Studio.
2. Clone this repository
3. Obtain a free Infura API key and replace the one in build.gradle
4. Build the project in AndroidStudio or Run `./gradlew build` to install tools and dependencies.

You can also build it from the commandline just like other Android apps. Note that JDK 8 and 11 are the versions supported by Android.

Find more information in our available [documentation](https://github.com/AlphaWallet/alpha-wallet-android/blob/master/docs/overview.md).

## How to Contribute

You can submit feedback and report bugs as Github issues. Please be sure to include your operating system, device, version number, and steps to reproduce reported bugs.

## How to customise the appearance of your wallet fork

If you are forking JAX Wallet, and have a token that you want to be locked visible this can now be done easily. Let's say we want to only show Ethereum Mainnet, and always show the USDC stablecoin.

```
class CustomViewSettings
{
```
...
```
    private static final List<TokenInfo> lockedTokens = Arrays.asList(
            // new TokenInfo(String TokenAddress, String TokenName, String TokenSymbol, int TokenDecimals, boolean isEnabled, long ChainId)
            new TokenInfo("0xa0b86991c6218b36c1d19d4a2e9eb0ce3606eb48", "USD Coin", "USDC", 6, true, EthereumNetworkBase.MAINNET_ID)
    );
    
    private static final List<Integer> lockedChains = Arrays.asList(
            EthereumNetworkBase.MAINNET_ID
    );
```
Further, you may have your own Dapp that sells or uses the USDC that you want your users to use.
```
public static boolean minimiseBrowserURLBar() { return true; } //this removes the ability to enter URL's directly (they can be clicked on within your dapp)
```
```
public abstract class EthereumNetworkBase ...
{
    private static final String DEFAULT_HOMEPAGE = "https://my-awesome-nfts.com/usdc/";
```
If you are forking JAX Wallet and you have a cool Token, please consider donating a small amount of said Token to `JAX Wallet.eth` to help fund continuing development of the main repo.

### Request or submit a feature :postbox:

Would you like to request a feature? Please get in touch with us [Telegram](https://t.me/jax_chat).

If you’d like to contribute code with a Pull Request, please make sure to follow code submission guidelines.

### Spread the word :hatched_chick:

We want to connect businesses and consumers with the new digital economic infrastructure, where everyone can benefit from technology-enabled free markets. Help us spread the word:

To learn more about us, please check our Blog or join the conversation:

- [Telegram](https://t.me/jax_chat)

## Contributors
Thank you to all the contributors! You are awesome.

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="https://www.alphawallet.com"><img src="https://avatars0.githubusercontent.com/u/16630514?v=4" width="100px;" alt=""/><br /><sub><b>James Sangalli</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=James-Sangalli" title="Code">💻</a></td>
    <td align="center"><a href="https://alphawallet.com/"><img src="https://avatars2.githubusercontent.com/u/33795543?v=4" width="100px;" alt=""/><br /><sub><b>Victor Zhang</b></sub></a><br /><a href="#ideas-zhangzhongnan928" title="Ideas, Planning, & Feedback">🤔</a></td>
    <td align="center"><a href="http://hboon.com"><img src="https://avatars2.githubusercontent.com/u/56189?v=4" width="100px;" alt=""/><br /><sub><b>Hwee-Boon Yar</b></sub></a><br /><a href="#ideas-hboon" title="Ideas, Planning, & Feedback">🤔</a></td>
    <td align="center"><a href="https://github.com/AW-STJ"><img src="https://avatars1.githubusercontent.com/u/61957841?v=4" width="100px;" alt=""/><br /><sub><b>AW-STJ</b></sub></a><br /><a href="#projectManagement-AW-STJ" title="Project Management">📆</a></td>
    <td align="center"><a href="https://github.com/tomekalphawallet"><img src="https://avatars1.githubusercontent.com/u/51817359?v=4" width="100px;" alt=""/><br /><sub><b>Tomek Nowak</b></sub></a><br /><a href="#design-tomekalphawallet" title="Design">🎨</a></td>
    <td align="center"><a href="https://github.com/colourful-land"><img src="https://avatars3.githubusercontent.com/u/548435?v=4" width="100px;" alt=""/><br /><sub><b>Weiwu Zhang</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=colourful-land" title="Code">💻</a></td>
  <td align="center"><a href="https://github.com/JamesSmartCell"><img src="https://avatars2.githubusercontent.com/u/12689544?v=4" width="100px;" alt=""/><br /><sub><b>James Brown</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=JamesSmartCell" title="Code">💻</a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://multisender.app"><img src="https://avatars3.githubusercontent.com/u/9360827?v=4" width="100px;" alt=""/><br /><sub><b>Roman Storm</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/issues?q=author%3Arstormsf" title="Bug reports">🐛</a></td>
    <td align="center"><a href="https://github.com/justindg"><img src="https://avatars3.githubusercontent.com/u/17334718?v=4" width="100px;" alt=""/><br /><sub><b>justindg</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=justindg" title="Code">💻</a></td>
    <td align="center"><a href="knowyouralgorithms.wordpress.com"><img src="https://avatars3.githubusercontent.com/u/3628920?v=4" width="100px;" alt=""/><br /><sub><b>Marat Subkhankulov</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=maratsubkhankulov" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/madcake"><img src="https://avatars0.githubusercontent.com/u/133312?v=4" width="100px;" alt=""/><br /><sub><b>Maksim Rasputin</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=madcake" title="Code">💻</a></td>
    <td align="center"><a href="http://www.lucastoledo.co"><img src="https://avatars3.githubusercontent.com/u/17125002?v=4" width="100px;" alt=""/><br /><sub><b>Lucas Toledo</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=hellolucas" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/farrahfazirah"><img src="https://avatars0.githubusercontent.com/u/20555752?v=4" width="100px;" alt=""/><br /><sub><b>Farrah Fazirah</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=farrahfazirah" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/ChintanRathod"><img src="https://avatars2.githubusercontent.com/u/4371780?v=4" width="100px;" alt=""/><br /><sub><b>Chintan Rathod</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=ChintanRathod" title="Code">💻</a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/lyhistory"><img src="https://avatars0.githubusercontent.com/u/1522513?v=4" width="100px;" alt=""/><br /><sub><b>Liu Yue</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=lyhistory" title="Code">💻</a></td>
    <td align="center"><a href="http://petergrassberger.com"><img src="https://avatars1.githubusercontent.com/u/666289?v=4" width="100px;" alt=""/><br /><sub><b>Peter Grassberger</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=PeterTheOne" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/daboooooo"><img src="https://avatars3.githubusercontent.com/u/51960472?v=4" width="100px;" alt=""/><br /><sub><b>daboooooo</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=daboooooo" title="Code">💻</a></td>
    <td align="center"><a href="https://1inch.exchange"><img src="https://avatars2.githubusercontent.com/u/762226?v=4" width="100px;" alt=""/><br /><sub><b>Sergej Kunz</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=deacix" title="Code">💻</a></td>
    <td align="center"><a href="https://www.bidali.com"><img src="https://avatars3.githubusercontent.com/u/7315?v=4" width="100px;" alt=""/><br /><sub><b>Cory Smith</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=corymsmith" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/corymsmith"><img src="https://avatars3.githubusercontent.com/u/13280244?v=4" width="100px;" alt=""/><br /><sub><b>Corey Caplan</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=coreycaplan3" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/rip32700"><img src="https://avatars1.githubusercontent.com/u/15885971?v=4" width="100px;" alt=""/><br /><sub><b>Philipp Rieger</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=rip32700" title="Code">💻</a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/fuseio"><img src="https://avatars3.githubusercontent.com/u/10231448?v=4" width="100px;" alt=""/><br /><sub><b>Tal Beja</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=bejavu" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/asoong"><img src="https://avatars0.githubusercontent.com/u/3453571?v=4" width="100px;" alt=""/><br /><sub><b>Alex Soong</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=asoong" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/appyhour770"><img src="https://avatars1.githubusercontent.com/u/8951009?v=4" width="100px;" alt=""/><br /><sub><b>BTU Protocol</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=appyhour770" title="Code">💻</a></td>
    <td align="center"><a href="https://antsankov.com"><img src="https://avatars3.githubusercontent.com/u/2533512?v=4" width="100px;" alt=""/><br /><sub><b>Alex Tsankov</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=antsankov" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/gravitational"><img src="https://avatars2.githubusercontent.com/u/18430731?v=4" width="100px;" alt=""/><br /><sub><b>Anna R</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=annabambi" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/SpiderStore"><img src="https://avatars3.githubusercontent.com/u/20901836?v=4" width="100px;" alt=""/><br /><sub><b>TamirTian</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=TamirTian" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/SpasiboKojima"><img src="https://avatars1.githubusercontent.com/u/34808650?v=4" width="100px;" alt=""/><br /><sub><b>Andrew</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=SpasiboKojima" title="Code">💻</a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/LingTian"><img src="https://avatars1.githubusercontent.com/u/4249432?v=4" width="100px;" alt=""/><br /><sub><b>Ling</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=LingTian" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/Destiner"><img src="https://avatars1.githubusercontent.com/u/4247901?v=4" width="100px;" alt=""/><br /><sub><b>Timur Badretdinov</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=Destiner" title="Code">💻</a></td>
  </tr>
</table>

<!-- markdownlint-enable -->
<!-- prettier-ignore-end -->
<!-- ALL-CONTRIBUTORS-LIST:END -->

