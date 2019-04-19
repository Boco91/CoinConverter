package com.example.coinconverter;

import com.example.coinconverter.Remote.CoinService;
import com.example.coinconverter.Remote.RetrofitClient;

public class Common {
    private static final String API_URL ="https://min-api.cryptocompare.com";
    private static final String BASE_URL="https://cryptocompare.com";

    public static final String ETH_IMAGE = new StringBuffer(BASE_URL).append("/media/20275/eth.png").toString();
    public static final String BTC_IMAGE = new StringBuffer(BASE_URL).append("/media/19633/btc.png").toString();
    public static final String ETC_IMAGE = new StringBuffer(BASE_URL).append("/media/20275/etc2.png").toString();
    public static final String LTC_IMAGE = new StringBuffer(BASE_URL).append("/media/19782/litecoin-logo.png").toString();
    public static final String XRP_IMAGE = new StringBuffer(BASE_URL).append("/media/19972/ripple.png").toString();
    public static final String XMR_IMAGE = new StringBuffer(BASE_URL).append("/media/19969/xmr.png").toString();
    public static final String DASH_IMAGE = new StringBuffer(BASE_URL).append("/media/20026/dash.png").toString();
    public static final String MAID_IMAGE = new StringBuffer(BASE_URL).append("/media/35224/maid.png").toString();
    public static final String AUR_IMAGE = new StringBuffer(BASE_URL).append("/media/19608/aur.png").toString();
    public static final String XEM_IMAGE = new StringBuffer(BASE_URL).append("/media/20490/xem.png").toString();


    public static CoinService getCoinService(){

        return RetrofitClient.getClient(API_URL).create(CoinService.class);
    }
}
