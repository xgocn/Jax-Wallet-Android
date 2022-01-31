package com.jaxwallet.app.entity;

/**
 * Created by James on 18/03/2019.
 * AJ TECHNOLOGIES LTD
 */
public class UnknownToken
{
    public long chainId;
    public String name;
    public String address;
    public boolean isPopular;

    public UnknownToken(long chainId, String address, boolean isPopular)
    {
        this.chainId = chainId;
        this.address = address;
        this.isPopular = isPopular;
    }
}
