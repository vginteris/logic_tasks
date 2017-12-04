package vending_machine;

import java.util.Scanner;

public class CoinMachine {
    MachineModel machineModel = new MachineModel();

    public void insertCointToMachine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much will you put coin 1, 5, 10, 25?");
        machineModel.setOneCoin(scanner.nextInt());
        machineModel.setFiveCon(scanner.nextInt());
        machineModel.setTenCoin(scanner.nextInt());
        machineModel.setTwentyfiveCoin(scanner.nextInt());
    }

    public int countInsertCoint(){
        int allMoney = 0;
        allMoney += machineModel.getOneCoin();
        allMoney += machineModel.getFiveCon()*5;
        allMoney += machineModel.getTenCoin()*10;
        allMoney += machineModel.getTwentyfiveCoin()*25;
        return allMoney;
    }
}
