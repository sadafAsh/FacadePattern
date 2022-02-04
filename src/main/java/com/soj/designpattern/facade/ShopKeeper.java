package com.soj.designpattern.facade;

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop nokia;
    private MobileShop oppo;

    public ShopKeeper() {
        this.iphone = new IPhone();
        this.nokia = new Nokia();
        this.oppo = new Oppo();
    }

    public void iphoneSale() {
        iphone.modelNo();
        iphone.price();
    }

    public void nokiaSale() {
        nokia.modelNo();
        nokia.price();
    }

    public void oppoSale() {
        oppo.modelNo();
        oppo.price();
    }
}
