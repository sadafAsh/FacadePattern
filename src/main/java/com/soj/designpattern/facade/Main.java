package com.soj.designpattern.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        int ch;
        do {
            logger.info("1.Iphone");
            logger.info("2.Nokia");
            logger.info("3.Oppo");
            logger.info("4.Exit");
            logger.info("enter a choice");
            Scanner scanner = new Scanner(System.in);
            ch = scanner.nextInt();
            ShopKeeper shopKeeper = new ShopKeeper();
            switch (ch) {
                case 1:
                    shopKeeper.iphoneSale();
                    break;
                case 2:
                    shopKeeper.nokiaSale();
                    break;
                case 3:
                    shopKeeper.oppoSale();
                    break;
                default:
                    logger.debug("Nothing is purchased");
                    break;
            }
        } while (ch != 4);

    }
}
