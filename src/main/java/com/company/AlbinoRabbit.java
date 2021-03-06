package com.company;

import java.io.IOException;

public class AlbinoRabbit extends OrdinaryRabbit {

    public static int AlbinoCount = 0;

    public AlbinoRabbit() throws IOException {
        AlbinoCount++;
        myImage = Habitat.getAlbinoRabbitPic();
        lifeTime = (int) ((Math.random() * 40) + 1);
        speed = 2;
    }

    @Override
    public void move() {
        moveRight();
    }

    @Override
    public boolean isAppear() {
        boolean isAppear = lifeTime-- > 0;
        if (!isAppear) {
            AlbinoCount--;
            OrdinaryCount--;
        }
        return isAppear;
    }
}